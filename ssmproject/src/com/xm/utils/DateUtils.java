package com.xm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	* 把Date转成字符串
	* @param date 要转换的日期
	* @return 返回转换后的日期字符串
	* */
	public static String dateToString(Date date){
	return sdf.format(date);
	}
	/**
	* 把字符串转成Date
	* @param date 要转换成日期的字符串
	* @return 返回转换后的日期
	* */
	public static Date stringToDate(String date){
	try {
	return sdf.parse(date);
	} catch (ParseException e) {
	e.printStackTrace();
	}
	return null;
	}
}
