package com.project.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StudentDao;
import com.project.model.Student;
import com.project.util.SampleUtilClass;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	SampleUtilClass sampleutilClass;
	
	@Override
	public Student saveStudent(Student student) {
		Student str = studentDao.saveStudent(student);
		return str;
	}

	@Override
	public List <Student> search(Student student) {
		List <Student> searchResult = studentDao.search(student);
		//List <Student> modifiedData = sampleutilClass.modifyData(searchResult);
		return searchResult;
	}

	@Override
	public List<Student> loadData() {
		List<Student> loadStudent = studentDao.load();
		return loadStudent;
	}

	@Override
	public String deletStudent(Student student) {
		String loadStudent = studentDao.deleteStudent(student);
		return loadStudent;
	}

	@Override
	public List<String> loadnames() {
		// TODO Auto-generated method stub
		List<String> loadNames = studentDao.loadNames();
		return loadNames;
	}

	@Override
	public List<Student> searchById(Student student) {
		// TODO Auto-generated method stub
		List<Student> getById = studentDao.searchById(student);
		return getById;
	}
//	
	@Override
	public List<String> getContracts() {
		List<String> getContracts = studentDao.getContracts();
		return getContracts;
	}

	@Override
	public int updateStudent(Student student) {
		int i = studentDao.updateStudent(student);
		return i;
	}

	@Override
	public int addHomeStudent(Student student) {
		int i = studentDao.addHomeStudent(student);
		return i;
	}

	
}