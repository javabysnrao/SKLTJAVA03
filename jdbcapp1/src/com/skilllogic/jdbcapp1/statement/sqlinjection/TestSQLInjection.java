package com.skilllogic.jdbcapp1.statement.sqlinjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestSQLInjection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skilllogic9ambatch","root","root");
		    Statement st=con.createStatement();
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter Email");
		    String name=sc.nextLine();
		    ResultSet rs=st.executeQuery("select * from customer_details where customer_email='"+name+"'");
		    while(rs.next()) {
		    	System.out.println(rs.getInt("customer_id")+" "+rs.getString("customer_name")+" "+rs.getString("customer_email"));
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
