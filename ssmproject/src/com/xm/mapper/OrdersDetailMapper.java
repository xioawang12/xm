package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.OrdersDetail;

public interface OrdersDetailMapper {
	/**
	 * ��������
	 * @param 
	 * @return
	 */
	List<OrdersDetail> findOrdersDetail(OrdersDetail ordersDetail);
	/**
	 * ��������ȫ��
	 * @param 
	 * @return
	 */
	List<OrdersDetail> getxiangqing(OrdersDetail ordersDetail);
	/**
	 * ���ݶ���idȫ��
	 * @param 
	 * @return
	 */
	List<OrdersDetail> danchaOrdersDetail(int id);
	/**
	 * ���
	 * @param 
	 * @return
	 */
	int insertOrdersDetail (OrdersDetail ordersDetail);
	/**
	 * ȫ��
	 * @param 
	 * @return
	 */
	List<OrdersDetail> QianSan();
	/**
	 * ���ݶ���idȫ��
	 * @param 
	 * @return
	 */
	List<OrdersDetail> QianXiang(Integer orderid);
	/**
	 * �����û�id�Ͷ���idȫ��
	 * @param 
	 * @return
	 */
	List<OrdersDetail> quanchaOrdersDetail(@Param("uid")int uid,@Param("orderid")int orderid);
	/**
	 * �����û�idȫ��
	 * @param 
	 * @return
	 */
	List<OrdersDetail> quanchaOrdersDetails(@Param("uid")int uid);
}

