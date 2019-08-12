package com.sming.commons.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @作者: 时明明
 * @日期: 2019年8月10日
 * @时间: 下午12:44:13 IO工具类
 */
public class IOUtil {
	private IOUtil() {

	}

//	关闭流
	public static void closeStream(Closeable... closeables) {

		try {
			for (Closeable closeable : closeables) {
				if (closeable != null) {

					closeable.close();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	复制流
	public static void copyTo(InputStream is, OutputStream os, boolean isIsClosed, boolean isOsClosed) {
		if (is == null || os == null) {
			return;
		}
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		byte[] b = new byte[1024];
		try {
			while (bis.read(b) != -1) {

				bos.write(b);
			}
			bos.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (!isOsClosed) {
				closeStream(bos);
			}
			if (!isIsClosed) {
				closeStream(bis);
			}
		}
	}

//	读取文本文件
	public static String getTextFromFile(File file) {
		if (!file.exists() || file == null) {
			return null;
		}
		StringBuffer sb = new StringBuffer();

		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, "GBK");
			BufferedReader br = new BufferedReader(isr);
			String str = "";
			while ((str = br.readLine()) != null) {
				sb.append(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();

	}

//	按行读取文本文件
	public static List<String> readTextByLine(File file) {
		if (file == null || !file.exists()) {
			return null;
		}
		List<String> list = new ArrayList<String>();
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis, "GBK");
			br = new BufferedReader(isr);
			String str = "";
			while ((str = br.readLine()) != null) {
				list.add(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeStream(br, isr, fis);
		}
		return list;

	}

//	写入文本文件
	public static void writeIntoText(String text, File file) {
		if (file == null) {
			return;
		}
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			fos = new FileOutputStream(file);
			osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
			bw.write(text);
			bw.newLine();
			bw.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeStream(bw,osw,fos);
		}

	}
//	网络文件下载
	
}
