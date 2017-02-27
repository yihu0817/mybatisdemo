package com.ittx.mybatis.demo1;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.mybatis.demo1.dao.UserDao;
import com.ittx.mybatis.demo1.model.User;

public class UserUserDaoTest {
	private static final Logger log = Logger.getLogger(UserUserDaoTest.class);
	private UserDao userDao;
	@Before
	public void before() throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		userDao = (UserDao) ctx.getBean("userDao");
	}

	@Test
	public void testSelectUserById() throws IOException {
		User user = userDao.selectUserByID(1);
		log.info(user);
	}



}
