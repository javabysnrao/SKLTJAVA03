package skilllogic.springjdbcproject_xml.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import skilllogic.springjdbcproject_xml.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private JdbcTemplate jdbcTemplate;
	public static final String INSERT_QUERY="insert into employee(name,salary,address) values(?,?,?)";
	
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
    public int insertEmployee(Employee employee) {
    	return jdbcTemplate.update(INSERT_QUERY, employee.getName(),employee.getSalary(),employee.getAddress());
    }
}
