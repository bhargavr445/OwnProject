package com.project.dao;

import java.util.List;

import com.project.model.Contract;

public interface ContractDao {

	List<Contract> getEmpByName(Contract contract);

	List<String> getDeptList();

	List<Contract> searchByJobTitle(Contract contract);

	int editContractStudent(Contract contract);

	List<Contract> getStudentInImage(Contract contract);

	List<String> getJobTitle();

	List<Contract> searchByNameString(Contract contract);

}
