package com.skillogic.jdbcapp3.callablestatement.test;

import com.skillogic.jdbcapp3.callablestatement.CustomerDetails;

public class TestCustomer {

	public static void main(String[] args) {
		
		CustomerDetails cd = new CustomerDetails();
		cd.getCustomerDetailsById(4);
		
	}
}
