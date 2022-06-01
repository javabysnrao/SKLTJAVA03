package com.skillogic.jdbctransactionmngmnt.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtility {
	public static Connection getConnectionObject() {
		Connection con = null;
		try {
			FileReader fr = new FileReader("jdbc.properties");
			//Create Properties class object
			Properties prop = new Properties();
			//load properties file
			prop.load(fr);
			String driverclass = prop.getProperty("driverclass");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			// loading the driver class
			Class.forName(driverclass);
			// Creating the connection obj
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}catch(FileNotFoundException fne) {
			fne.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return con;
	}
}
