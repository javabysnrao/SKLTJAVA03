package com.skillogic.employeemanagement.pagesnavigation;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagenavigation")
public class PagesNavigationServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest req,HttpServletResponse res) {
		try {
			String pageName = req.getParameter("page");
			if(pageName.equals("register")) {
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				rd.forward(req, res);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
