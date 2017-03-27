package com.xxfy.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xxfy.demo.vo.UserVo;
@Mapper
public interface UserDao {
	
	public UserVo getUserById(String uId);
	
	List<UserVo> getAllUser();

}
