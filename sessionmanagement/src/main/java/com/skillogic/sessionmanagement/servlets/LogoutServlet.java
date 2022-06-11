package com.skillogic.sessionmanagement.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value = "/logout",loadOnStartup = 1)
public class LogoutServlet extends HttpServlet{
	
	public LogoutServlet() {
		System.out.println("LogoutServlet:: 0 param Constructor");
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html"); 
		HttpSession session = req.getSession(false);//Continue old session
		 String email = (String)session.getAttribute("useremail");
		  System.out.println("Logout from application......................"+email);
		  session.removeAttribute("useremail");
		  session.invalidate();
		  System.out.println("Email "+email);
		  PrintWriter pw = res.getWriter();
		  pw.println("<h4 style='color:green'>Loggedout Successfully.....</h4>");
		  RequestDispatcher rd = req.getRequestDispatcher("login.html");
		  rd.include(req, res);
	}

}
