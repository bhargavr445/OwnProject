package com.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.model.Student;

@Repository
public interface StudentDao {

	Student saveStudent(Student student);

	List<Student> search(Student student);

}
