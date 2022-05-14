package com.skilllogic.keywordsproject.statickeyword;

public class Employee {
	
	  static String companyName = "TCS";
	  
	  public Employee(int id,String name) {
		  System.out.println(id+"  "+name+"  "+companyName);
	}
	public static void main(String[] args) {
		  System.out.println("Main method started......");
		  Employee e1 = new Employee(111, "Raja");
		  Employee e2 = new Employee(222, "Suresh");
		  
	}
	  

}
