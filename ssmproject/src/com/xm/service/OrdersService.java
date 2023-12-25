package com.xm.service;

import java.util.List;

import com.xm.entity.Orders;
import com.xm.entity.OrdersVo;
import com.xm.entity.OrderssVo;

public interface OrdersService {
	List<Orders> findOrder(OrdersVo ordersVo);
	List<Orders> getxiangqing(Orders orders);
	int shanchu(Orders orders);
	int waishanchu(Orders orders);
	int getwuliu(Orders orders );
	int fahuo(Orders orders);
	
	int shengcheng(int orderid);
	int insertOrders(Orders orders);
	int updateOrders(Orders orders);
	List<Orders> getshoppord(Orders orders);
	List<Orders> getshoppord2(Orders orders);
	List<Orders> Qiantai(OrderssVo orderssvo);
	List<Orders> Dan(int orderid);
	int Qianxiu(Orders orders);
	List<Orders> Danbiao(int orderid);
	int updateOrderss(Orders orders);
}

