package com.itheima.test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.itheima.po.User;
import com.itheima.util.MybatisUtils;

class MybatisAssociatedTest {
   
	@Test
	void findUserTest() {
		//1.ͨ������������SqlSession����
		SqlSession session = MybatisUtils.getSession();
		//2.��ѯidΪ1���û���Ϣ
		User user = session.selectOne("com.itheima.mapper.UserMapper.findUserWithOrders", 1);
		//3.�����ѯ�����Ϣ
		System.out.println(user);
		//4.�ر�SqlSession
		session.close();
	}
    @Test
    void findUserTest2() {
    	SqlSession session = MybatisUtils.getSession();
    	User user = session.selectOne("com.itheima.mapper.UserMapper.findUserWithOrders2", 1);
    	System.out.println(user);
    	session.close();
    }
    
}
