package com.skillogic.employeemanagement.controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skillogic.employeemanagement.exceptions.CustomException;
import com.skillogic.employeemanagement.model.Employee;
import com.skillogic.employeemanagement.service.impl.EmpManagementServiceImpl;
@WebServlet("/selectemployees")
public class AllEmployeesController extends HttpServlet{
       public void doGet(HttpServletRequest req,HttpServletResponse res) {
    	   try {
    		   EmpManagementServiceImpl emServiceImpl = new EmpManagementServiceImpl();
    		   List<Employee> list = emServiceImpl.getAllEmployees();
    		   if(!list.isEmpty()) {
    			   req.setAttribute("allemps", list);
    			   RequestDispatcher rd = req.getRequestDispatcher("allemployees.jsp");
    			   rd.forward(req, res);
    		   }else {
    			   RequestDispatcher rd = req.getRequestDispatcher("failure.jsp");
    			   rd.forward(req, res);
    		   }
    	   }catch(Exception e) {
    		   e.printStackTrace();
    		   throw new CustomException(e.getMessage());
    	   }
       }
       public void doPost(HttpServletRequest req,HttpServletResponse res) {
    	   doGet(req,res);
       }
}
