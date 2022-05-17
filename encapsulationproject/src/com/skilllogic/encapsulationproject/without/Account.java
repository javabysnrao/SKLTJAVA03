package com.skilllogic.encapsulationproject.without;

public class Account {

	final long acoountId = 7363473726L;
	double amount = 5000;
	
	public void deposit(double depositAmount) {
		amount = amount+depositAmount;
	}
	public void displayTotalBalance() {
		System.out.println("Total Balance: "+amount);
	}
}
