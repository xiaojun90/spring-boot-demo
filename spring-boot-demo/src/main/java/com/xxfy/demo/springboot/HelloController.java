package com.xxfy.demo.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	/*@RequestMapping(method=RequestMethod.GET,path="hello")
	public String hello() {
		return "hello world";
	}*/
	
	@RequestMapping(method=RequestMethod.GET,path="hello/{name}")
	public String getName(@PathVariable("name") String name) {
		return "hello world," + name;
	}
	
	
}
