package cn.niit.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import cn.niit.domain.Person;
import cn.niit.util.MybatisUtils;

public class PersonDaoImpl implements PersonDao {
    SqlSession session;
	@Override
	public Map getPersonInfo(Integer id) throws Exception {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("id", id);
        session = MybatisUtils.getSession();
        Map<Integer, Person> map = session.selectMap("getPersonInfo", map1, "id");
        session.commit();
        session.close();
		return map;
	}

	@Override
	public Map getPersonInfo1(Integer id) throws Exception {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("id", id);
		session = MybatisUtils.getSession();
		Map<Integer, Person> map = session.selectMap("getPersonInfo1", map1, "id");
		session.commit();
		session.close();
		return map;
	}

}
