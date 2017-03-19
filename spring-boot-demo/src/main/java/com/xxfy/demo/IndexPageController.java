package com.xxfy.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {
	
	@Value("${application.message:Hello World}")
	private String message = "Hello World";
	@RequestMapping(value={"/index","/","main"})
	public String indexPage() {
		return "admin/index";
	}
	
}
