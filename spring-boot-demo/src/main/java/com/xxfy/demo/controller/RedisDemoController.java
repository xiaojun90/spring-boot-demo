package com.xxfy.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xxfy.demo.service.RedisDemoService;

@Controller
public class RedisDemoController {
	
	@Autowired
	private RedisDemoService redisDemoService;
	
	/**
	 * redis测试
	 */
	@RequestMapping(value="redis",method=RequestMethod.GET)
	public void redisTest() {
		
		redisDemoService.findUser("U001");
		
		redisDemoService.findUser("U001");
		
		redisDemoService.findUser("U002");
	}

}
