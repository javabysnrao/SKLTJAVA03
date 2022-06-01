package com.skillogic.jdbctransactionmngmnt.tx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.skillogic.jdbctransactionmngmnt.pojos.Customer;
import com.skillogic.jdbctransactionmngmnt.pojos.Order;
import com.skillogic.jdbctransactionmngmnt.utility.ConnectionUtility;

public class ShoopingCartTx {

	private static final String CUSTOMER_INSERT="insert into customer_details(customer_name,customer_email,customer_contact,customer_address) values(?,?,?,?)";
	private static final String ORDER_INSERT="insert into orders(item_name,item_price,customer_id) values(?,?,?)";
	public void saveOrder(Customer customer,Order order) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			con = ConnectionUtility.getConnectionObject();
			con.setAutoCommit(false);//Step-1
			pstmt = con.prepareStatement(CUSTOMER_INSERT,Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, customer.getCustomerName());
			pstmt.setString(2, customer.getCustomerEmail());
			pstmt.setString(3, customer.getCustomerContact());
			pstmt.setString(4, customer.getCustomerAddress());
			result = pstmt.executeUpdate();
			if(result>0) {
				  //throw some exception
				  String item = null;
				  System.out.println(item.length());
				  ResultSet rs = pstmt.getGeneratedKeys();
				    rs.next();
				 int customerId = rs.getInt(1);
				pstmt=con.prepareStatement(ORDER_INSERT);
				pstmt.setString(1, order.getItemName());
				pstmt.setDouble(2, order.getItemPrice());
				pstmt.setInt(3, customerId);
				int i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println("Order Successfully Completed....");
				}
			}
			con.commit(); //Step-2
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Order is failed........");
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}//Step-3
		}
	}
}
