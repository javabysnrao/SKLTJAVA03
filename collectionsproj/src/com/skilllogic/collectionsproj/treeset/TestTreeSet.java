package com.skilllogic.collectionsproj.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.skilllogic.collectionsproj.arraylistcustom.Employee;

public class TestTreeSet {
	public void save() {
		TreeSet<Employee> ts = new TreeSet<Employee>();
		//Preparing the data
		Employee e1 = new Employee(1001,"Suresh",30000);
		Employee e2 = new Employee(1002, "Ganesh",40000);
		Employee e3 = new Employee(1003, "Ajay", 50000);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		display(ts);
	
	}
	public void display(TreeSet<Employee> ts) {
		for (Employee employee : ts) {
			System.out.println(employee.getId()+"    "+employee.getName()+"  "+employee.getSalary());
		}
	}
	public static void main(String[] args) {
		  TestTreeSet tss = new TestTreeSet();
		  tss.save();
	}
}
