package com.ittx.mybatis.demo1.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.ittx.mybatis.demo1.model.User;

@Repository("annotationUserDao")
public interface AnnotationUserDao {
	@Select("select * from mybatis_user where id = #{id}")
	public User selectUserByID(int id);
	@Insert("insert into mybatis_user (name,age)values(#{name},#{age})")
	public void insertUser(User user);
	@Delete("delete from mybatis_user where id=#{id}")
	public void deleteUserById(int id);
	@Update("update mybatis_user set name=#{name} , age=#{age} where id=#{id}")
	public void updateUser(User user);
}
