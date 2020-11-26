package com.capg.employeepayrollapp.service;

import com.capg.employeepayrollapp.employeedto.EmployeePayrollDTO;
import com.capg.employeepayrollapp.exception.EmployeeException;
import com.capg.employeepayrollapp.model.Employee;

public interface IEmployeeService {
	public Employee addEmployee(EmployeePayrollDTO employeeDTO);
	public Employee getEmployeeById(Long id) throws EmployeeException;
	public void updateEmployeeById(Long id, EmployeePayrollDTO employeeDTO) throws EmployeeException;
	public void deleteEmployeeById(Long id);
}
