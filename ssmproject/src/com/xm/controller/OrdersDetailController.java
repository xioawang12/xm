package com.xm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.OrdersDetail;
import com.xm.service.OrdersDetailService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/OrdersDetailController")
public class OrdersDetailController {
	@Autowired
	OrdersDetailService ordersDetailService;//���ö��������service
	/**
	 * ��������
	 * @param 
	 * @return
	 */
	@RequestMapping("/findOrdersDetail")
	@ResponseBody
	public Result findOrdersDetail(OrdersDetail ordersDetail) {
	Result r;
	List<OrdersDetail> od=ordersDetailService.findOrdersDetail(ordersDetail);
	ordersDetail.setPage(null);
	ordersDetail.setLimit(null);
	List<OrdersDetail> all=ordersDetailService.findOrdersDetail(ordersDetail);
	
	if (od!=null) {
		r=new Result(0,"",all.size(),od);
	} else {
		r=new Result(1,"������");

	}
	return r;
	}
	/**
	 * ��������
	 * @param 
	 * @return
	 */
	@RequestMapping("/getxiangqing")
	@ResponseBody
	public Result getxiangqing(OrdersDetail ordersDetail) {
		Result r;
	List<OrdersDetail> od=ordersDetailService.getxiangqing(ordersDetail);
	ordersDetail.setPage(null);
	ordersDetail.setLimit(null);
	List<OrdersDetail> all=ordersDetailService.getxiangqing(ordersDetail);
	
	if (od!=null) {
		r=new Result(0,"",all.size(),od);
	} else {
		r=new Result(1,"������");

	}
	return r;
	}
	/**
	 * ����orderid����
	 * @param 
	 * @return
	 */
	@RequestMapping("/danchaOrdersDetail")
	@ResponseBody
	public Result danchaOrdersDetail(int id) {
	List<OrdersDetail> od=ordersDetailService.danchaOrdersDetail(id);
	Result r;
	if (od!=null) {
		r=new Result(0,"",od.size(),od);
	} else {
		r=new Result(1,"������");

	}
	return r;
	}
}
