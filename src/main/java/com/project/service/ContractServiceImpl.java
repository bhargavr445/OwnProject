package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ContractDao;
import com.project.model.Contract;
import com.project.util.ContractUtillClass;

@Service
public class ContractServiceImpl implements ContractService{

	@Autowired
	ContractDao contractDao;
	
	@Autowired
	ContractUtillClass contractUtillClass;
	
	@Override
	public List<Contract> getEmpByName(Contract contract) {
		List<Contract> empList = contractDao.getEmpByName(contract);
		//List<Contract> empTax = contractUtillClass.taxCalc(empList);
		return empList;
	}

	@Override
	public List<String> getDeptList() {
		List<String> deptList = contractDao.getDeptList();
		return deptList;
	}

	@Override
	public List<Contract> searchByJobTitle(String department) {
		List<Contract> empList = contractDao.searchByJobTitle(department);
		
		//List<Contract> empTax = contractUtillClass.taxCalc(empList);
		return empList;
	}

	@Override
	public int editContractStudent(Contract contract) {
		int empList = contractDao.editContractStudent(contract);
		return empList;
	}

	@Override
	public List<Contract> getStudentInImage(Contract contract) {
		List<Contract> imageList = contractDao.getStudentInImage(contract);
		return imageList;
	}

	@Override
	public List<String> getjobTitle() {
		List<String> jobTitleList = contractDao.getJobTitle();
		return jobTitleList;
	}

	@Override
	public List<Contract> searchByNameString(Contract contract) {
		List<Contract> clist =contractDao.searchByNameString(contract);
		return clist;
	}

	@Override
	public int deletecontract(Contract contract) {
		int str = contractDao.deletecontract(contract);
		return str;
	}

	
	
	

}
