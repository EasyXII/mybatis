package cn.niit.dao;

import java.util.Map;

import cn.niit.domain.Person;

public interface PersonDao {
     Map getPersonInfo(Integer id)throws Exception;
     Map getPersonInfo1(Integer id)throws Exception;
}
