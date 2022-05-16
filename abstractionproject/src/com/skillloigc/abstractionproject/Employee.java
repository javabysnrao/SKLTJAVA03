package com.skillloigc.abstractionproject;

public class Employee extends Company{
        public Employee(double grossSalary) {
			   super(grossSalary);
		}
      public static void main(String[] args) {
		  Employee e = new Employee(500000);
	}  
}
