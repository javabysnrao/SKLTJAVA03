package com.skilllogic.jdbcapp2.preparedstatement.test;

import com.skilllogic.jdbcapp2.preparedstatement.CustomerSelect;

public class TestSelectCustomer {

	public static void main(String[] args) {
		
		CustomerSelect cs = new CustomerSelect();
		cs.selectAllCustomers();
		
	}
}
