package com.ema.app.service;

import java.util.List;

import com.ema.app.entity.Employee;

public interface IEmployeeService {
	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();
}
