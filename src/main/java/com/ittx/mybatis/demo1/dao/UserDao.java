package com.ittx.mybatis.demo1.dao;

import org.springframework.stereotype.Repository;

import com.ittx.mybatis.demo1.model.User;

@Repository("userDao")
public interface UserDao {
	public User selectUserByID(int id);
	public void insertUser(User user);
	public void deleteUserById(int id);
	public void updateUser(User user);
}
