package com.skilllogic.inheritanceproject.isa;

public class TestIsRelation {

	public static void main(String[] args) {
		
		JavaDeveloper jd = new JavaDeveloper();
		jd.displayEmployee();
		System.out.println("-------------------------");
		Tester t = new Tester();
		t.displayEmployee();
		
	}
}
