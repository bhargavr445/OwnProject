package com.project.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.BarcodeDao;
import com.project.model.Barcode;

@Service
public class BarcodeServiceImpl implements BarcodeService{
	
	@Autowired
	BarcodeDao barcodeDao;

	@Override
	public List<Barcode> saveStudent(Barcode barcode) {
		List<Barcode> details = barcodeDao.searchById(barcode);
		return details;
	}

	@Override
	public List<Barcode> getAllStudent() {
		List<Barcode> details = barcodeDao.getAllStudents();
		return details;
	}

	@Override
	public List<Barcode> getDeptList() {
		List<Barcode> deptList = barcodeDao.getDeptList();
		return deptList;
	}

	@Override
	public List<Barcode> getListByJobTitle(Barcode barcode) {
		List<Barcode> jobList = barcodeDao.getDeptList(barcode);
		return jobList;
	}

	@Override
	public int addnewStudent(Barcode barcode) {
		int msg = barcodeDao.addnewStudent(barcode);
		return msg;
	}

	@Override
	public int deleteStudent(Barcode barcode) {
		int msg = barcodeDao.deleteStudent(barcode);
		return msg;
	}

	@Override
	public List<Barcode> getSelectedData(String deptName) {
		List<Barcode> selectedList = barcodeDao.getSelectedData(deptName);
		return selectedList;
	}

	@Override
	public List<Integer> getRegionIdlist() {
		List<Integer> regionid = barcodeDao.getRegionIdlist();
		return regionid;
	}

	@Override
	public List <String> getSalInfo(String name) {
		List <String> salDetails = barcodeDao.getSalInfo(name);
		return salDetails;
	}

	@Override
	public int editStudent(Barcode barcode) {
		int msg = barcodeDao.editStudent(barcode);
		return msg;
	}

	

	
	
	
	




	

	
}