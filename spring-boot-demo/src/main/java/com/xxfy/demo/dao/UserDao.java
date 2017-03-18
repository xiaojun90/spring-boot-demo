package com.xxfy.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.xxfy.demo.vo.UserVo;
@Mapper
public interface UserDao {
	
	public UserVo getUserById(String uId);

}
