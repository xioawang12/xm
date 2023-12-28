package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Orders;
import com.xm.entity.OrdersVo;
import com.xm.entity.OrderssVo;

public interface OrdersMapper {
	/**
	 * ��������
	 * @param orders
	 * @return
	 */
	List<Orders> findOrder(OrdersVo ordersVo);
	/**
	 * ȫ��
	 * @param orders
	 * @return
	 */
	List<Orders> getxiangqing(Orders orders);
	/**
	 * ���ݶ���id��״̬�޸�Ϊ0
	 * @param orders
	 * @return
	 */
	int shanchu(Orders orders);
	/**
	 * ���ݶ���id��״̬�޸�Ϊ1
	 * @param orders
	 * @return
	 */
	int waishanchu(Orders orders);
	/**
	 * ���ݶ���id�޸�
	 * @param orders
	 * @return
	 */
	int getwuliu(Orders orders );
	/**
	 * ���ݶ���id��״̬�޸�Ϊ2
	 * @param orders
	 * @return
	 */
	int fahuo(Orders orders);
	/**
	 * ���ݶ���id�޸�
	 * @param orders
	 * @return
	 */
	int shengcheng(int orderid);
	/**
	 * ���ݶ���id��״̬�޸�Ϊ1
	 * @param orders
	 * @return
	 */
	int updateOrders(Orders orders);
	/**
	 * ���
	 * @param orders
	 * @return
	 */
	int insertOrders(Orders orders);
	/**
	 * �����û�id��
	 * @param orders
	 * @return
	 */
	List<Orders> getshoppord(Orders orders);
	/**
	 * �����û�id��
	 * @param orders
	 * @return
	 */
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
	/**
	 * ���ݶ���idȫ��
	 * @param orderid
	 * @return
	 */
	List<Orders> Danbiao(int orderid);
	/**
	 * ���ݶ���id��״̬�޸�Ϊ5
	 * @param orderid
	 * @return
	 */
	int updateOrderss(Orders orders);
	/**
	 * ok��ѯ
	 * @param orders
	 * @return
	 */
	List<Orders> getshoppords(Orders orders);
	
	/**
	 * ǰ̨�鶩����
	 * @param orders
	 * @return
	 */
	List<Orders> getDingDan(@Param("uid")int uid,@Param("oroddnum")String oroddnum);
}

