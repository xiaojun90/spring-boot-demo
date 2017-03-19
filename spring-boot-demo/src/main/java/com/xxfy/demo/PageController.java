package com.xxfy.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 页面跳转Controller
 * @author Administrator
 *
 */
@Controller
public class PageController {
	
	/**
	 * 首页跳转
	 * @return
	 */
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String mainPage() {
		return "main";
	}
	
	/**
	 * 后台首页跳转页面
	 * @return
	 */
	@RequestMapping(value="/admin/index",method=RequestMethod.GET)
	public String adminIndexPage() {
		return "admin/index";
	}

}
