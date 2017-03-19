package com.xxfy.demo.util;

import org.apache.tomcat.util.codec.binary.Base64;

/**
 * 安全工具类
 * @author Administrator
 *
 */
public class SecuityUtils {
	public static String encode(String str) {
		return new String(Base64.encodeBase64(str.getBytes()));
	}
}
