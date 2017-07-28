package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.EmployeeDao;
import com.project.model.Department;
import com.project.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public List<Employee> searchEmployee(Employee employee) {
		List<Employee> empList = employeeDao.searchEmployee(employee);
		return empList;
	}

	@Override
	public List<Integer> getAllIds() {
		List<Integer> idList = employeeDao.getAllIds();
		return idList;
	}

	@Override
	public Department getEmpByLoc(Department dept) {
		
		Department empList = employeeDao.searchEmployeeByLocation(dept);
		return empList;
	}
	
	
	
	
}
