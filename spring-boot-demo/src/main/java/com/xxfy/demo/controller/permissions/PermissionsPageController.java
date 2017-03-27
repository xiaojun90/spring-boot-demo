package com.xxfy.demo.controller.permissions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 权限管理模块页面跳转Controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin/permissions")
public class PermissionsPageController {
	
	/**
	 * 用户管理页跳转
	 * @return
	 */
	@RequestMapping(value="user",method=RequestMethod.GET)
	public String userMangerPage() {
		return "/admin/permissions/user";
	}
	
	@RequestMapping(value="usergroup",method=RequestMethod.GET)
	public String userGroupMangerPage() {
		return "/admin/permissions/usergroup";
	}

}
