package com.skilllogic.jdbcapp2.preparedstatement.test;

import java.util.Scanner;

import com.skilllogic.jdbcapp2.preparedstatement.CustomerInsert;
import com.skilllogic.jdbcapp2.preparedstatement.pojos.Customer;

public class TestCustomerInsert {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String name = scanner.next();
		System.out.println("Enter Customer Email");
		String email = scanner.next();
		System.out.println("Enter Customer Contact");
		String contact= scanner.next();
		System.out.println("Enter Customer Address");
		String address = scanner.next();
		//Preparing customer object
		Customer customer = new Customer();
		customer.setCustomerName(name);
		customer.setCustomerEmail(email);
		customer.setCustomerContanct(contact);
		customer.setCustomerAddress(address);
		//Object creation
		CustomerInsert ci = new CustomerInsert();
		//calling the method
		ci.insertCustomer(customer);
		scanner.close();
	}
}
