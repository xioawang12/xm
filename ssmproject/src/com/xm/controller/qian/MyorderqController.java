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
	 * ��Ʒ����
	 */
	@Autowired
	CategoryService CategoryService;//���service
	/**
	 * ��ַ
	 */
	@Autowired
	AddressService AddressService;
	/**
	 * ����
	 */
	@Autowired
	OrdersService OrdersService;
	/**
	 * ������ϸ
	 */
	@Autowired
	OrdersDetailService OrdersDetailService;
	/**
	 * �û�
	 */
	@Autowired
	UserService userService;
	/**
	 * ���ַ/��Ʒ����/����/������ϸ���ݽ��붩��ҳ��
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
	 * ���ַ/��Ʒ����/����/������ϸ���ݽ��붩��ҳ��
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
	 * �޸Ķ���״̬��Ϊ4���ջ�
	 * @param orders
	 * @return
	 */
	@RequestMapping("/QianxiuMy")
	@ResponseBody
	public Result Qianxiu(Orders orders) {
		Result r;
		int i=OrdersService.Qianxiu(orders);
		if(i>=0) {
			r=new Result(0, "�޸ĳɹ�");
		}else {
			r=new Result(1, "�޸�ʧ��");
		}
		return r;
	}
	/**
	 * ���������ѯ
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
				r=new Result(1, "������");
			}
		return r;
	}
}
