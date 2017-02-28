package com.xxfy.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/helloWorld")
	public  String helloWrold() {
		return "hello world";
	}
}
