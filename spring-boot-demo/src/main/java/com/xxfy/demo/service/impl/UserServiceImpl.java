package com.xxfy.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxfy.demo.cache.RedisCacheService;
import com.xxfy.demo.constants.RedisCacheConstants;
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
	
	@Resource(name="redisCacheServiceImpl")
	private RedisCacheService redisCachService;
	
	public UserVo getUserById(String uId) {
		UserVo vo = null;
		UserVo cacheUser = (UserVo)redisCachService.get(RedisCacheConstants.USER_PREX + uId);
		if (null == cacheUser) {
			vo = userDao.getUserById(uId);
			if (null == vo) {
				return null;
			} else {
				redisCachService.put(RedisCacheConstants.USER_PREX + uId, vo);
			}
			return vo;
		} 
		return cacheUser;
	}
	
	public void updateUser(UserVo user) {
		
	}

	@Override
	public List<UserVo> getAllUser() {
		return userDao.getAllUser();
	}
}
