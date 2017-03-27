package com.xxfy.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.xxfy.demo.vo.UserVo;

@Service("redisDemoService")
public class RedisDemoService {
	
	@Cacheable(value="userCache",keyGenerator="wiselyKeyGenerator")
	public UserVo findUser(String userId) {
		System.out.println("新增用户");
		return new UserVo();
	}

}
