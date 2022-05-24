package com.skilllogic.collectionsproj.arraylistcustom;

import java.util.ArrayList;

public class TestEmployee {

	public void inserEmployee() {
		//Preparing the data
		Employee e1 = new Employee(1001,"Suresh",30000);
		Employee e2 = new Employee(1002, "Ganesh",40000);
		Employee e3 = new Employee(1003, "Ajay", 50000);
		//Storing the objects in collection
		ArrayList<Employee> list =new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list.size());
		System.out.println("-------------------------------------------------------");
		//calling method and passing collection obj to that method as a parameters
		displayEmployees(list);
	}
	public void displayEmployees(ArrayList<Employee> list) {
		for (Employee employee : list) {
			System.out.println(employee.getId()+"    "+employee.getName()+"  "+employee.getSalary());
		}
	}
	public static void main(String[] args) {
		TestEmployee te = new TestEmployee();
		te.inserEmployee();
	}
}
