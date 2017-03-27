package com.xxfy.demo.init;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.xxfy.demo.cache.RedisCacheService;
import com.xxfy.demo.constants.RedisCacheConstants;
import com.xxfy.demo.service.UserService;
import com.xxfy.demo.vo.UserVo;

/**
 * 
 * 数据初始化
 * @author Administrator
 *
 */
@Component
public class RedisCacheInitBean implements InitializingBean{
	
	@Resource(name="redisCacheServiceImpl")
	private RedisCacheService redisCachService;
	@Resource(name="UserServiceImpl")
	private UserService userService;

	@Override
	public void afterPropertiesSet() throws Exception {
		//缓存用户信息
		System.out.println("缓存用户信息开始");
		List<UserVo> userList = userService.getAllUser();
		if (null == userList || userList.isEmpty()) {
			return ;
		}
		for (UserVo vo : userList) {
			redisCachService.put(RedisCacheConstants.USER_PREX + vo.getUserId(), vo);
		}
		System.out.println("缓存用户信息结束");
	}

}
