package com.xxfy.demo;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {
	
	@Value("${application.message:Hello World}")
	private String message = "Hello World";
	@RequestMapping("/index")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}
}
