package com.skilllogic.springmvc_xml.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.skilllogic.springmvc_xml.model.Product;
import com.skilllogic.springmvc_xml.service.IProductService;

public class ProductSaveController implements Controller{
	
	private IProductService iProductService;

	//Setter injection
	public void setiProductService(IProductService iProductService) {
		this.iProductService = iProductService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		String name = request.getParameter("pname");
		String qty = request.getParameter("pqty");
		int pqty = Integer.parseInt(qty);
		String price = request.getParameter("pprice");
		double pprice = Double.parseDouble(price);
		String desc = request.getParameter("pdesc");
		
		Product product = new 	Product();
		product.setName(name);
		product.setQty(pqty);
		product.setPrice(pprice);
		product.setDesc(desc);
		
		//Call Service Layer
		boolean flag = iProductService.savePorduct(product); //calling method
		if(flag)
			modelAndView.setViewName("success"); //prefix+ page name + suffix
		else
			modelAndView.setViewName("failure"); //WEB-INF/pages/failure.jsp
		return modelAndView;
	}

}
