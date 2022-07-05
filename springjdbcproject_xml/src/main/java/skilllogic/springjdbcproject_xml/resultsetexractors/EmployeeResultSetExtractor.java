package skilllogic.springjdbcproject_xml.resultsetexractors;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import skilllogic.springjdbcproject_xml.model.Employee;

public class EmployeeResultSetExtractor implements ResultSetExtractor<Employee> {
	private static final Logger LOGGER = Logger.getLogger(EmployeeResultSetExtractor.class);
	@Override
	public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
		LOGGER.info("extractData() method started.....");
		Employee e = null;
		while (rs.next()) {
			e = new Employee();
			e.setId(rs.getInt("id"));
			e.setName(rs.getString("name"));
			e.setSalary(rs.getDouble("salary"));
			e.setAddress(rs.getString("address"));
		}
		return e;
	}
}
