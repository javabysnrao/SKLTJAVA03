package com.skilllogic.inheritanceproject.isa;

public class Tester extends Employee{

	int id =222;
	String name="Hareesh";
	
	public void displayEmployee() {
		double incentives = 10000;
		double totalSalary = salary+incentives;//salary super class variable
		System.out.println("Employee Details :: "+id+"  "+name);
		System.out.println("Total Salary :: "+totalSalary);
		displayCompanyAddress();//super class method
	}
}
