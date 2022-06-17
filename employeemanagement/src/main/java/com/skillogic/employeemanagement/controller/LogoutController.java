package com.skillogic.employeemanagement.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutController extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try {
			 HttpSession session = req.getSession(false);
			 session.removeAttribute("email");
			 session.invalidate();
			 RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			 rd.forward(req, res);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
