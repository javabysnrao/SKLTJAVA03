package com.skillogic.employeemanagement.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.skillogic.employeemanagement.model.Employee;
import com.skillogic.employeemanagement.service.impl.EmpManagementServiceImpl;

@WebServlet("/profile")
public class ProfileController extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try {
			HttpSession session = req.getSession(false);
			String email = (String)session.getAttribute("email");
			EmpManagementServiceImpl eServiceImpl = new EmpManagementServiceImpl();
			Employee e = eServiceImpl.getProfileByEmail(email);
			if(e!=null) {
				req.setAttribute("emp",e);
				RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
				rd.forward(req, res);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		doGet(req,res);
	}
}
