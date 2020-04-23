package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.po.Course;
import com.util.MybatisUtils;

public class CourseDaoImpl implements CourseDao {
        SqlSession session;
	@Override
	public Course findCourseById(int courseId) {
		session = MybatisUtils.getSession();
		Course course = session.selectOne("findCourseById", courseId);
		session.commit();
		session.close();
		return course;
	}

}
