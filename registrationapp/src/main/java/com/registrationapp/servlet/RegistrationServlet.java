package com.registrationapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{
	
	  public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		      res.setContentType("text/html");
		      //read the form data
		      String name  = req.getParameter("name");
		      String email = req.getParameter("email");
		      String mobile = req.getParameter("contact");
		      String gender = req.getParameter("gender");
		      String hobbies[] = req.getParameterValues("hobbies");
		      String city = req.getParameter("city");
		      String address = req.getParameter("address");
		      String result="";
		      System.out.println(result+" Hobbies");
		      PrintWriter pw = res.getWriter();
		      pw.println("<html><body>");
		      pw.println("<h3>User Registration</h3>");
		      pw.println("Name:: "+name+"</br>");
		      pw.println("Email ::"+email+"</br>");
		      pw.println("Contact ::"+mobile+"</br>");
		      pw.println("Gender ::"+gender+"</br>");
		      for (String data : hobbies) {
		    	  result = data+",";
		    	    pw.println("Hobbies:: "+result+"</br>");
			}
		      pw.println("City:: "+city+"</br>");
		      pw.println("Address ::"+address);
		      pw.println("</body></html>");
	  }
	  public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		    doGet(req,res);
	  }
}
