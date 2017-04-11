package com.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	public Student saveStudent(Student student) {
		
		SqlSession sqlSession = null;
		//System.out.println("Student Result ==="+student);
		//System.out.println("SqlSession factory ===" + sqlSessionFactory);
		sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("insertStudent", student);
		System.out.println("succeessfully Inserted");
		return student;
	}

	@Override
	public List<Student> search(Student student) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Student> searStudent = sqlSession.selectList("searchStudent", student);
		return searStudent;
	}

	@Override
	public List<Student> load() {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Student> loadStudent = sqlSession.selectList("loadStudent");
		return loadStudent;
	
	}

	@Override
	public String deleteStudent(Student student) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		int i = sqlSession.delete("deleteStudent",student);
		if(i ==1){
			return "deleted successfully";
		}else{
			return "not deleted";
		}
		
	}

	

}
