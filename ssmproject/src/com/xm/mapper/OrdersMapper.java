package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Orders;
import com.xm.entity.OrdersVo;
import com.xm.entity.OrderssVo;

public interface OrdersMapper {
	/**
	 * 多条件查
	 * @param orders
	 * @return
	 */
	List<Orders> findOrder(OrdersVo ordersVo);
	/**
	 * 全查
	 * @param orders
	 * @return
	 */
	List<Orders> getxiangqing(Orders orders);
	/**
	 * 根据订单id把状态修改为0
	 * @param orders
	 * @return
	 */
	int shanchu(Orders orders);
	/**
	 * 根据订单id把状态修改为1
	 * @param orders
	 * @return
	 */
	int waishanchu(Orders orders);
	/**
	 * 根据订单id修改
	 * @param orders
	 * @return
	 */
	int getwuliu(Orders orders );
	/**
	 * 根据订单id把状态修改为2
	 * @param orders
	 * @return
	 */
	int fahuo(Orders orders);
	/**
	 * 根据订单id修改
	 * @param orders
	 * @return
	 */
	int shengcheng(int orderid);
	/**
	 * 根据订单id把状态修改为1
	 * @param orders
	 * @return
	 */
	int updateOrders(Orders orders);
	/**
	 * 添加
	 * @param orders
	 * @return
	 */
	int insertOrders(Orders orders);
	/**
	 * 根据用户id查
	 * @param orders
	 * @return
	 */
	List<Orders> getshoppord(Orders orders);
	/**
	 * 根据用户id查
	 * @param orders
	 * @return
	 */
	List<Orders> getshoppord2(Orders orders);
	/**
	 * 前台查
	 * @param orders
	 * @return
	 */
	List<Orders> Qiantai(OrderssVo orderssvo);
	/**
	 * 单查订单
	 * @param orderid
	 * @return
	 */
	List<Orders> Dan(int orderid);
	/**
	 * 收货修改
	 * @param orders
	 * @return
	 */
	int Qianxiu(Orders orders);
	/**
	 * 根据订单id全查
	 * @param orderid
	 * @return
	 */
	List<Orders> Danbiao(int orderid);
	/**
	 * 根据订单id把状态修改为5
	 * @param orderid
	 * @return
	 */
	int updateOrderss(Orders orders);
	/**
	 * ok查询
	 * @param orders
	 * @return
	 */
	List<Orders> getshoppords(Orders orders);
	
	/**
	 * 前台查订单号
	 * @param orders
	 * @return
	 */
	List<Orders> getDingDan(@Param("uid")int uid,@Param("oroddnum")String oroddnum);
}

