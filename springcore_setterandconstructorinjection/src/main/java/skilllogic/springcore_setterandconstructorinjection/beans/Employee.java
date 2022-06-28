package skilllogic.springcore_setterandconstructorinjection.beans;

public class Employee {

	 private int id;
	 private String name;
	 private double salary;
	 private Address address;
	 
	 public Employee(int id, String name, double salary, Address address) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.address = address;
		}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println(id+"    "+name+"   "+salary);
		address.displayAddress();
	}
	 
}
