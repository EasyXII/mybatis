package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.dao.CourseDao;
import com.dao.CourseDaoImpl;
import com.po.Course;

class CourseDaoTest {
      CourseDao courseDao = new CourseDaoImpl();
	@Test
	void findCourseById() {
		Course course = courseDao.findCourseById(1);
		System.out.println(course.getName());
	}

}
