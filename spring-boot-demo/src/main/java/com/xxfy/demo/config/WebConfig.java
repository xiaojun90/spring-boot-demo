package com.xxfy.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.xxfy.demo.filter.CommonFilter;
import com.xxfy.demo.filter.WebSiteMeshFilter;

@Configuration  
public class WebConfig extends WebMvcConfigurerAdapter{
	
	/**
	 * 通用过滤器配置
	 * @return
	 */
	@Bean 
	public FilterRegistrationBean commonFilter() {
		FilterRegistrationBean fitler = new FilterRegistrationBean();  
        CommonFilter commonFilter = new CommonFilter();  
        fitler.setFilter(commonFilter); 
        fitler.addUrlPatterns("/*");
        return fitler;
	}
	
	/**
	 * sithmesh过滤器配置
	 * @return
	 */
	@Bean  
    public FilterRegistrationBean siteMeshFilter(){  
        FilterRegistrationBean fitler = new FilterRegistrationBean();  
        WebSiteMeshFilter siteMeshFilter = new WebSiteMeshFilter();  
        fitler.setFilter(siteMeshFilter);  
        return fitler;  
    } 
}
