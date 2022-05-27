package com.skilllogic.jdbcapp1.statement.insert;

public class TestCustomerInsert {
	
	public static void main(String[] args) {	
		CustomerInsert ci = new CustomerInsert();
		ci.insertCustomer("suresh", "suresh@gmail.com", "956856856", "Vizag");
	}
}
