package com.xxfy.demo.spring_boot_demo;


import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xxfy.demo.cache.RedisCacheService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisCacheTest {

	@Resource(name="redisCacheServiceImpl")
	private RedisCacheService redisCacheService;
	
	/*@Test
	public void test1() {
		redisCacheService.put("test1", "中文");
		System.out.println(redisCacheService.get("test1"));
		redisCacheService.evict("test1");
		System.out.println(redisCacheService.get("test1"));
		
	}*/
}
