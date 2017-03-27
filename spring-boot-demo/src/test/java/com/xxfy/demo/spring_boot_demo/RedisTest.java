package com.xxfy.demo.spring_boot_demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.xxfy.demo.vo.UserVo;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest extends TestCase{
	
	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
    private RedisTemplate<String, Object> redisTemplate;
	
	
	@Test
	public void test() {
		//保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "中文");
		System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
	}
	
	
	@Test
	public void test2() {
		UserVo vo = new UserVo();
		vo.setUserId("001");
		vo.setUserName("萧萧风雨");
		vo.setPassword("123456");
		redisTemplate.opsForValue().set("user0001", vo);
		System.out.println(((UserVo) redisTemplate.opsForValue().get("user0001")).getPassword());
	}
	
 }
