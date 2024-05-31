package com.srihari.emp.dao;

import java.util.List;

import com.srihari.emp.model.Employee;
//doa layer change
public interface EmployeeDAO {

	public abstract List<Employee> getAllEmployees();

	public abstract Employee getEmployeeById(int empId);

	public abstract boolean updateEmployeeDetails(Employee employee);

	public abstract int insertEmployeeRecord(Employee employee);

	public abstract int deleteEmployeeRecordById(int empId);
}
