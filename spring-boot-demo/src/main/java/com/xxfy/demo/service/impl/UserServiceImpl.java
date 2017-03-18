package com.xxfy.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxfy.demo.dao.UserDao;
import com.xxfy.demo.service.UserService;
import com.xxfy.demo.vo.UserVo;

/**
 * user service
 * @author Administrator
 *
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public UserVo getUserById(String uId) {
		return userDao.getUserById(uId);
	}
	
}
