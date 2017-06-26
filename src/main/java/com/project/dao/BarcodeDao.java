package com.project.dao;

import java.util.List;

import com.project.model.Barcode;

public interface BarcodeDao {

	List<Barcode> searchById(Barcode barcode);

	List<Barcode> getAllStudents();

	List<Barcode> getDeptList();

	List<Barcode> getDeptList(Barcode barcode);

	int addnewStudent(Barcode barcode);

	int deleteStudent(Barcode barcode);

	List<Barcode> getSelectedData(String deptName);

	List<Integer> getRegionIdlist();

	List <String> getSalInfo(String name);

	int editStudent(Barcode barcode);

}
