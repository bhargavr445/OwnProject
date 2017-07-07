package com.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.Contract;

@Repository
public class ContractDaoImpl implements ContractDao{

	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Override
	public List<Contract> getEmpByName(Contract contract) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Contract> details = sqlSession.selectList("getEmpByName",contract);
		return details;
	}

	@Override
	public List<String> getDeptList() {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<String> deptList = sqlSession.selectList("getDeptListC");
		return deptList;
	}

	@Override
	public List<Contract> searchByJobTitle(Contract contract) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Contract> empList = sqlSession.selectList("searchByJobTitle", contract);
		return empList;
	}

	@Override
	public int editContractStudent(Contract contract) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		int empList = sqlSession.update("updateContract", contract);
		return empList;
	}

	@Override
	public List<Contract> getStudentInImage(Contract contract) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Contract> empList = sqlSession.selectList("imageResults", contract);
		return empList;
	}

	@Override
	public List<String> getJobTitle() {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<String> jobTitlelist = sqlSession.selectList("jobTitleList");
		return jobTitlelist;
	}

	@Override
	public List<Contract> searchByNameString(Contract contract) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Contract> empList = sqlSession.selectList("searchByNameString", contract);
		return empList;
	}

}
