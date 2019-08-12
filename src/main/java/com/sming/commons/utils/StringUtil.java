package com.sming.commons.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @作者: 时明明
 * @日期: 2019年8月10日
 * @时间: 上午12:23:45 字符串工具类
 * 新增一些方法
 */
public class StringUtil {
	private StringUtil() {
	}

//	判断源字符串是否有值，空引号也算没值
	public static boolean isEmpty(String target) {
		return target != null && target.length() > 0;
	}

//	判断源字符串是否有值，空引号和空格也算没值
	public static boolean hasLength(String target) {
		return isEmpty(target) && target.trim().length() > 0;

	}

//	判断是否为手机号码
	public static boolean isPhone(String target) {
		String reg_phone = "^1[3578]\\d{9}$";
		return target.matches(reg_phone);
	}

//	判断是否为电子邮箱
	public static boolean isEmail(String target) {
		String reg_email = "^\\w+@\\w+\\.(com|cn|com\\.cn)$";
		return target.matches(reg_email);
	}

//	判断是否全部为字母
	public static boolean isLetter(String target) {
		if (hasLength(target)) {

			return target.matches("^[a-zA-Z]+$");
		}
		return false;
	}

//	获取n位随机英文字符串
	public static String getStringAllLetter(int n) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				int random = (int) (Math.random() * str.length());
				sb.append(str.charAt(random));
			}
		}
		return sb.toString();
	}

//	获取n位随机英文和数字字符串
	public static String getStringOfLetterWithNumber(int n) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuffer sb = new StringBuffer();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				int random = (int) (Math.random() * str.length());
				sb.append(str.charAt(random));
			}
		}
		return sb.toString();
	}

//	获取n个随机中文字符串
	public static String getChinese(int n) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			sb.append(getChinese());
		}
		return sb.toString();
	}

//	获取1个随机中文字符串
	public static String getChinese() {
//		int min = Integer.valueOf("4e00",16);
//		int max = Integer.valueOf("9fa5",16);
//		StringBuffer sb = new StringBuffer();
//		for (int i = 0; i < n; i++) {
//			sb.append((char)(Math.random()*(max-min+1)+min));
//		}
		String str = "";
		Random r = new Random();
		int hightPos = (176 + Math.abs(r.nextInt(39)));
		int lowPos = (161 + Math.abs(r.nextInt(93)));
		byte[] b = new byte[2];
		b[0] = (Integer.valueOf(hightPos)).byteValue();
		b[1] = (Integer.valueOf(lowPos)).byteValue();

		try {
			str = new String(b, "GBK");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
//	根据正则获取匹配的字符串
	public static String getPlaceholderValue(String src, String regex) {
		String group = null;
		if (hasLength(src) && hasLength(regex)) {

			Pattern p = Pattern.compile(regex);
			Matcher matcher = p.matcher(src);
			matcher.find();
			group = matcher.group();
		}
		return group;

	}
	//判读是否是数值
	public static boolean isNumber(String src) {
		if (src == null || "".equals(src)) {
			return false;
		}

		String reg_src = "[0-9]+";
		boolean matches = src.matches(reg_src);
		return matches;
	}
}
