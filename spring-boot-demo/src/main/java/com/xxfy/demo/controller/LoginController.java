package com.xxfy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 登录Controller
 * @author Administrator
 *
 */
@Controller
public class LoginController {
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}

}
