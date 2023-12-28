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
import com.xm.service.UserService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/MyorderqController")
public class MyorderqController {
	/**
	 * 商品类型
	 */
	@Autowired
	CategoryService CategoryService;//类别service
	/**
	 * 地址
	 */
	@Autowired
	AddressService AddressService;
	/**
	 * 订单
	 */
	@Autowired
	OrdersService OrdersService;
	/**
	 * 订单详细
	 */
	@Autowired
	OrdersDetailService OrdersDetailService;
	/**
	 * 用户
	 */
	@Autowired
	UserService userService;
	/**
	 * 存地址/商品类型/订单/订单详细数据进入订单页面
	 * @param model
	 * @param uid
	 * @param orderstate
	 * @param session
	 * @return
	 */
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
	/**
	 * 存地址/商品类型/订单/订单详细数据进入订单页面
	 * @param model
	 * @param uid
	 * @param orderstate
	 * @param session
	 * @return
	 */
	@RequestMapping("/Myorderqs")
	public String Myorderqs(Model model,int uid,String oroddnum,HttpSession session) {
		List<Address> ad=AddressService.getuserid(uid);
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		List<OrdersDetail> osers=OrdersDetailService.QianSan();
		List<Orders> ors=OrdersService.getDingDan(uid,oroddnum);
		session.setAttribute("list", list);
		session.setAttribute("list2", list2);
		model.addAttribute("ad", ad);
		model.addAttribute("osers", osers);
		model.addAttribute("ors", ors);
		return "myorderq";
	}
	/**
	 * 修改订单状态变为4待收货
	 * @param orders
	 * @return
	 */
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
	/**
	 * 订单单表查询
	 * @param orderid
	 * @return
	 */
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
