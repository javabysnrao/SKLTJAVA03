package com.skilllogic.springmvc_xml.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.skilllogic.springmvc_xml.model.Product;
import com.skilllogic.springmvc_xml.service.IProductService;

public class AllProductsController implements Controller{
	
	private IProductService iProductService;

	public void setiProductService(IProductService iProductService) {
		this.iProductService = iProductService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Product> list = iProductService.getAllProducts();
		ModelAndView modelAndView = new ModelAndView();
		if(!list.isEmpty()) {
			modelAndView.addObject("allproducts", list);
			modelAndView.setViewName("allproducts");
		}else {
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

}
