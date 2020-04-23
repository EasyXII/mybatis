package cn.niit.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import cn.niit.domain.Person;

class PersonDaoImplTest {
    PersonDao personDao = new PersonDaoImpl();
	@Test
	void getPersonInfo() throws Exception {
		Map<Integer, Person> personInfo = personDao.getPersonInfo(1);
		System.out.println(personInfo);
	}
    
	@Test
	void getPersonInfo1() throws Exception {
		Map<Integer, Person> personInfo = personDao.getPersonInfo1(1);
		System.out.println(personInfo);
	}
}
