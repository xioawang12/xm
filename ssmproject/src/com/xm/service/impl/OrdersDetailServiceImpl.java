package com.xm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.OrdersDetail;
import com.xm.mapper.OrdersDetailMapper;
import com.xm.service.OrdersDetailService;
@Service
public class OrdersDetailServiceImpl implements OrdersDetailService {
	@Autowired
	OrdersDetailMapper ordersDetailMapper;
	@Override
	public List<OrdersDetail> findOrdersDetail(OrdersDetail ordersDetail){
		// TODO Auto-generated method stub
		return ordersDetailMapper.findOrdersDetail(ordersDetail);
	}
	@Override
	public List<OrdersDetail> danchaOrdersDetail(int id) {
		// TODO Auto-generated method stub
		return ordersDetailMapper.danchaOrdersDetail(id);
	}
	@Override
	public List<OrdersDetail> getxiangqing(OrdersDetail ordersDetail) {
		// TODO Auto-generated method stub
		return ordersDetailMapper.getxiangqing(ordersDetail);
	}
	@Override
	public int insertOrdersDetail(OrdersDetail ordersDetail) {
		// TODO Auto-generated method stub
		return ordersDetailMapper.insertOrdersDetail(ordersDetail);
	}
	@Override
	public List<OrdersDetail> QianSan() {
		// TODO Auto-generated method stub
		return ordersDetailMapper.QianSan();
	}
	@Override
	public List<OrdersDetail> QianXiang(Integer orderid) {
		// TODO Auto-generated method stub
		return ordersDetailMapper.QianXiang(orderid);
	}
	@Override
	public List<OrdersDetail> quanchaOrdersDetail(int id) {
		// TODO Auto-generated method stub
		return ordersDetailMapper.quanchaOrdersDetail(id);
	}



}

