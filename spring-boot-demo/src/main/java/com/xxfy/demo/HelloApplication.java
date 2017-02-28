package com.xxfy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


/**
 * SpringBoot的启动类
 * @author Administrator
 *
 */
@SpringBootApplication
public class HelloApplication extends org.springframework.boot.web.support.SpringBootServletInitializer {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloApplication.class);
	}
	

}
