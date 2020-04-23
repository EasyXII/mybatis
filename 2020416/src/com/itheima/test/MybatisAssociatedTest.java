package com.itheima.test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.itheima.po.Person;
import com.itheima.utils.MybatisUtils;

class MybatisAssociatedTest {
    /**
     * Ƕ�ײ�ѯ
     */
	@Test
	void findPersonByIdTest() {
		//1.ͨ������������SqlSession����
		SqlSession session = MybatisUtils.getSession();
		//2.ʹ��MyBatisǶ�ײ�ѯ�ķ�ʽ��ѯidΪ1���˵���Ϣ
		Person person = session.selectOne("com.itheima.mapper.PersonMapper.findPersonById",1);
		//3.�����ѯ���
		System.out.println(person);
		//4.�ر�SqlSession
		session.close();
	}
    @Test
    void a2() {
    	//1.ͨ������������SqlSession����
    	SqlSession session = MybatisUtils.getSession();
    	//2.ʹ��MyBatisǶ�׽���ķ�����ѯidΪ1���˵���Ϣ
    	Person person = session.selectOne("com.itheima.mapper.PersonMapper.findPersonById2", 1);
    	//3.�����ѯ�����Ϣ
        System.out.println(person);
        //4.�ر�SqlSession
        session.close();
    }
}
