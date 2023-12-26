package com.xm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.OrdersDetail;

public interface OrdersDetailService {
	List<OrdersDetail> findOrdersDetail(OrdersDetail ordersDetail);
	List<OrdersDetail> getxiangqing(OrdersDetail ordersDetail);
	List<OrdersDetail> danchaOrdersDetail(int id);
	int insertOrdersDetail (OrdersDetail ordersDetail);
	List<OrdersDetail> QianSan();
	List<OrdersDetail> QianXiang(Integer orderid);
	List<OrdersDetail> quanchaOrdersDetail(int uid,int orderid);
	List<OrdersDetail> quanchaOrdersDetails(int uid);
}

