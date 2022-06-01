package com.skillogic.jdbctransactionmngmnt.test;

import com.skillogic.jdbctransactionmngmnt.pojos.Customer;
import com.skillogic.jdbctransactionmngmnt.pojos.Order;
import com.skillogic.jdbctransactionmngmnt.tx.ShoopingCartTx;

public class TestShoopingCart {

	public static void main(String[] args) {
		//ShoopingCart sc = new ShoopingCart();
		ShoopingCartTx sc = new ShoopingCartTx();
		Customer customer = new Customer();
		customer.setCustomerName("Murali");
		customer.setCustomerEmail("murali@gmail.com");
		customer.setCustomerContact("8568586888");
		customer.setCustomerAddress("Hyd");
		
		Order order = new Order();
		order.setItemName("Mobile");
		order.setItemPrice(50000);
		sc.saveOrder(customer, order);
	}
}
