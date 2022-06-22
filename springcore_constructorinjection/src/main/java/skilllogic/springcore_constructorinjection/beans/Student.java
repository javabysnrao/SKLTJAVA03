package skilllogic.springcore_constructorinjection.beans;

public class Student {
    private int id;
    private String name;
    private float avg;
    private Address address;
	public Student() {
		System.out.println("Student.Student() 0-param constructor");
	}
	public Student(int id, String name, float avg, Address address) {
		System.out.println("Student.Student() Param Constructor");
		this.id = id;
		this.name = name;
		this.avg = avg;
		this.address = address;
	}
	public void displayStudent() {
		System.out.println(id+"  "+name+"   "+avg);
		address.displayAddress();
	}
}
