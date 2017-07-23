package com.project.service;

import java.util.List;


import com.project.model.Employee;



public interface EmployeeService {

	List<Employee> searchEmployee(Employee employee);

	List<Integer> getAllIds();

}
