package com.project.service;

import java.util.List;

import com.project.model.Barcode;

public interface BarcodeService {

	List<Barcode> saveStudent(Barcode barcode);

	List<Barcode> getAllStudent();

	List<Barcode> getDeptList();

	List<Barcode> getListByJobTitle(Barcode barcode);

	int addnewStudent(Barcode barcode);

	int deleteStudent(Barcode barcode);

	

	List<Barcode> getSelectedData(String deptName);

	List<Integer> getRegionIdlist();

	List <String> getSalInfo(String name);

	int editStudent(Barcode barcode);

	Barcode getDataDisplay(String emptName);

}
