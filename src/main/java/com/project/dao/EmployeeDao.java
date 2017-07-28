package com.project.dao;

import java.util.List;

import com.project.model.Department;
import com.project.model.Employee;

public interface EmployeeDao {

	

	List<Employee> searchEmployee(Employee employee);

	List<Integer> getAllIds();

	Department searchEmployeeByLocation(Department dept);

}
