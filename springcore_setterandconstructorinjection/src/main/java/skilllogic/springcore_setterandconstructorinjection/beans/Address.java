package skilllogic.springcore_setterandconstructorinjection.beans;

public class Address {
	
	private String houseNo;
	private String area;
	private String city;
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void displayAddress() {
		 System.out.println(houseNo+"   "+area+"  "+city);
	}
	
	
}
