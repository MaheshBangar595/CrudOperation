package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Employee;
import com.example.crud.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeerepo;

	@Override
	public void addEmployee(Employee employee) {

		employeerepo.save(employee);

	}

	@Override
	public Employee getSingleEmployee(int id) {
		Employee employee = employeerepo.findById(id).get();
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> eList = employeerepo.findAll();
		return eList;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp = employeerepo.save(employee);
		return emp;
	}

	@Override
	public List<Employee> deleteEmployee(int id) {
		employeerepo.deleteById(id);
		List<Employee> elist = employeerepo.findAll();
		return elist;
	}

}
