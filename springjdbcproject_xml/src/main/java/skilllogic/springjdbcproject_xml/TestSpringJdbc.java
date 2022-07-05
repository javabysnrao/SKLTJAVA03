package skilllogic.springjdbcproject_xml;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import skilllogic.springjdbcproject_xml.dao.EmployeeDao;
import skilllogic.springjdbcproject_xml.model.Employee;

public class TestSpringJdbc {
	private static final Logger logger = Logger.getLogger(TestSpringJdbc.class);
	public static void main(String[] args) {
		logger.info("Main method started.....");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"skilllogic/springjdbcproject_xml/cfg/applicationContext.xml");
		EmployeeDao employeeDao = ctx.getBean("empdao", EmployeeDao.class);
		// Insert employeee
		/* Employee employee = new Employee();
		 employee.setName("Rakesh");
		 employee.setSalary(40000);
		 employee.setAddress("Vizag");
		 int i = employeeDao.insertEmployee(employee);
		 if(i>0)
			 System.out.println(i+" Employee Inserted Successfully...");
		 else
			 System.out.println("Employee Insertion Failed....");*/
		
		// Select All Employees
		/* List<Employee> list=employeeDao.getAllEmployees();
			  list.forEach(emp -> {
				 	 System.out.println(emp.getId()+"     "+emp.getName()+"    "+emp.getSalary()+"  "+emp.getAddress());
				  });
			  System.out.println("------------------------------------------------------");
			 for (Employee employee : list) {
				 System.out.println(employee.getId()+"     "+employee.getName()+"    "+employee.getSalary()+"  "+employee.getAddress());
			}*/
		
		// Select Specific Employee
		Employee e = employeeDao.getEmployeeById(2);
		System.out.println(e.getId() + "    " + e.getName() + "    " + e.getSalary() + "   " + e.getAddress());
		
		// Delete Specific Employee
		
		/* int  i = employeeDao.deleteEmployee(1);
		 if(i>0)
		   System.out.println(i+"Employee Deleted Successfully");
		 else
		   System.out.println("Employee Not Deleted");*/

		// Update Specific Employee
		
		/*      Employee employee = new Employee();
		      employee.setId(2);  // existing id
		      employee.setName("RajKumar");
		      employee.setSalary(20000);
		      employee.setAddress("Hyd");
		      int i = employeeDao.updateEmployee(employee);
		      if(i>0)
				   System.out.println(i+"Employee Updated Successfully");
				 else
				   System.out.println("Employee Not updated");*/
		logger.info("Main method ended.....");
	}
}
