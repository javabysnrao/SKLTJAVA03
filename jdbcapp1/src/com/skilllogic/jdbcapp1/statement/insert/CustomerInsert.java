package com.skilllogic.jdbcapp1.statement.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerInsert {
	
	
	public void insertCustomer(String name,String email,String contact,String address) {
		//Step-1 Load the driver class
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step-2 Create the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skilllogic9ambatch", "root", "root");
		//Step-3 Prepare a query and execute the query
		String customerinsert="insert into customer_details(customer_name,customer_email,customer_contact,customer_address) values('"+name+"','"+email+"','"+contact+"','"+address+"')";
		Statement st = con.createStatement();
		int i = st.executeUpdate(customerinsert);
		//Step-4 Process the result
		if(i>0)
			System.out.println(i+"  Customer Inserted.....");
		else
			System.out.println("Customer Insertion Failed.....");
		//Step-5 Close the resources
		 st.close();
		 con.close();
		}catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
			System.out.println("Driver class is not loaded....");
		}catch(SQLException sqe) {
			sqe.printStackTrace();
			System.out.println("Connection is not established");
		}
	}

}
