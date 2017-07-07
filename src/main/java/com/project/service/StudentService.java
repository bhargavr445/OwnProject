package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.model.Student;

@Service
public interface StudentService {

	Student saveStudent(Student student);

	List <Student> search(Student student);

	List<Student> loadData();

	String deletStudent(Student student);

	List<String> loadnames();

	List<Student> searchById(Student student);

	List<String> getContracts();

	int updateStudent(Student student);

	int addHomeStudent(Student student);

}
