package com.xxfy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxfy.demo.service.UserService;
import com.xxfy.demo.vo.UserVo;

@RestController
public class HelloWorldController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/helloWorld")
	public  String helloWrold() {
		return "hello world";
	}
	
	@RequestMapping("/user/{id}")
	public UserVo getUserById(@PathVariable("id") String id) {
		System.out.println(userService.getUserById(id).getUserName());
		return userService.getUserById(id);
	}
}
