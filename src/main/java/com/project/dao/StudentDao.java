package com.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.model.Student;

@Repository
public interface StudentDao {

	Student saveStudent(Student student);

	List <Student> search(Student student);

	List<Student> load();

	String deleteStudent(Student student);

	List<String> loadNames();

	List<Student> searchById(Student student);

	List<String> getContracts();
}
