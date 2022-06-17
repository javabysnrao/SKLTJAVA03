package com.skillogic.employeemanagement.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionUtil {
    private static Connection con = null;
    private ConnectionUtil() {}
    public static Connection getConnectionObj() {
    	try {
    		InputStream fis = ConnectionUtil.class.getClassLoader().getResourceAsStream("/com/skillogic/employeemanagement/commons/database.properties");
    		Properties properties = new Properties();
    		properties.load(fis);
    		String driverClass = properties.getProperty("jdbc.driver");
    		String url = properties.getProperty("jdbc.url");
    		String user = properties.getProperty("jdbc.user");
    		String password= properties.getProperty("jdbc.password");
    		if(con== null) {
    			Class.forName(driverClass);
    			con = DriverManager.getConnection(url, user, password);
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		return con;
    }
}
