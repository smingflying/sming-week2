package com.sming.commons.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @作者: 时明明
 * @日期: 2019年8月10日
 * @时间: 上午12:21:31 日期工具类
 */
public class DateUtil {
	private DateUtil() {
	}

//	根据生日算年龄
//	提示：年龄为年份相减，还要考虑对周岁情况的处理
	public static int getAge(Calendar cal) {
		if (cal == null) {
			return 0;
		}
		int age = 0;
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		Calendar today = new GregorianCalendar();
		age = today.get(Calendar.YEAR) - year;
		if (month > today.get(Calendar.MONTH)) {
			age--;
		} else if (month == today.get(Calendar.MONTH)) {
			if (date > today.get(Calendar.DATE)) {
				age--;
			}
		}
		return age;

	}

	public static int getAge(Date date) {

		Calendar instance = Calendar.getInstance();
		instance.setTime(date);
		return getAge(instance);
	}

//	求未来日期离今天还剩的天数
//	提示：归一为毫秒计算
	public static int getDay(Date date) {
		int day = 0;
		long time = date.getTime();
		long time2 = new Date().getTime();
		if (time - time2 <= 0) {
			return 0;
		}
		day = (int) ((time - time2) / 1000 / 60 / 60 / 24);
		return day + 1;
	}

	public static int getDay(Calendar cal) {
		return getDay(cal.getTime());
	}

//	求过去日期离今天还剩的天数
	public static int getPostDay(Date date) {
		int day = 0;
		long time = date.getTime();
		long time2 = new Date().getTime();
		if (time2 - time <= 0) {
			return 0;
		}
		day = (int) ((time2 - time) / 1000 / 60 / 60 / 24);

		return day + 1;
	}

	public static int getPostDay(Calendar cal) {
		return getPostDay(cal.getTime());
	}

//	判断给定的日期是否为今天
	public static boolean isToday(Calendar cal) {
		Calendar c = new GregorianCalendar();
		return c.get(Calendar.YEAR) == cal.get(Calendar.YEAR) && c.get(Calendar.MONTH) == cal.get(Calendar.MONTH)
				&& c.get(Calendar.DATE) == cal.get(Calendar.DATE);

	}

	public static boolean isToday(Date date) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String format = sdf.format(today);
		String format1 = sdf.format(date);
		return format.equals(format1);

	}

//	判断给定的日期是否在本周之内
//	提示：判定当前日期为周几，注意周日为1，周六为7。然后计算出本周日期范围
	public static boolean isInThisWeek(Calendar cal) {
		Calendar c = new GregorianCalendar();
		if (c.get(Calendar.YEAR) == cal.get(Calendar.YEAR)) {
			if (c.get(Calendar.MONTH) == cal.get(Calendar.MONTH)) {
				if (c.get(Calendar.WEEK_OF_MONTH) == cal.get(Calendar.WEEK_OF_MONTH)) {
					return true;
				}
			}
		}
		return false;
	}

//	判断给定的日期是否在本月之内
	public static boolean isInThisMonth(Calendar cal) {
		Calendar c = new GregorianCalendar();
		if (c.get(Calendar.YEAR) == cal.get(Calendar.YEAR)) {
			if (c.get(Calendar.MONTH) == cal.get(Calendar.MONTH)) {
				return true;
			}
		}
		return false;
	}

//	给定时间对象，初始化到该月初的1日0时0分0秒0毫秒
	public static void initFirstDayOfMonth(Calendar cal) {
		cal.set(Calendar.DATE, 1);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
	}

//	给定时间对象，设定到该月最一天的23时59分59秒999毫秒
	public static void initLastDayOfMonth(Calendar cal) {
		int month = cal.get(Calendar.MONTH);
		switch (month+1) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			cal.set(Calendar.DATE, 31);
			break;
		case 2:
			if (cal.get(Calendar.YEAR)%4==0&&cal.get(Calendar.YEAR)%100!=0 || cal.get(Calendar.YEAR)%400==0) {
				cal.set(Calendar.DATE, 29);
			}else {
				cal.set(Calendar.DATE, 28);
			}
			break;
		default:
			cal.set(Calendar.DATE, 30);
			break;

		}
		cal.set(Calendar.HOUR, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
	}
//	时间比较
	public static int compareToDate(Date date1,Date date2) {
		
		return date1.compareTo(date2);
		
	}
}
