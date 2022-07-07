package com.skilllogic.springmvc_xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilllogic.springmvc_xml.model.Product;
import com.skilllogic.springmvc_xml.service.IProductService;

@Controller
public class AllProductsController{
	
	@Autowired
	private IProductService iProductService;

    @RequestMapping(value = "/getallproducts",method = RequestMethod.GET)
	public ModelAndView allProducts() throws Exception {
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
