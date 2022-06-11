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
@WebServlet(value = "/profile",loadOnStartup = 1)
public class ProfileServlet extends HttpServlet{

	public ProfileServlet() {
		System.out.println("ProfileServlet.ProfileServlet():: 0 -param ");
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		HttpSession session  = req.getSession(false);//Continue existing session
		if(session!=null) {
			String email = (String)session.getAttribute("useremail");// Gives data from session
			//Go to database and user details based on email
			pw.println("<h3>Profile</h3><br>");
			pw.println("Email : "+email+"</br>");
			pw.println("<a href='logout'> Logout</a>");
		}else {
			pw.println("<h5 style='color:red'>Session is expired...Please login again</h5>");
			 RequestDispatcher rd = req.getRequestDispatcher("login.html");
			 rd.include(req, res);
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		doGet(req,res);
	}
}
