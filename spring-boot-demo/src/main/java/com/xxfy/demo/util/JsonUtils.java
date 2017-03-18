package com.xxfy.demo.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * JSON工具类，与jackon解藕
 * @author Administrator
 *
 */
public class JsonUtils {
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	/**
	 * 把一个List转换成String
	 * @param <T>
	 * @param list
	 * @throws JsonGenerationException 
	 */
	public static <T> String toStringFromList(List<T> list) {
		try {
			return mapper.writeValueAsString(list);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 把一个Map转换成String
	 * @param map
	 * @return
	 */
	public static <T> String toStringFromMap(Map<String,Object> map) {
		try {
			return mapper.writeValueAsString(map);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 把一个Object转换成String
	 * @param map
	 * @return
	 */
	public static String toStringFromObject(Object obj) {
		try {
			return mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 把一个string字符串转换成一个map
	 * @param str
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Map toMapFormString(String str) {
		try {
			return mapper.readValue(str, Map.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 把一个字符串转换成一个javabean
	 * @param str
	 * @param t
	 * @return
	 */
	public static  <T> T toBeanFromString (String str,Class<T> t) {
		try {
			return mapper.readValue(str, t);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "xiaojun");
		map.put("age", 30);
		System.out.println(JsonUtils.toStringFromMap(map));
	}
	

}
