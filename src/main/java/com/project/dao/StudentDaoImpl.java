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
	public List <Student> search(Student student) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List <Student> searchStudent =  sqlSession.selectList("searchStudent", student);
		return searchStudent;
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
		int i = sqlSession.delete("deleteAdd", student);
		int stuDel = sqlSession.delete("deleteStudent",student);
		if(i ==1){
			return "deleted successfully";
		}else{
			return "not deleted";
		}
		
	}
	@Override
	public List<String> loadNames() {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<String> loadNames = sqlSession.selectList("loadStudentNames");
		return loadNames;
		
	}

	@Override
	public List<Student> searchById(Student student) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Student> getById = sqlSession.selectList("searchById");
		return getById;
	}

	@Override
	public List<String> getContracts() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<String> getContracts = sqlSession.selectList("getContracts");
		return getContracts;
	}

	

}
