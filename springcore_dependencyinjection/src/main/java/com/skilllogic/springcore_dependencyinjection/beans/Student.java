package com.skilllogic.springcore_dependencyinjection.beans;

import java.util.Date;
import java.util.List;

public class Student {

	private int id;
	private String name;
	private float avg;
	private boolean vaccinated;
	private Address address;
	private Date date;
	private List<String> subjects;
	
	public Student() {
		System.out.println("Student.Student(): 0-param constructor");
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

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
		System.out.println("Subject Details");
		subjects.forEach(sub -> {
			 System.out.println(sub);
		});
		address.displayAddress();// calling business method dependent class

	}

}
