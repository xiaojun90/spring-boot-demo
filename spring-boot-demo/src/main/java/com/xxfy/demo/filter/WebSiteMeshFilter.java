package com.xxfy.demo.filter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * sitemesh过滤器
 * @author Administrator
 *
 */
public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter{

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		//配置默认的渲染器. 将应用于所有路径.
		builder.addDecoratorPath("/admin/*", "/admin/index")  
		//配置默认的渲染器. 将应用于所有路径.
		.addExcludedPath("/admin/index")
		.addExcludedPath("/assets/**")
		.addExcludedPath("/js/**")
		.addExcludedPath("/css/**")
		.addExcludedPath("/img/**")
		.addExcludedPath("/login")  //登录
		.addExcludedPath("/logout");  //登出
	}
	
}
