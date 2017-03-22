package com.xxfy.demo.spring_boot_demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.xxfy.demo.vo.User;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest extends TestCase{
	
	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
    private RedisTemplate<String, User> redisTemplate;
	
	@Test
	public void test() {
		//保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
	}
	
	@Test
	public void test1() {
		User user = new User("超人", 20);
        redisTemplate.opsForValue().set("user001", user);
        System.out.println(redisTemplate.opsForValue().get("超人").getAge());
		
	}
 }
