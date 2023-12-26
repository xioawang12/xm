package com.xm.controller.qian;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xm.entity.Address;
import com.xm.entity.Category;
import com.xm.entity.Orders;
import com.xm.entity.OrdersDetail;
import com.xm.entity.OrderssVo;
import com.xm.service.AddressService;
import com.xm.service.CategoryService;
import com.xm.service.OrdersDetailService;
import com.xm.service.OrdersService;
@Controller
@RequestMapping("/OrderXqController")
public class OrderXqController {
	@Autowired
	CategoryService CategoryService;//���service
	@Autowired
	AddressService AddressService;//��ַservice
	@Autowired
	OrdersService OrdersService;//����service
	@Autowired
	OrdersDetailService OrdersDetailService;//������ϸservice
	/**
	 *  ���ַ/����/��Ʒ����/������ϸ���ݽ��붩����ϸҳ��
	 * @param model
	 * @param uid
	 * @param orderid
	 * @param orderstate
	 * @param session
	 * @return
	 */
	@RequestMapping("/Orderxq")
	public String Orderxq(Model model,int uid,Integer orderid,String orderstate,HttpSession session) {
		List<Address> ad=AddressService.getuserid(uid);
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		List<Orders> ors=OrdersService.Dan(orderid);
		List<OrdersDetail> osers=OrdersDetailService.QianXiang(orderid);
		session.setAttribute("list", list);
		session.setAttribute("list2", list2);
		model.addAttribute("ad", ad);
		model.addAttribute("ors", ors);
		model.addAttribute("osers", osers);
		return "orderxq";
	}
	
}
