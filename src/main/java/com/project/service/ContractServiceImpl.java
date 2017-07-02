package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ContractDao;
import com.project.model.Contract;

@Service
public class ContractServiceImpl implements ContractService{

	@Autowired
	ContractDao contractDao;
	
	@Override
	public List<Contract> getEmpByName(Contract contract) {
		List<Contract> empList = contractDao.getEmpByName(contract);
		return empList;
	}

	@Override
	public List<String> getDeptList() {
		List<String> deptList = contractDao.getDeptList();
		return deptList;
	}

	@Override
	public List<Contract> searchByJobTitle(Contract contract) {
		List<Contract> empList = contractDao.searchByJobTitle(contract);
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
	
	

}
