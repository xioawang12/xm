package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.OrdersDetail;

public interface OrdersDetailMapper {
	/**
	 * 多条件查
	 * @param 
	 * @return
	 */
	List<OrdersDetail> findOrdersDetail(OrdersDetail ordersDetail);
	/**
	 * 订单详情全查
	 * @param 
	 * @return
	 */
	List<OrdersDetail> getxiangqing(OrdersDetail ordersDetail);
	/**
	 * 根据订单id全查
	 * @param 
	 * @return
	 */
	List<OrdersDetail> danchaOrdersDetail(int id);
	/**
	 * 添加
	 * @param 
	 * @return
	 */
	int insertOrdersDetail (OrdersDetail ordersDetail);
	/**
	 * 全查
	 * @param 
	 * @return
	 */
	List<OrdersDetail> QianSan();
	/**
	 * 根据订单id全查
	 * @param 
	 * @return
	 */
	List<OrdersDetail> QianXiang(Integer orderid);
	/**
	 * 根据用户id和订单id全查
	 * @param 
	 * @return
	 */
	List<OrdersDetail> quanchaOrdersDetail(@Param("uid")int uid,@Param("orderid")int orderid);
	/**
	 * 根据用户id全查
	 * @param 
	 * @return
	 */
	List<OrdersDetail> quanchaOrdersDetails(@Param("uid")int uid);
}

