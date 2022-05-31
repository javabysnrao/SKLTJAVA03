package com.skilllogic.jdbcapp2.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.skilllogic.jdbcapp2.preparedstatement.pojos.Customer;

public class CustomerInsert {
	private static final String CUSTOMER_INSERT = "insert into customer_details(customer_name,customer_email,customer_contact,customer_address) values(?,?,?,?)";

	public void insertCustomer(Customer customer) {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			// loading the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Creating the connection obj
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skilllogic9ambatch", "root", "root");
			System.out.println(con.hashCode());
			// Creating the PrepatedStatement object
			pstmt = con.prepareStatement(CUSTOMER_INSERT);
			// set the values to place holders
			pstmt.setString(1, customer.getCustomerName());
			pstmt.setString(2, customer.getCustomerEmail());
			pstmt.setString(3, customer.getCustomerContanct());
			pstmt.setString(4, customer.getCustomerAddress());
			// execute the query
			int i = pstmt.executeUpdate();
			if (i > 0) {
				System.out.println(i + "  Customer Inserted...");
			} else
				System.out.println("Customer Insertion Failed....");
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (SQLException sql) {
			sql.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException sql) {
			}
		}
	}
}
