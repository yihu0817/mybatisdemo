package com.ittx.mybatis.demo1;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ittx.mybatis.demo1.dao.UserDao;
import com.ittx.mybatis.demo1.model.User;

public class UserTwoTest {
	private static final Logger log = Logger.getLogger(UserTwoTest.class);
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void before() throws IOException {
		Reader reader = Resources.getResourceAsReader("Configuration.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}

	@Test
	public void testSelectUserById() throws IOException {
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			UserDao  userDao = sqlSession.getMapper(UserDao.class);
			User user = userDao.selectUserByID(1);
			
			log.info(user);
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}

	@Test
	public void testInsertUser() {
		SqlSession sqlSession = null;
		try {
			User user = new User("小明2",33);
			sqlSession = sqlSessionFactory.openSession();
			UserDao  userDao = sqlSession.getMapper(UserDao.class);
			userDao.insertUser(user);
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
	
	@Test
	public void testDeleteUserById() {
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			UserDao  userDao = sqlSession.getMapper(UserDao.class);
			userDao.deleteUserById(7);
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
	@Test
	public void testUpdateUser() {
		SqlSession sqlSession = null;
		try {
			User user = new User(1,"麻子",18);
			sqlSession = sqlSessionFactory.openSession();
			UserDao  userDao = sqlSession.getMapper(UserDao.class);
			userDao.updateUser(user);
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}

}
