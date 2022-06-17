package com.skillogic.employeemanagement.service;

import java.util.List;

import com.skillogic.employeemanagement.model.Employee;

public interface IEmpManagementService {
   public int registerEmployee(Employee employee) throws Exception;
   public String loginValidate(String email,String password) throws Exception;
   public List<Employee> getAllEmployees() throws Exception;
   public Employee getProfileByEmail(String email) throws Exception;
}
