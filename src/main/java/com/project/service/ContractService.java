package com.project.service;

import java.util.List;

import com.project.model.Contract;

public interface ContractService {

	List<Contract> getEmpByName(Contract contract);

	List<String> getDeptList();

	List<Contract> searchByJobTitle(String department);

	int editContractStudent(Contract contract);

	List<Contract> getStudentInImage(Contract contract);

	List<String> getjobTitle();

	List<Contract> searchByNameString(Contract contract);

	int deletecontract(Contract contract);

	

}
