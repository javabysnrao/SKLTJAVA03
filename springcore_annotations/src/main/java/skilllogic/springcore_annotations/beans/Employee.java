package skilllogic.springcore_annotations.beans;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	@Value("111")
	private int empId;
	@Value("Rajesh")
	private String name;
	@Value("50000")
	private double salary;
	
	@Autowired
	private LocalDateTime localDateTime;

	public void display() {
		int hours = localDateTime.getHour();
		if(hours<12)
			System.out.println("Good Morning");
		else if(hours<16)
			System.out.println("Good Afternoon");
		else if(hours<20)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
		System.out.println(empId+"   "+name+"    "+salary);
	}
}
