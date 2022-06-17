package com.skillogic.employeemanagement.service.impl;

import java.util.List;

import com.skillogic.employeemanagement.dao.impl.EmpManagementDaoImpl;
import com.skillogic.employeemanagement.model.Employee;
import com.skillogic.employeemanagement.service.IEmpManagementService;

public class EmpManagementServiceImpl implements IEmpManagementService{

	@Override
	public int registerEmployee(Employee employee) throws Exception {
		System.out.println("RegisterServiceImpl.registerEmployee()");
	    //Call Dao Layer method(creating object for dao class)
		EmpManagementDaoImpl registerDaoImpl = new EmpManagementDaoImpl();
		 int result = registerDaoImpl.registerEmployee(employee);
		return result;
	}

	@Override
	public String loginValidate(String email, String password) throws Exception {
	     //call DAO Layer
		EmpManagementDaoImpl emDaoImpl = new EmpManagementDaoImpl();
		String message=emDaoImpl.loginValidate(email, password);
		return message;
	}

	@Override
	public List<Employee> getAllEmployees() throws Exception {
		EmpManagementDaoImpl emDaoImpl = new EmpManagementDaoImpl();
		List<Employee> list=emDaoImpl.getAllEmployees();
		return list;
	}

	@Override
	public Employee getProfileByEmail(String email) throws Exception {
		EmpManagementDaoImpl emDaoImpl = new EmpManagementDaoImpl();
		Employee e = emDaoImpl.getProfileByEmail(email);
		return e;
	}

}
