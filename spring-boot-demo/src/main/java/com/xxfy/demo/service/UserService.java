package com.xxfy.demo.service;

import com.xxfy.demo.vo.UserVo;

/**
 * user service接口
 * @author Administrator
 *
 */
public interface UserService {
	
	/**
	 * 根据用户ID查询用户信息
	 * @param uId
	 * @return
	 */
	UserVo getUserById(String uId);
}
