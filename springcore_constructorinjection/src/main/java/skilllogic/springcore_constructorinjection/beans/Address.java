package skilllogic.springcore_constructorinjection.beans;

public class Address {

	private String houseNo;
	private String area;
	private String city;
	public Address() {
		System.out.println("Address.Address() 0-param constructor");
	}
	public Address(String houseNo, String area, String city) {
		System.out.println("Address.Address() Param Constructor");
		this.houseNo = houseNo;
		this.area = area;
		this.city = city;
	}
	
	public void displayAddress() {
		System.out.println(houseNo+"    "+area+"   "+city);
	}
	
}
