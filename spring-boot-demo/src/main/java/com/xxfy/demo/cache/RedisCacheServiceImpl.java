package com.xxfy.demo.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service("redisCacheServiceImpl")
public class RedisCacheServiceImpl implements RedisCacheService {
	
	@Autowired
    private RedisTemplate<String, Object> redisTemplate;
	

	public void clear() {
	}

	public void evict(String arg0) {
		redisTemplate.delete(arg0);
	}

	@Override
	public Object get(String key) {
		return redisTemplate.opsForValue().get(key);
	}

	@Override
	public void put(String key, Object value) {
		redisTemplate.opsForValue().set(key, value);
	}
}
