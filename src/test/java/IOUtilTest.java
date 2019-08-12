import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.junit.Test;

import com.sming.commons.utils.IOUtil;

/**
 * @作者: 时明明
 * @日期: 2019年8月10日
 * @时间: 下午12:44:40
 * IO工具测试类
 */
public class IOUtilTest {
//	关闭流
//	@Test
//	public void closeStreamTest() {
//		try {
//			FileInputStream fileInputStream1 = new FileInputStream("d:\\桌面\\test.txt");
//			FileInputStream fileInputStream2 = new FileInputStream("d:\\桌面\\test.txt");
//			IOUtil.closeStream(fileInputStream1,fileInputStream2);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
////	复制流
//	@Test
//	public void copyToTest() {
//		try {
//			FileInputStream fis = new FileInputStream("d:\\桌面\\test.txt");
//			FileOutputStream fos = new FileOutputStream("d:\\桌面\\test1.txt");
//			IOUtil.copyTo(fis, fos, true, true);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
////	读取文本文件
//	@Test
//	public void getTextFromFileTest() {
//		File file = new File("d:\\桌面\\text.txt");
//		String textFromFile = IOUtil.getTextFromFile(file);
//		System.out.println(textFromFile);
//	}
////	按行读取文本文件
//	@Test
//	public void readTextByLineTest() {
//		File file = new File("d:\\桌面\\text.txt");
//		List<String> readTextByLine = IOUtil.readTextByLine(file);
//		readTextByLine.forEach(s -> System.out.println(s));
//	}
////	写入文本文件
//	@Test
//	public void writeIntoTextTest() {
//		File file = new File("d:\\桌面\\text1.txt");
//		IOUtil.writeIntoText("我是时明明", file);
//	}
////	网络文件下载
	
}
