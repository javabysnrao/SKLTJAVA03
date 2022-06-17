package com.skillogic.employeemanagement.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.skillogic.employeemanagement.exceptions.CustomException;
import com.skillogic.employeemanagement.service.impl.EmpManagementServiceImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	   public void doGet(HttpServletRequest req,HttpServletResponse res) {
		   try {
			   String email = req.getParameter("email");
			   String password = req.getParameter("password");
			   //call service Layer
			   EmpManagementServiceImpl emServiceImpl = new EmpManagementServiceImpl();
			  String message = emServiceImpl.loginValidate(email, password);
			  if(message.equalsIgnoreCase("Admin") || message.equalsIgnoreCase("Employee")) {
				  HttpSession session = req.getSession(true);
				  session.setAttribute("email", email);
			  }
			  if(message.equalsIgnoreCase("Admin")) {
				  RequestDispatcher rd = req.getRequestDispatcher("adminsuccess.jsp");
				  rd.forward(req, res);
			  }else if(message.equalsIgnoreCase("Employee")) {
				  RequestDispatcher rd = req.getRequestDispatcher("employeesuccess.jsp");
				  rd.forward(req, res);
			  }else {
				  //Invalid credentials
				  req.setAttribute("msg", message);
				  RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				  rd.forward(req, res);
			  }
		   }catch(Exception e) {
			   e.printStackTrace();
			   throw new CustomException("Exception Occurred "+e.getMessage());
		   }
	   }
	   public void doPost(HttpServletRequest req,HttpServletResponse res) {
		   doGet(req,res);
	   }
}
