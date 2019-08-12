package com.sming.commons.utils;

import java.io.File;

/**
 * @作者: 时明明
 * @日期: 2019年8月10日
 * @时间: 上午11:27:16 文件工具类
 */
public class FileUtil {
	private FileUtil() {
	}

//	获取文件扩展名
	public static String getSuffix(File file) {
		if (!file.exists()) {
			return "文件不存在";
		}
		String name = file.getName();
		String suffix = name.substring(name.lastIndexOf(".") + 1);
		return suffix;
	}

//	删除文件，如果是目录，则下面的文件和所有子目录中的文件都要删除
	public static void removeFile(File file) {
		if (!file.exists()) {
			return;
		}
		if (file.isFile()) {
			 file.delete();
		} else if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				removeFile(file2);
			}
			file.delete();
		}
	}
//	获取操作系统用户目录
//	提示：全局属性user.dir和user.home

	public static File getSystemFile() {
		String property = System.getProperties().getProperty("user.home");
		File file = new File(property);
		return file;
	}
//	返回文件以指定单位大小表示
	public static String getSize(File file,String unit) {
		long length = file.length();
		String result="File "+file.getName()+"=";
		switch (unit) {
		case "T":
			result+=(length/1024/1024/1024/1024.0)+unit;
			break;
		case "G":
			result+=(length/1024/1024/1024.0)+unit;
			break;
		case "M":
			result+=(length/1024/1024.0)+unit;
			break;
		case "K":
			result+=(length/1024.0)+unit;
			break;
		case "B":
			result+=(length)+unit;
			break;

		default:
			break;
		}
	
		return result;
	}
}
