package com.skilllogic.jdbcapp2.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.skilllogic.jdbcapp2.preparedstatement.utility.ConnectionUtility;

public class CustomerDelete {

	private static final String DELETE_CUSTOMER="delete from customer_details where customer_id=?";
	public void deleteCustomerById(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionUtility.getConnectionObject();
			System.out.println(con.hashCode());
			pstmt = con.prepareStatement(DELETE_CUSTOMER);
			pstmt.setInt(1, id);
			int i = pstmt.executeUpdate();
			if(i>0)
				System.out.println(i+"  Customer Deleted....");
			else
				System.out.println("Customer Not Deleted...");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(con!=null)
				con.close();
			if(pstmt!=null)
			pstmt.close();
			}catch(SQLException sql) {}
		}
	}
}
