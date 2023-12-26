package com.xm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Orders;
import com.xm.entity.OrdersVo;
import com.xm.service.OrdersService;
import com.xm.utils.OrderUtils;
import com.xm.utils.Result;

@Controller
@RequestMapping("/OrdersController")
public class OrdersController {
	
	@Autowired
	OrdersService ordersService;//���ö�����service
	/**
	 * ��������
	 * @param 
	 * @return
	 */
	@RequestMapping("/findOrder")
	@ResponseBody
	public Result findOrder(OrdersVo ordersVo) {
	List<Orders> uss=ordersService.findOrder(ordersVo);
	ordersVo.setPage(null);
	ordersVo.setLimit(null);
	List<Orders> all=ordersService.findOrder(ordersVo);
	Result r;
	if (uss!=null) {
		r=new Result(0,"",all.size(),uss);
	} else {
		r=new Result(1,"������");

	}
	return r;
	}
	/**
	 * ��idȫ��
	 * @param 
	 * @return
	 */
	@RequestMapping("/getxiangqing")
	@ResponseBody
	public Result getxiangqing(Orders orders) {
	List<Orders> uss=ordersService.getxiangqing(orders);
	Result r;
	if (uss!=null) {
		r=new Result(0,"",uss.size(),uss);
	} else {
		r=new Result(1,"������");

	}
	return r;
	}
	/**
	 *��idɾ��
	 * @param 
	 * @return
	 */
	@RequestMapping("/shanchu")
	@ResponseBody
	public Result shanchu(Orders orders) {
		Result r;
		int i=ordersService.shanchu(orders);
		if(i>=0) {
			r=new Result(0, "ɾ���ɹ�");
		}else {
			r=new Result(1, "ɾ��ʧ��");
		}
		return r;
	}
	/**
	 *��idδɾ��
	 * @param 
	 * @return
	 */
	@RequestMapping("/waishanchu")
	@ResponseBody
	public Result waishanchu(Orders orders) {
		Result r;
		int i=ordersService.waishanchu(orders);
		if(i>=0) {
			r=new Result(0, "δɾ���ɹ�");
		}else {
			r=new Result(1, "δɾ��ʧ��");
		}
		return r;
	}
	/**
	 *��id����
	 * @param 
	 * @return
	 */
	@RequestMapping("/fahuo")
	@ResponseBody
	public Result fahuo(Orders orders) {
		String od=OrderUtils.getOrderCode(orders.getOrderid());
		orders.setOroddnum(od);
		Result r;
		int i=ordersService.fahuo(orders);
		if(i>=0) {
			r=new Result(0, "�������ɹ�");
		}else {
			r=new Result(1, "������ʧ��");
		}
		return r;
	}
	
	/**
	 *��ѯ���ɵ���������
	 * @param 
	 * @return
	 */
	@RequestMapping("/shengcheng")
	@ResponseBody
	public Result shengcheng(int orderid,HttpSession session) {
		//����һ���������������
		String od=OrderUtils.getOrderCode(orderid);
		session.setAttribute("od", od);
		System.out.println(od);
		Result r;
		int i=ordersService.shengcheng(orderid);
		if(i>=0) {
			r=new Result(0, od);
		}else {
			r=new Result(1, "����ʧ��");
		}
		return r;
	}
	/**
	 *�����Ƿ����������������
	 * @param 
	 * @return
	 */
	@RequestMapping("/getwuliu")
	@ResponseBody
	public Result getwuliu(Orders orders ,HttpSession session) {
		String od=OrderUtils.getOrderCode(orders.getOrderid());
		orders.setOroddnum(od);
		session.setAttribute("od", od);
		Result r;
		int i=ordersService.getwuliu(orders);
		if(i>=0) {
			r=new Result(0, od);
			orders.setOroddnum(od);
		}else {
			r=new Result(1, "����ʧ��");
		}
		return r;
	}	
}
