package com.xm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.Orders;
import com.xm.entity.OrdersVo;
import com.xm.entity.OrderssVo;
import com.xm.mapper.OrdersMapper;
import com.xm.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	OrdersMapper ordersMapper;
	@Override
	public List<Orders> findOrder(OrdersVo ordersVo) {
		// TODO Auto-generated method stub
		return ordersMapper.findOrder(ordersVo);
	}
	@Override
	public int shanchu(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.shanchu(orders);
	}
	@Override
	public int waishanchu(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.waishanchu(orders);
	}
	@Override
	public int fahuo(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.fahuo(orders);
	}
	@Override
	public List<Orders> getxiangqing(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.getxiangqing(orders);
	}
	@Override
	public int getwuliu(Orders orders ) {
		// TODO Auto-generated method stub
		return ordersMapper.getwuliu(orders);
	}
	@Override
	public int shengcheng(int orderid) {
		// TODO Auto-generated method stub
		return ordersMapper.shengcheng(orderid);
	}
	@Override
	public int insertOrders(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.insertOrders(orders);
	}
	@Override
	public List<Orders> getshoppord(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.getshoppord(orders);
	}
	@Override
	public List<Orders> getshoppord2(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.getshoppord2(orders);
	}
	@Override
	public int updateOrders(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.updateOrders(orders);
	}
	@Override
	public List<Orders> Qiantai(OrderssVo orderssvo) {
		// TODO Auto-generated method stub
		return ordersMapper.Qiantai(orderssvo);
	}
	@Override
	public List<Orders> Dan(int orderid) {
		// TODO Auto-generated method stub
		return ordersMapper.Dan(orderid);
	}
	@Override
	public int Qianxiu(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.Qianxiu(orders);
	}
	@Override
	public List<Orders> Danbiao(int orderid) {
		// TODO Auto-generated method stub
		return ordersMapper.Danbiao(orderid);
	}
	@Override
	public int updateOrderss(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.updateOrderss(orders);
	}
	@Override
	public List<Orders> getshoppords(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.getshoppords(orders);
	}
	@Override
	public List<Orders> getDingDan(int uid, String oroddnum) {
		// TODO Auto-generated method stub
		return ordersMapper.getDingDan(uid, oroddnum);
	}
	
	

}

