package com.xm.controller.qian;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Category;
import com.xm.entity.Orders;
import com.xm.entity.OrdersDetail;
import com.xm.entity.Product;
import com.xm.entity.Shoppingcart;
import com.xm.service.CategoryService;
import com.xm.service.OrdersDetailService;
import com.xm.service.OrdersService;
import com.xm.service.ProductService;
import com.xm.service.ShoppingcartService;
import com.xm.utils.Result;
@Controller
@RequestMapping("/CartController")
public class CartController {
	@Autowired
	CategoryService CategoryService;//Àà±ðservice

	@Autowired
	ShoppingcartService ShoppingcartService;
	@Autowired
	OrdersService ordersService;
	@Autowired
	OrdersDetailService ordersDetailService;
	@RequestMapping("/Gowu")
public String Gowu(Model model,int uid ) {
	List<Shoppingcart> sho=ShoppingcartService.findShoppingcart(uid);
	List<Category> list=CategoryService.gettype();
	List<Category> list2=CategoryService.getQianW();
	model.addAttribute("list", list);
	model.addAttribute("list2", list2);
	model.addAttribute("sho", sho);
	return "cart";
}
	
	@RequestMapping("/deletcart")
	@ResponseBody
	public Result deletcart(int shopid) {
		Result r;
			int i=ShoppingcartService.deleteShoppingcart(shopid);
			if(i>=0) {
				r=new Result(0, "É¾³ý³É¹¦");
			}else {
				r=new Result(1, "É¾³ýÊ§°Ü");
			}
		return r;
	}
	@RequestMapping("/deleteAllShoppingcart")
	@ResponseBody
	public Result deleteAllShoppingcart(String ids) {
		Result r;
			int i=ShoppingcartService.deleteAllShoppingcart(ids);
			if(i>=0) {
				r=new Result(0, "É¾³ý³É¹¦");
			}else {
				r=new Result(1, "É¾³ýÊ§°Ü");
			}
		return r;
	}
	@RequestMapping("/insertOrders")
	@ResponseBody
	public Result insertOrders(Orders orders) {
		Result r;
			int i=ordersService.insertOrders(orders);
			if(i>=0) {
				r=new Result(0, "");
			}else {
				r=new Result(1, "Ìí¼ÓÊ§°Ü");
			}
		return r;
	}
	@RequestMapping("/getshoppord")
	@ResponseBody
	public Result getshoppord(Orders orders) {
		Result r;
			List<Orders> i=ordersService.getshoppord(orders);
			if(i.size()>=0) {
				r=new Result(0, "",i.size(),i);
			}else {
				r=new Result(1, "ÎÞÊý¾Ý");
			}
		return r;
	}
	@RequestMapping("/insertOrdersDetail")
	@ResponseBody
	public Result insertOrdersDetail(OrdersDetail ordersDetail) {
		Result r;
			int i=ordersDetailService.insertOrdersDetail(ordersDetail);
			if(i>=0) {
				r=new Result(0, "");
			}else {
				r=new Result(1, "Ìí¼ÓÊ§°Ü");
			}
		return r;
	}
	@RequestMapping("/updatesho")
	@ResponseBody
	public Result updatesho(Shoppingcart shoppingcart) {
		Result r;
			int i=ShoppingcartService.updatesho(shoppingcart);
			if(i>=0) {
				r=new Result(0, "");
			}else {
				r=new Result(1, "ÐÞ¸ÄÊ§°Ü");
			}
		return r;
	}
}

