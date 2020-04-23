package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.dao.StudentDao;
import com.dao.StudnetDaoImpl;
import com.po.Student;

class StudentDaoTest {
       StudentDao studentDao = new StudnetDaoImpl();
	@Test
	void findStudentById(int idCard) {
		Student student = studentDao.findStudentById(2018555);
		System.out.println(student);
	}

}
