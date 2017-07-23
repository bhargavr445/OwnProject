package com.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.Barcode;
import com.project.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	SqlSessionFactory sqlSessionFactory;


//	@Override
//	public List<Barcode> searchById(Barcode barcode) {
//		SqlSession sqlSession = null;
//		sqlSession = sqlSessionFactory.openSession();
//		List<Barcode> details = sqlSession.selectOne(statement, parameter)
//		return details;
//	}


	


	@Override
	public List<Employee> searchEmployee(Employee employee) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Employee> empList= sqlSession.selectList("searchEmployee", employee);
		return empList;
	}


	@Override
	public List<Integer> getAllIds() {
		SqlSession sqlSession = null;
		 sqlSession = sqlSessionFactory.openSession();
		List<Integer> idList = sqlSession.selectList("getAllIds");
		return idList;
	}


	

}
