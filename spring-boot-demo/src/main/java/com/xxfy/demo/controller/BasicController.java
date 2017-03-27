package com.xxfy.demo.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class BasicController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * redis测试
	 */
	@RequestMapping(value="redis",method=RequestMethod.GET)
	public void redisTest() {
		
	}
}
