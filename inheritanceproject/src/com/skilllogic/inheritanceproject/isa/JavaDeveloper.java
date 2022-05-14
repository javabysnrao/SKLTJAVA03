package com.skilllogic.inheritanceproject.isa;

public class JavaDeveloper extends Employee{

	int id =111;
	String name="Raja";
	
	public JavaDeveloper() {
		super();
		System.out.println("JavaDeveloper.JavaDeveloper(): 0 param constructor");
	}
	
	public void displayEmployee() {
		double incentives = 20000;
		double totalSalary = super.salary+incentives;
		System.out.println("Employee Details :: "+id+"  "+name);
		System.out.println("Total Salary :: "+totalSalary);
		super.displayCompanyAddress();
	}
}
