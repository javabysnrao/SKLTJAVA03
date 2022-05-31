package com.skilllogic.jdbcbatchprocessing;

import java.sql.Connection;
import java.sql.Statement;

import com.skilllogic.jdbcbatchprocessing.utility.ConnectionUtility;

public class CustomerBatch {
	
	public void performCustomerOperations() {
		Connection con  = null;
		Statement st = null;
		try {
			con = ConnectionUtility.getConnectionObject();
			st = con.createStatement();
			String customerinsert="insert into customer_details(customer_name,customer_email,customer_contact,customer_address) values('kumar','kumar@gmail.com','9857474584','Hyd')";
		    st.addBatch(customerinsert);
		    String deletecustomer ="delete from customer_details where customer_id=2";
		    st.addBatch(deletecustomer);
		    String updatecustomer="update customer_details set customer_name='Hareeshkumar',customer_address='Hyderabad' where customer_id=3";
		    st.addBatch(updatecustomer);
		     int i[]=st.executeBatch();
		     if(i.length>0) {
		    	 System.out.println(i.length+"  Operations Completed...");
		     }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
