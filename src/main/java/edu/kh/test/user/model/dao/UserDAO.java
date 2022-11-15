package edu.kh.test.user.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	
}
