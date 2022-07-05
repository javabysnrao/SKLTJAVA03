package skilllogic.springjdbcproject_xml.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import skilllogic.springjdbcproject_xml.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	    Employee employee = new Employee();
	    int id = rs.getInt("id");
	    String name = rs.getString("name");
	    double salary = rs.getDouble("salary");
	    String address = rs.getString("address");
	    employee.setId(id);
	    employee.setName(name);
	    employee.setSalary(salary);
	    employee.setAddress(address);
		return employee;
	}
}
