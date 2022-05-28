package com.skilllogic.jdbcapp2.preparedstatement.test;

import com.skilllogic.jdbcapp2.preparedstatement.CustomerDelete;

public class TestCustomerDelete {

	public static void main(String[] args) {
		
		CustomerDelete cd = new CustomerDelete();
		cd.deleteCustomerById(3);
	}
}
