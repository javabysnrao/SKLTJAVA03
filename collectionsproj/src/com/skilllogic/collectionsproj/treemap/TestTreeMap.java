package com.skilllogic.collectionsproj.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	
	
	public void insertEmployee() {
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Rajesh");
		e1.setSalary(50000);
		Employee e2 = new Employee();
		e2.setId(101);
		e2.setName("Ganesh");
		e2.setSalary(60000);
		Employee e3 = new Employee();
		e3.setId(102);
		e3.setName("Suresh");
		e3.setSalary(70000);
		TreeMap<Integer,Employee>  tm = new TreeMap<Integer,Employee> ();
		tm.put(102, e3);	
		tm.put(101, e2);
		tm.put(100, e1);
		for(Map.Entry<Integer,Employee>  entry:tm.entrySet()) {
			// System.out.println(entry.getKey()+"          "+entry.getValue());
			 Employee e = (Employee)entry.getValue();
			 System.out.println(e.getId()+"    "+e.getName()+"    "+e.getSalary());	 
		}
		System.out.println(tm);
	}
	public static void main(String[] args) {
		TestTreeMap tm = new TestTreeMap();
		tm.insertEmployee();	
	}
}
