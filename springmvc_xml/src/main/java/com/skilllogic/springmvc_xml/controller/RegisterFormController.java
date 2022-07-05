package com.skilllogic.springmvc_xml.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class RegisterFormController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 //read form by using request object
		String name = request.getParameter("empname");
		String email = request.getParameter("empemail");
		String salary = request.getParameter("salary");
		String contact = request.getParameter("contact");
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("display"); // prefix+page name+suffix [/WEB-INF/pages/display.jsp]
		modelAndView.addObject("name", name);
		modelAndView.addObject("email", email);
		modelAndView.addObject("salary", salary);
		modelAndView.addObject("contact", contact);
		System.out.println("---------------------------------------------");
		List<String> list = new ArrayList<>();
	    list.add(name);
	    list.add(email);
	    list.add(salary);
	    list.add(contact);
	    modelAndView.addObject("list", list);
		return modelAndView;
	}

}
