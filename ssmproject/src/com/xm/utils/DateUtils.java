package com.xm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	* ��Dateת���ַ���
	* @param date Ҫת��������
	* @return ����ת����������ַ���
	* */
	public static String dateToString(Date date){
	return sdf.format(date);
	}
	/**
	* ���ַ���ת��Date
	* @param date Ҫת�������ڵ��ַ���
	* @return ����ת���������
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
