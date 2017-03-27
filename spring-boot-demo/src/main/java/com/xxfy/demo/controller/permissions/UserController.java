package com.xxfy.demo.controller.permissions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxfy.demo.service.UserService;
import com.xxfy.demo.vo.UserVo;

/**
 * 用户管理Controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/admin/permissions/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/{uId}")
	public UserVo getUserById(@PathVariable("uId") String uId) {
		return userService.getUserById(uId);
	}
}
