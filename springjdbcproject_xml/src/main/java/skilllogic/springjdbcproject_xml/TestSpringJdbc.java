package skilllogic.springjdbcproject_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import skilllogic.springjdbcproject_xml.dao.EmployeeDao;
import skilllogic.springjdbcproject_xml.model.Employee;

public class TestSpringJdbc {
	public static void main(String[] args) {

		 ApplicationContext ctx = new ClassPathXmlApplicationContext("skilllogic/springjdbcproject_xml/cfg/applicationContext.xml");
		 EmployeeDao employeeDao =ctx.getBean("empdao",EmployeeDao.class);
		 Employee employee = new Employee();
		 employee.setName("Kumar");
		 employee.setSalary(50000);
		 employee.setAddress("Hyderabad");
		 int i = employeeDao.insertEmployee(employee);
		 if(i>0)
			 System.out.println(i+" Employee Inserted Successfully...");
		 else
			 System.out.println("Employee Insertion Failed....");
	}
}
