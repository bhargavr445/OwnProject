package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.model.Student;

@Service
public interface StudentService {

	Student saveStudent(Student student);

	List<Student> search(Student student);

}
