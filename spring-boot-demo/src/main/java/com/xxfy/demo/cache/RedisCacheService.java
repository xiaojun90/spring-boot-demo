package com.xxfy.demo.cache;

public interface RedisCacheService {
	
	/**
	 * 根据KEY查询Redis的Value
	 * @param key
	 * @return
	 */
	public Object get(String key);
	
	/**
	 * 保存redis缓存
	 * @param key
	 * @param value
	 */
	public void put(String key,Object value);
	
	/**
	 * 删除key
	 * @param arg0
	 */
	public void evict(String arg0);

}
