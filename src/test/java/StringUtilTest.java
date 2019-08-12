import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sming.commons.utils.StringUtil;

/**
 * @作者: 时明明
 * @日期: 2019年8月10日
 * @时间: 上午12:23:45 字符串工具测试类
 */
public class StringUtilTest {
//	// 测试不为null和"";
//	@Test
//	public void isEmptyTest() {
//		assertFalse(StringUtil.isEmpty(null));
//		assertFalse(StringUtil.isEmpty(""));
//	}
//
//	// 测试不为空值;
//	@Test
//	public void hasLengthTest() {
//		assertFalse(StringUtil.hasLength(null));
//		assertFalse(StringUtil.hasLength(""));
//		assertFalse(StringUtil.hasLength("   "));
//		assertTrue(StringUtil.hasLength("   1"));
//	}
//
//	// 测试是否是电话号码格式
//	@Test
//	public void isPhoneTest() {
//		assertTrue(StringUtil.isPhone("13838823321"));
//		assertFalse(StringUtil.isPhone("19238823321"));
//		assertFalse(StringUtil.isPhone("1393882332"));
//		assertFalse(StringUtil.isPhone("139388233211"));
//
//	}
//
//	// 测试是否是邮箱
//	@Test
//	public void isEmailTest() {
//		assertTrue(StringUtil.isEmail("13838823321@qq.com"));
//		assertFalse(StringUtil.isEmail("19238823321@"));
//		assertFalse(StringUtil.isEmail("13938@82332"));
//		assertFalse(StringUtil.isEmail("139388233211"));
//
//	}
//
//	// 测试是否全是字母
//	@Test
//	public void isLetterTest() {
//		assertTrue(StringUtil.isLetter("qweqert"));
//		assertFalse(StringUtil.isLetter("wqe3rewtr"));
//		assertFalse(StringUtil.isLetter("gfds/fdsa"));
//		assertFalse(StringUtil.isLetter(""));
//		assertFalse(StringUtil.isLetter(null));
//
//	}
//
//	// 测试生成n个字母字符串
//	@Test
//	public void getStringAllLetterTest() {
//		System.out.println(StringUtil.getStringAllLetter(15));
//	}
//	//	测试生成你个字母和数字组合的字符串
//	@Test
//	public void getStringOfLetterWithNumberTest() {
//		System.out.println(StringUtil.getStringOfLetterWithNumber(30));
//	}
//	// 测试生成随机n个汉字
//	@Test
//	public void getChinese() {
//		System.out.println(StringUtil.getChinese(50));
//	}
	@Test
	public void getPlaceholderValueTest() {
		String src = "http://news.cnstock.com/news,yw-201908-4413224.htm";
		String reg_src="\\d{7}";
		String placeholderValue = StringUtil.getPlaceholderValue(src, reg_src);
		System.out.println(placeholderValue);
	}
}
