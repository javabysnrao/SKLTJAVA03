package com.skilllogic.jdbcapp2.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.skilllogic.jdbcapp2.preparedstatement.utility.ConnectionUtility;

public class CustomerSelect {

	public void selectAllCustomers() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtility.getConnectionObject();
			pstmt = con.prepareStatement("SELECT * FROM CUSTOMER_DETAILS");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("customer_id") + "   " + rs.getString("customer_name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException sql) {
				sql.printStackTrace();
			}
		}
	}
}
