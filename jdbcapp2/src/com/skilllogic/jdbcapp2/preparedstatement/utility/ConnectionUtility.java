package com.skilllogic.jdbcapp2.preparedstatement.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
	public static Connection getConnectionObject() {
		Connection con = null;
		try {
			// loading the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Creating the connection obj
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skilllogic9ambatch", "root", "root");
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
		return con;
	}
}
