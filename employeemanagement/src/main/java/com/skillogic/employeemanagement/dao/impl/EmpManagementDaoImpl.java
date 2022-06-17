package com.skillogic.employeemanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.skillogic.employeemanagement.dao.IEmpManagementDao;
import com.skillogic.employeemanagement.model.Employee;
import com.skillogic.employeemanagement.util.ConnectionUtil;

public class EmpManagementDaoImpl implements IEmpManagementDao{
	public static final String EMP_INSERT="insert into employee_details(emp_name,emp_password,emp_email,emp_contact,emp_salary,emp_gender,emp_role,emp_address) values(?,?,?,?,?,?,?,?)";
	public static final String LOGIN_VALIDATE ="select emp_role from employee_details where emp_email=? and emp_password=?";
	public static final String ALL_EMPS="select emp_id,emp_name,emp_email,emp_contact,emp_salary,emp_role,emp_address from employee_details";
	public static final String EMP_BYEMAIL="select emp_id,emp_name,emp_email,emp_contact,emp_salary,emp_role,emp_address from employee_details where emp_email=? ";
	int result = 0;
	@Override
	public int registerEmployee(Employee employee) throws Exception {
		System.out.println("RegisterDaoImpl.registerEmployee()");
		try(Connection con =ConnectionUtil.getConnectionObj();
			 PreparedStatement pstmt= con.prepareStatement(EMP_INSERT)){
			 System.out.println(con.hashCode());
			 pstmt.setString(1, employee.getName());
			 pstmt.setString(2, employee.getPassword());
			 pstmt.setString(3, employee.getEmail());
			 pstmt.setLong(4, employee.getContact());
			 pstmt.setDouble(5, employee.getSalary());
			 pstmt.setString(6, employee.getGender());
			 pstmt.setString(7, employee.getRole());
			 System.out.println(employee.getAddress());
			 pstmt.setString(8, employee.getAddress());
			 result = pstmt.executeUpdate();
		}catch(Exception e) {
			throw e;
		}
		return result;
	}
	@Override
	public String loginValidate(String email, String password) throws Exception {
		 Connection con  =null;
		 PreparedStatement pstmt =null;
		 ResultSet rs = null;
		 String message = null;
		try {
				 con = ConnectionUtil.getConnectionObj(); 
				 pstmt =con.prepareStatement(LOGIN_VALIDATE); 
				 pstmt.setString(1, email);
				  pstmt.setString(2, password); 
				  rs = pstmt.executeQuery(); 
				  if(rs.next()) {
				  message = rs.getString("emp_role"); 
				  }else { 
					  message ="Invalid Credentials";
					  }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
				/*	 if(rs!=null && pstmt!=null && con!=null) {
						 rs.close();
						 pstmt.close();
						 con.close();
					 }*/
		 }
		return message;
	}
	@Override
	public List<Employee> getAllEmployees() throws Exception {
		 Connection con  =null;
		 PreparedStatement pstmt =null;
		 ResultSet rs = null;
		 List<Employee> empList = new ArrayList<>();
		 try {
			 con = ConnectionUtil.getConnectionObj();
			 pstmt = con.prepareStatement(ALL_EMPS);
			 rs = pstmt.executeQuery();
			 while(rs.next()) {
				 int id = rs.getInt("emp_id");
				 String name = rs.getString("emp_name");
				 String email = rs.getString("emp_email");
				 Long contact = rs.getLong("emp_contact");
				 Double salary = rs.getDouble("emp_salary");
				 String role = rs.getString("emp_role");
				 String address = rs.getString("emp_address");
				 Employee employee = new Employee();
				 employee.setEmpId(id);
				 employee.setName(name);
				 employee.setEmail(email);
				 employee.setContact(contact);
				 employee.setSalary(salary);
				 employee.setRole(role);
				 employee.setAddress(address);
				 empList.add(employee);
				 
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
			 throw e;
		 }
		return empList;
	}
	@Override
	public Employee getProfileByEmail(String email) throws Exception {
		 Connection con  =null;
		 PreparedStatement pstmt =null;
		 ResultSet rs = null;
		 Employee employee = null;
		try {
			con = ConnectionUtil.getConnectionObj();
			pstmt = con.prepareStatement(EMP_BYEMAIL);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery(); 
			if(rs.next()) {
				employee = new Employee();
				 int id = rs.getInt("emp_id");
				 String name = rs.getString("emp_name");
				 String emails = rs.getString("emp_email");
				 Long contact = rs.getLong("emp_contact");
				 Double salary = rs.getDouble("emp_salary");
				 String role = rs.getString("emp_role");
				 String address = rs.getString("emp_address");
				 employee.setEmpId(id);
				 employee.setName(name);
				 employee.setEmail(emails);
				 employee.setContact(contact);
				 employee.setSalary(salary);
				 employee.setRole(role);
				 employee.setAddress(address);
				
			}
		}catch(Exception e) {
			throw e;
		}
		return employee;
	}

}
