package com.xxfy.demo.util;

import org.apache.tomcat.util.codec.binary.Base64;

import com.xxfy.demo.vo.UserVo;

/**
 * 安全工具类
 * @author Administrator
 *
 */
public class SecuityUtils {
	public static String encode(String str) {
		return new String(Base64.encodeBase64(str.getBytes()));
	}
	
	public static void main(String[] args) {
		System.out.println(SecuityUtils.encode("xiaojun"));
		System.out.println(SecuityUtils.encode("xiaojunsssssss"));
		System.out.println(SecuityUtils.encode("xiaojunsssssss1111"));
		/*UserVo user = new UserVo("xiaojun","123456","838249367@qq.com","13538148097","1","SU001");*/
		
		/*System.out.println(SecuityUtils.encode(JsonUtils.toStringFromObject(user)));*/
	}
}
