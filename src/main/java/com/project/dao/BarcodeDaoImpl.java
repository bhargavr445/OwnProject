package com.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.Barcode;

@Repository
public class BarcodeDaoImpl implements BarcodeDao {
	@Autowired
	SqlSessionFactory sqlSessionFactory;


	@Override
	public List<Barcode> searchById(Barcode barcode) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Barcode> details = sqlSession.selectList("searchByBarId",barcode);
		return details;
	}


	@Override
	public List<Barcode> getAllStudents() {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Barcode> details = sqlSession.selectList("getAllDetails");
		return details;
		
	}


	@Override
	public List<Barcode> getDeptList() {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Barcode> details = sqlSession.selectList("getDeptList");
		return details;
	}


	@Override
	public List<Barcode> getDeptList(Barcode barcode) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Barcode> details = sqlSession.selectList("goToViewtab",barcode);
		return details;
	}


	@Override
	public int addnewStudent(Barcode barcode) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		int details = sqlSession.insert("addnewStudent", barcode);
		return details;
	}


	@Override
	public int deleteStudent(Barcode barcode) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		int msg = sqlSession.delete("deleteStudent", barcode);
		return msg;
	}


	@Override
	public List<Barcode> getSelectedData(String deptName) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Barcode> details = sqlSession.selectList("selectedData",deptName);
		return details;
	}


	@Override
	public List<Integer> getRegionIdlist() {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List<Integer> regionId = sqlSession.selectList("regionIdlist");
		return regionId;
	}


	@Override
	public List <String> getSalInfo(String name) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		List <String> salDetails = sqlSession.selectList("getSalInfo", name);
		return salDetails;
	}

	@Override
	public int editStudent(Barcode barcode) {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		int msg = sqlSession.update("editStudent", barcode);
		return msg;
	}

}
