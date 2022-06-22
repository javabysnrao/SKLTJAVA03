package com.skilllogic.springcore_dependencyinjection.beans;

public class Address {
	
   private String houseNo;
   private String areaName;
   private String city;
   
   public Address() {
	   System.out.println("Address : 0-param constructor");
   }
public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
public void setCity(String city) {
	this.city = city;
}

public void displayAddress() {
	System.out.println(houseNo+"   "+areaName+"  "+city);
}
   
}
