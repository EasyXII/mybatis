package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.po.Student;
import com.util.MybatisUtils;

public class StudnetDaoImpl implements StudentDao {
       SqlSession session;
	@Override
	public Student findStudentById(int idCard) {
		session = MybatisUtils.getSession();
		Student student = session.selectOne("findStudentById", idCard);
		session.commit();
		session.close();
		return student;
	}

}
