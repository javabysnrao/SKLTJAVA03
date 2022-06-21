package com.skilllogic.springcore_dependencyinjection.beans;

import java.util.Date;

public class Student {

	private int id;
	private String name;
	private float avg;
	private boolean vaccinated;
	private Address address;
	private Date date;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void displayStudent() {
		int hours = date.getHours();
		if (hours < 12)
			System.out.println("Good Morning");
		else if (hours < 16) {
			System.out.println("Good AfterNoon");
		} else if (hours < 20)
			System.out.println("Good Evening");
		else
		System.out.println("Good Night");
		System.out.println("Student Details");
		System.out.println( id + "   " + name +"   "+avg+"   "+vaccinated);
		address.displayAddress();// calling business method dependent class

	}

}
