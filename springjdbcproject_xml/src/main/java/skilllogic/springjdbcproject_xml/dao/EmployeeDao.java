package skilllogic.springjdbcproject_xml.dao;

import java.util.List;

import skilllogic.springjdbcproject_xml.model.Employee;

public interface EmployeeDao {
   public int insertEmployee(Employee employee);
   public List<Employee> getAllEmployees();
   public Employee getEmployeeById(int id);
   public int deleteEmployee(int id);
   public int updateEmployee(Employee e);
}
