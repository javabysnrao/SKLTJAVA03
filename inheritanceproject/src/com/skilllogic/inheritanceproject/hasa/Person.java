package com.skilllogic.inheritanceproject.hasa;

public class Person {

	private String name="Raja";
	private String color ="White";
	private Address address;
	
	public void displayPerson() {
		System.out.println(name+"   "+color);
		address = new Address();
		address.displayAddress();
	}
}
