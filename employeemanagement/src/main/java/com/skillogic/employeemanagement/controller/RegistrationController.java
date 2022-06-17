package com.skillogic.employeemanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skillogic.employeemanagement.exceptions.CustomException;
import com.skillogic.employeemanagement.model.Employee;
import com.skillogic.employeemanagement.service.impl.EmpManagementServiceImpl;

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   try {
		 System.out.println("RegistrationController.doGet()");
		//read form data
		 String name = request.getParameter("name");
		 String password = request.getParameter("password");
		 String email = request.getParameter("email");
		 String contact = request.getParameter("contact");
		 long empContact = Long.parseLong(contact);
		 String salary = request.getParameter("salary");
		 double empsalary = Double.parseDouble(salary);
		 String gender = request.getParameter("gender");
		 String role = request.getParameter("role");
		 String address = request.getParameter("empaddress");
		 System.out.println(address);
		 //binding form data into java bean object(model class obj)
		 Employee employee = new Employee();
		 employee.setName(name);
		 employee.setPassword(password);
		 employee.setEmail(email);
		 employee.setContact(empContact);
		 employee.setSalary(empsalary);
		 employee.setGender(gender);
		 employee.setRole(role);
		 employee.setAddress(address);
		 System.out.println(employee);
		 //Call Service Layer Method (creating objec service class)
		 EmpManagementServiceImpl registerServiceImpl = new EmpManagementServiceImpl();
		 int result = registerServiceImpl.registerEmployee(employee);//calling the method
		 if(result>0) {
			 RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			 rd.forward(request, response);
		 }else {
			 RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");
			 rd.forward(request, response);
		 }
	   }catch(Exception e) {
		   e.printStackTrace();
		   System.out.println("Exception in RegisterController");
		   throw new CustomException("Exception Occurred : "+e.getMessage());
	   } 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
