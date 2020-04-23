package com.itheima.test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.itheima.po.User;
import com.itheima.util.MybatisUtils;

class MybatisAssociatedTest {
   
	@Test
	void findUserTest() {
		//1.通过工具类生成SqlSession对象
		SqlSession session = MybatisUtils.getSession();
		//2.查询id为1的用户信息
		User user = session.selectOne("com.itheima.mapper.UserMapper.findUserWithOrders", 1);
		//3.输出查询结果信息
		System.out.println(user);
		//4.关闭SqlSession
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
