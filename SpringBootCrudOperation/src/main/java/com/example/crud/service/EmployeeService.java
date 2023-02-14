package com.example.crud.service;

import java.util.List;

import com.example.crud.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);

	Employee getSingleEmployee(int id);

	List<Employee> getAllEmployee();

	Employee updateEmployee(Employee employee);

	List<Employee> deleteEmployee(int id);

}
