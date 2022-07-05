package skilllogic.springjdbcproject_xml.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import skilllogic.springjdbcproject_xml.model.Employee;
import skilllogic.springjdbcproject_xml.resultsetexractors.EmployeeResultSetExtractor;
import skilllogic.springjdbcproject_xml.rowmappers.EmployeeRowMapper;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private JdbcTemplate jdbcTemplate;
	public static final String INSERT_QUERY="insert into employee(name,salary,address) values(?,?,?)";
	public static final String SELECT_ALL="select * from employee";
	public static final String SELECTEMP_BYID="select * from employee where id=?";
	public static final String DELTEEMP_BYID="delete from employee where id=?";
	public static final String UPDATEEMP_BYID="update employee set name=?,salary=?,address=? where id=?";
    private static final Logger LOGGER = Logger.getLogger(EmployeeDaoImpl.class);
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
    public int insertEmployee(Employee employee) {
    	return jdbcTemplate.update(INSERT_QUERY, employee.getName(),employee.getSalary(),employee.getAddress());
    }

	@Override
	public List<Employee> getAllEmployees() {
		LOGGER.info(" getAllEmployees() started.....");
		List<Employee> list = jdbcTemplate.query(SELECT_ALL, new EmployeeRowMapper());
		return list;
	}
	

	/*@Override
	public Employee getEmployeeById(int id) {
		 Employee e = jdbcTemplate.queryForObject(SELECTEMP_BYID,new EmployeeRowMapper(),id);
		return e;
	}*/
	
	@Override
	public Employee getEmployeeById(int id) {
		 Employee e = null;
		try {
		 LOGGER.info("getEmployeeById() started.....");
		  e = jdbcTemplate.query(SELECTEMP_BYID,new EmployeeResultSetExtractor(),id);
		}catch(Exception ex) {
			ex.printStackTrace();
			LOGGER.error("Exception is raised at getEmployeeById() in EmployeeDaoImpl "+ex.getMessage());
		}
		 return e;
	}

	@Override
	public int deleteEmployee(int id) {
		return jdbcTemplate.update(DELTEEMP_BYID, id);
	}

	@Override
	public int updateEmployee(Employee e) {
		return jdbcTemplate.update(UPDATEEMP_BYID, e.getName(),e.getSalary(),e.getAddress(),e.getId());
	}
}
