package com.skilllogic.jdbcapp1.statement.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectAllCustomer {
	
	
	public void selectAllCustomer() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skilllogic9ambatch", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customer_details");
			while(rs.next()) {
				System.out.println(rs.getInt("customer_id")+"    "+rs.getString("customer_name")+"   "+rs.getString("customer_email")+"  "+rs.getString("customer_contact")+"  "+rs.getString("customer_address"));
			}
			rs.close();
			st.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
