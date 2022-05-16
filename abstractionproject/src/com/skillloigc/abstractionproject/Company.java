package com.skillloigc.abstractionproject;

public abstract class Company {
	private double netSalary = 0.0;

	public Company(double grossSalary) {
		calculateNetSalary(grossSalary);
	}
	private void calculateNetSalary(double grossSalary) {
		if (grossSalary >= 500000) {
			netSalary = grossSalary - (grossSalary * 0.2);
			System.out.println("Net Salary :" + netSalary);
		} else if (grossSalary >= 300000 && grossSalary < 500000) {
			netSalary = grossSalary - (grossSalary * 0.1);
			System.out.println("Net Salary :" + netSalary);
		} else {
			System.out.println("You are not eligible for tax");
		}
	}
}
