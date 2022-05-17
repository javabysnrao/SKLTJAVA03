package com.skilllogic.encapsulationproject.withencapusalation;

public class Account {

	private long acoountId = 7363473726L;
	private double amount = 5000;
	
	public void deposit(double depositAmount) {
		amount = amount+depositAmount;
	}
	public void displayTotalBalance() {
		System.out.println("Account Id "+acoountId);
		System.out.println("Total Balance: "+amount);
	}
}
