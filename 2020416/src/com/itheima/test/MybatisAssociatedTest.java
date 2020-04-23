package com.itheima.test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.itheima.po.Person;
import com.itheima.utils.MybatisUtils;

class MybatisAssociatedTest {
    /**
     * 嵌套查询
     */
	@Test
	void findPersonByIdTest() {
		//1.通过工具类生成SqlSession对象
		SqlSession session = MybatisUtils.getSession();
		//2.使用MyBatis嵌套查询的方式查询id为1的人的信息
		Person person = session.selectOne("com.itheima.mapper.PersonMapper.findPersonById",1);
		//3.输出查询结果
		System.out.println(person);
		//4.关闭SqlSession
		session.close();
	}
    @Test
    void a2() {
    	//1.通过工具类生成SqlSession对象
    	SqlSession session = MybatisUtils.getSession();
    	//2.使用MyBatis嵌套结果的方法查询id为1的人的信息
    	Person person = session.selectOne("com.itheima.mapper.PersonMapper.findPersonById2", 1);
    	//3.输出查询结果信息
        System.out.println(person);
        //4.关闭SqlSession
        session.close();
    }
}
