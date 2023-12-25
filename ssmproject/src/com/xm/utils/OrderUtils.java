package com.xm.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * * ����������������������32λ���ֱ��룬
 * * @���ɹ��� 1λ��������+17λʱ���+14λ(�û�id����&�����)
 */
public class OrderUtils {
	 /**
     * �������ͷ
     */

    private static final String ORDER_CODE = "";
    /**
     * �˻����ͷ
     */

    private static final String RETURN_ORDER = "";
    /**
     * �˿����ͷ
     */

    private static final String REFUND_ORDER = "";


    /**
     * �漴����
     */

    private static final int[] r = new int[]{7, 9, 6, 2, 8, 1, 3, 0, 5, 4};
    /**
     * �û�id��������ܳ���
     */

    private static final int maxLength = 14;

    /**
     * ����id���м���+���������ɹ̶����ȱ���
     */
    private static String toCode(Integer userId) {
        String idStr = userId.toString();
        StringBuilder idsbs = new StringBuilder();
        for (int i = idStr.length() - 1; i >= 0; i--) {
            idsbs.append(r[idStr.charAt(i) - '0']);
        }
        return idsbs.append(getRandom(maxLength - idStr.length())).toString();
    }

    /**
     * ����ʱ���
     */
    private static String getDateTime() {
        DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return sdf.format(new Date());
    }

    /**
     * ���ɹ̶����������
     *
     * @param n ����
     */

    private static long getRandom(long n) {
        long min = 1, max = 9;
        for (int i = 1; i < n; i++) {
            min *= 10;
            max *= 10;
        }
        long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min;
        return rangeLong;
    }


    /**
     * ���ɲ�������ͷ�ı���
     *
     * @param userId
     */
    private static synchronized String getCode(Integer userId) {
        userId = userId == null ? 10000 : userId;
        return getDateTime() + toCode(userId);
    }


    /**
     * ���ɶ������ű���(���÷���)
     * @param userId  ��վ�и��û�ΨһID ��ֹ�ظ�
     */

    public static String getOrderCode(Integer userId) {
        return ORDER_CODE + getCode(userId);
    }


    /**
     * �����˻����ű��루���÷�����
     * @param userId ��վ�и��û�ΨһID ��ֹ�ظ�
     */
    public static String getReturnCode(Integer userId) {
        return RETURN_ORDER + getCode(userId);
    }


    /**
     * �����˿�ű���(���÷���)
     * @param userId  ��վ�и��û�ΨһID ��ֹ�ظ�
     */
    public static String getRefundCode(Integer userId) {
        return REFUND_ORDER + getCode(userId);
    }
}
