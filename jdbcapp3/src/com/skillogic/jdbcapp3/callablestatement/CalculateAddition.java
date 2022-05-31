package com.skillogic.jdbcapp3.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import com.skillogic.jdbcapp3.callablestatement.utility.ConnectionUtility;

public class CalculateAddition {
	
	public void calculateAddition() {
		Connection con = null;
		CallableStatement cstmt = null;
		try {
			con = ConnectionUtility.getConnectionObject();
			cstmt = con.prepareCall("{call addition(?,?,?)}");
			cstmt.setInt(1, 30); //input
			cstmt.setInt(2, 40);//input
			cstmt.registerOutParameter(3, Types.INTEGER);//output
			cstmt.executeUpdate(); //execution take place here
			//read output from cstmt object
			System.out.println("Addition Result : "+cstmt.getInt(3));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
