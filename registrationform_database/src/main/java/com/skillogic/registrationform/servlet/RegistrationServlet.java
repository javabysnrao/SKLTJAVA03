package com.skillogic.registrationform.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{
	
	private static final String USER_INSERT="insert into users(name,email,contact,gender,hobbies,city,address) values(?,?,?,?,?,?,?)";
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  try {
			   res.setContentType("text/html");
			      //read the form data
			      String name  = req.getParameter("name");
			      String email = req.getParameter("email");
			      String mobile = req.getParameter("contact");
			      String gender = req.getParameter("gender");
			      String hobbies[] = req.getParameterValues("hobbies");
			      String city = req.getParameter("city");
			      String address = req.getParameter("address");
			      String allHobbies ="";
			      for (String hb : hobbies) {
			    	  allHobbies = allHobbies+hb;
				}
			      // JDBC Code
			      Class.forName("com.mysql.cj.jdbc.Driver");
			       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skilllogic9ambatch", "root", "root");
			       pstmt = con.prepareStatement(USER_INSERT);
			       pstmt.setString(1, name);
			       pstmt.setString(2, email);
			       pstmt.setString(3, mobile);
			       pstmt.setString(4, gender);
			       pstmt.setString(5, allHobbies);
			       pstmt.setString(6, city);
			       pstmt.setString(7, address);
			       int i = pstmt.executeUpdate();
			       if(i>0) {
			    	   RequestDispatcher rd = req.getRequestDispatcher("success.html");
			    	   rd.forward(req, res);
			       }else {
			    	   RequestDispatcher rd = req.getRequestDispatcher("failure.html");
			    	   rd.forward(req, res);
			       }
			      
		  }catch(Exception e) {
			  e.printStackTrace();
		  }finally {
			  if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			  if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		  }
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		  doGet(req,res);
	}

}
