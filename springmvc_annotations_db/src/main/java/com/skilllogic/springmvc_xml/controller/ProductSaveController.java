package com.skilllogic.springmvc_xml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilllogic.springmvc_xml.model.Product;
import com.skilllogic.springmvc_xml.service.IProductService;

@Controller
public class ProductSaveController {
	
	@Autowired
	private IProductService iProductService;
	
     @RequestMapping(value = "/saveproduct",method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute Product product) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		//Call Service Layer
		boolean flag = iProductService.savePorduct(product); //calling method
		if(flag)
			modelAndView.setViewName("success"); //prefix+ page name + suffix
		else
			modelAndView.setViewName("failure"); //WEB-INF/pages/failure.jsp
		return modelAndView;
	}

}
