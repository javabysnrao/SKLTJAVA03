package com.skillogic.jdbcapp3.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.skillogic.jdbcapp3.callablestatement.utility.ConnectionUtility;

public class CustomerDetails {

	public void getCustomerDetailsById(int id) {
		Connection con =null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtility.getConnectionObject();
			cstmt= con.prepareCall("{call customerdetailsbyid(?)}");
			cstmt.setInt(1, id);
			rs = cstmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}
