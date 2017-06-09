package com.ittx.mybatis.demo1;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.mybatis.demo1.dao.AnnotationUserDao;
import com.ittx.mybatis.demo1.model.User;

public class AnnotationUserDaoTest {
	private static final Logger log = Logger.getLogger(AnnotationUserDaoTest.class);
	private AnnotationUserDao userDao;
	@Before
	public void before() throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation-spring-mybatis.xml");
		userDao = (AnnotationUserDao) ctx.getBean("annotationUserDao");
	}

	@Test
	public void testSelectUserById() throws IOException {
		User user = userDao.selectUserByID(1);
		log.info(user);
	}
	
	@Test
	public void testUpdateUser(){
		User user = userDao.selectUserByID(1);
		user.setName("张三");
		userDao.updateUser(user);
	}
}
