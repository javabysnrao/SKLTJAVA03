package com.skillogic.sessionmanagement.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	public LoginServlet() {
		System.out.println("LoginServlet.LoginServlet():: 0 param Constrcutor");
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		//read the form data
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		HttpSession session = req.getSession(true);//creates new session
		if(email.equals("raja@gmail.com") && password.equals("raja")) {
			 session.setAttribute("useremail", email);//Storing email in session
			 pw.println("<h3>Welcome To Skillogic Technologies</h3></br>");
			 pw.println("Email : "+email+"</br>");
			 pw.println("<a href='profile'>Profile</a></br>");
			 pw.println("<a href='logout'>Logout</a></br>");
		}else {
			 pw.println("<h3 style='color:red'>Invalid Credentials</h3>");
			 RequestDispatcher rd = req.getRequestDispatcher("login.html");
			 rd.include(req, res);
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		doGet(req,res);
	}

}
