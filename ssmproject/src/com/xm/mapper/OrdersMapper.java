package com.xm.mapper;

import java.util.List;

import com.xm.entity.Orders;
import com.xm.entity.OrdersVo;
import com.xm.entity.OrderssVo;

public interface OrdersMapper {
	List<Orders> findOrder(OrdersVo ordersVo);
	List<Orders> getxiangqing(Orders orders);
	int shanchu(Orders orders);
	int waishanchu(Orders orders);
	int getwuliu(Orders orders );
	int fahuo(Orders orders);
	
	int shengcheng(int orderid);
	int updateOrders(Orders orders);
	int insertOrders(Orders orders);
	List<Orders> getshoppord(Orders orders);
	List<Orders> getshoppord2(Orders orders);
	/**
	 * ǰ̨��
	 * @param orders
	 * @return
	 */
	List<Orders> Qiantai(OrderssVo orderssvo);
	/**
	 * ���鶩��
	 * @param orderid
	 * @return
	 */
	List<Orders> Dan(int orderid);
	/**
	 * �ջ��޸�
	 * @param orders
	 * @return
	 */
	int Qianxiu(Orders orders);
	List<Orders> Danbiao(int orderid);
	int updateOrderss(Orders orders);
}

