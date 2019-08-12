import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import com.sming.commons.utils.DateUtil;

/**
 * @作者: 时明明
 * @日期: 2019年8月10日
 * @时间: 上午12:23:45
 * 日期工具测试类
 */
public class DateUtilTest {
//	根据生日算年龄测试
//	@Test
//	public void getAgeTest() {
//		Calendar birthday = new GregorianCalendar(1990,1,27);
//		int age = DateUtil.getAge(birthday);
//		assertEquals(29, age);
//		assertNotEquals(30, age);
//	}
////	求未来日期离今天还剩的天数测试
////	提示：归一为毫秒计算
//	@Test
//	public void getDayTest() {
//		Calendar cal = new GregorianCalendar(2019,7,20);
//		int day = DateUtil.getDay(cal);
//		assertEquals(10, day);
//	}
////	求过去日期离今天还剩的天数测试
//	@Test
//	public void getPostDayTest() {
//		Calendar cal = new GregorianCalendar(2019,7,1);
//		int day = DateUtil.getPostDay(cal);
//		assertEquals(10, day);
//	}
////	判断日期为今天
//	@Test
//	public void isTodayTest() {
//		Calendar cal = new GregorianCalendar(2019,7,10);
//		assertTrue(DateUtil.isToday(cal));
//		Date d = cal.getTime();
//		assertTrue(DateUtil.isToday(d));
//	}
////	判断给定的日期是否在本周之内
//	@Test
//	public void isInThisWeekTest() {
//		Calendar cal = new GregorianCalendar(2019,7,11);
//		assertTrue(DateUtil.isInThisWeek(cal));
//	}
////	判断给定的日期是否在本月之内
//	@Test
//	public void isInThisMonthTest() {
//		Calendar cal = new GregorianCalendar(2019,7,11);
//		assertTrue(DateUtil.isInThisMonth(cal));
//	}
////	给定时间对象，初始化到该月初的1日0时0分0秒0毫秒
//	@Test
//	public void initFirstDayOfMonthTest() {
//		Calendar cal = new GregorianCalendar(2019,7,11);
//		DateUtil.initFirstDayOfMonth(cal);
//		System.out.println(cal.getTime());
//	}
//	@Test
//	public void initLastDayOfMonthTest() {
//		Calendar cal = new GregorianCalendar(2019,1,10);
//		DateUtil.initLastDayOfMonth(cal);
//		System.out.println(cal.getTime());
//	}
////	时间比较
//	@Test
//	public void compateToDateTest() {
//		Calendar cal = new GregorianCalendar(2019,7,11);
//		Calendar cal1 = new GregorianCalendar(2019,7,11);
//		Date time = cal.getTime();
//		Date time2 = cal1.getTime();
//		int compareToDate = DateUtil.compareToDate(time, time2);
//		assertEquals(0, compareToDate);
//	}
}
