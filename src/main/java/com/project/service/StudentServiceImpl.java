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
	
	public Student saveStudent(Student student) {
		Student str = studentDao.saveStudent(student);
		return str;
	}

	@Override
	public List<Student> search(Student student) {
		List<Student> searchResult = studentDao.search(student);
		List<Student> modifiedData = sampleutilClass.modifyData(searchResult);
		return modifiedData;
	}
	
	
}
