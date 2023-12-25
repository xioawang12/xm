package com.xm.controller.qian;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Address;
import com.xm.entity.Category;
import com.xm.entity.Orders;
import com.xm.entity.OrdersDetail;
import com.xm.entity.OrderssVo;
import com.xm.entity.User;
import com.xm.service.AddressService;
import com.xm.service.CategoryService;
import com.xm.service.OrdersDetailService;
import com.xm.service.OrdersService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/MyorderqController")
public class MyorderqController {
	@Autowired
	CategoryService CategoryService;//类别service
	@Autowired
	AddressService AddressService;
	@Autowired
	OrdersService OrdersService;
	@Autowired
	OrdersDetailService OrdersDetailService;
	@RequestMapping("/Myorderq")
	public String Myorderq(Model model,int uid,String orderstate,HttpSession session) {
		List<Address> ad=AddressService.getuserid(uid);
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		List<Orders> ors=OrdersService.Qiantai(new OrderssVo(uid,orderstate));
		List<OrdersDetail> osers=OrdersDetailService.QianSan();
		session.setAttribute("list", list);
		session.setAttribute("list2", list2);
		model.addAttribute("ad", ad);
		model.addAttribute("ors", ors);
		model.addAttribute("osers", osers);
		return "myorderq";
	}
	
	@RequestMapping("/QianxiuMy")
	@ResponseBody
	public Result Qianxiu(Orders orders) {
		Result r;
		int i=OrdersService.Qianxiu(orders);
		if(i>=0) {
			r=new Result(0, "修改成功");
		}else {
			r=new Result(1, "修改失败");
		}
		return r;
	}
	@RequestMapping("/Danbiao")
	@ResponseBody
	public Result Danbiao(int orderid) {
		Result r;
			List<Orders> i=OrdersService.Danbiao(orderid);
			if(i!=null) {
				r=new Result(0, "", i.size(), i);
			}else {
				r=new Result(1, "无数据");
			}
		return r;
	}
}
