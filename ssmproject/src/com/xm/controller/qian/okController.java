package com.xm.controller.qian;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Orders;
import com.xm.service.OrdersService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/oks")
public class okController {
	/**
	 * 订单
	 */
	@Autowired
	OrdersService ordersService;
	/**
	 * 进入结算页面
	 * @return
	 */
	@RequestMapping("/ok")
	public String addusers(){
		return "ok";
		}
	/**
	 * 订单状态修改1已支付
	 * @param orders
	 * @return
	 */
	@RequestMapping("/updateOrders")
	@ResponseBody
	public Result updateOrders(Orders orders) {
		Result r;
		int i=ordersService.updateOrders(orders);
		if(i>=0) {
			r=new Result(0, "");
		}else {
			r=new Result(1, "");
		}
		return r;
	}
	/**
	 * 订单查询
	 * @param orders
	 * @return
	 */
	@RequestMapping("/getshoppord")
	@ResponseBody
	public Result getshoppord(Orders orders) {
		Result r;
			List<Orders> i=ordersService.getshoppords(orders);
			if(i.size()>=0) {
				r=new Result(0, "",i.size(),i);
			}else {
				r=new Result(1, "无数据");
			}
		return r;
	}
}
