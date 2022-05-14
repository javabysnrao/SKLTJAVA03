package com.skilllogic.inheritanceproject.isa;

public class Employee {
	public Employee() {
		 System.out.println("Employee.Employee(): 0 param constructor");
	}
	String companyName ="IBM";
	double salary = 40000;
	public void displayCompanyAddress() {
		System.out.println("Gachhibowli,Hyderabad");
	}
}
