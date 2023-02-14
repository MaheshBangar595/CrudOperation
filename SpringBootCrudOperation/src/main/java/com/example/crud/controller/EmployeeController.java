package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Employee;
import com.example.crud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/addEmp")
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "Employee Added";
	}
    
	@GetMapping(value="/getSingleemp/{id}")
	public Employee getSingleEmp(@PathVariable int id) {
		Employee employee = employeeService.getSingleEmployee(id);
		return employee;
	}
    
	@GetMapping(value="/getAllEmp")
	public List<Employee> getAllEmp() {
		List<Employee> elist = employeeService.getAllEmployee();
		return elist;
	}

	@PutMapping(value="/updateEmp")
	public Employee updateEmp(@RequestBody Employee employee) {
		Employee emp = employeeService.updateEmployee(employee);
		return emp;
	}
    
	@DeleteMapping(value="/deleteEmp/{id}")
	public List<Employee> deleteEmp(@PathVariable int id) {
		List<Employee> list = employeeService.deleteEmployee(id);
		return list;
	}

}
