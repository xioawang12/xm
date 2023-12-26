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
import com.xm.entity.Product;
import com.xm.entity.Shoppingcart;
import com.xm.entity.Specification;
import com.xm.service.AddressService;
import com.xm.service.CategoryService;
import com.xm.service.OrdersDetailService;
import com.xm.service.OrdersService;
import com.xm.service.ProductService;
import com.xm.service.ShoppingcartService;
import com.xm.service.SpecificationService;
import com.xm.utils.Result;
@Controller
@RequestMapping("/OrderContrller")
public class OrderContrller {
	@Autowired
	CategoryService CategoryService;//类别service
	@Autowired
	ProductService ProductService;//商品service
	@Autowired
	ShoppingcartService ShoppingcartService;//购物车service
	@Autowired
	SpecificationService SpecificationService;//规格service
	@Autowired
	AddressService AddressService;//地址service
	@Autowired
	OrdersService ordersService;//订单service
	@Autowired
	OrdersDetailService ordersDetailService;//订单详细service
	/**
	 *  存地址/商品/商品类型数据进入订单添加页面
	 * @param model
	 * @param uid
	 * @param session
	 * @param ids
	 * @param sum
	 * @return
	 */
	@RequestMapping("/getorder")
	public String getorder(Model model,int uid,HttpSession session,String ids,double sum) {
		List<Address> ad=AddressService.getuserid(uid);
		List<Product> pro=ProductService.getcate(ids);
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		session.setAttribute("list", list);
		session.setAttribute("list2", list2);
		model.addAttribute("ad", ad);
		model.addAttribute("pro", pro);
		model.addAttribute("ids", ids);
		model.addAttribute("sum", sum);
		System.out.println(ids);
		return "order";
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
			r=new Result(0, "修改成功");
		}else {
			r=new Result(1, "修改失败");
		}
		return r;
	}
	/**
	 * 订单详细添加
	 * @param ordersDetail
	 * @return
	 */
	@RequestMapping("/insertOrdersDetail")
	@ResponseBody
	public Result insertOrdersDetail(OrdersDetail ordersDetail) {
		Result r;
			int i=ordersDetailService.insertOrdersDetail(ordersDetail);
			if(i>=0) {
				r=new Result(0, "");
			}else {
				r=new Result(1, "添加失败");
			}
		return r;
	}
	/**
	 * 订单查询按用户uid
	 * @param orders
	 * @return
	 */
	@RequestMapping("/getshoppord2")
	@ResponseBody
	public Result getshoppord2(Orders orders) {
		Result r;
			List<Orders> i=ordersService.getshoppord2(orders);
			if(i.size()>=0) {
				r=new Result(0, "",i.size(),i);
			}else {
				r=new Result(1, "无数据");
			}
		return r;
	}
	/**
	 * 订单查询订单id
	 * @param orders
	 * @return
	 */
	@RequestMapping("/getshoppord")
	@ResponseBody
	public Result getshoppord(Orders orders) {
		Result r;
			List<Orders> i=ordersService.getshoppord(orders);
			if(i.size()>=0) {
				r=new Result(0, "",i.size(),i);
			}else {
				r=new Result(1, "无数据");
			}
		return r;
	}
	/**
	 * 订单添加
	 * @param orders
	 * @return
	 */
	@RequestMapping("/insertOrders")
	@ResponseBody
	public Result insertOrders(Orders orders) {
		Result r;
			int i=ordersService.insertOrders(orders);
			if(i>=0) {
				r=new Result(0, "");
			}else {
				r=new Result(1, "添加失败");
			}
		return r;
	}
	/**
	 * 商品多个查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/getcate")
	@ResponseBody
	public Result getcate(String ids) {
		Result r;
		List<Product> i=ProductService.getcate(ids);
		if(i!=null) {
			r=new Result(0, "", i.size(), i);
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	/**
	 * 查用户软删按默认降序
	 * @param add
	 * @param uid
	 * @return
	 */
	@RequestMapping("/getadd")
	@ResponseBody
	public Result getadd(Address add,int uid) {
		Result r;
		List<Address> i=AddressService.getuserid(uid);
		if(i!=null) {
			r=new Result(0, "", i.size(), i);
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	/**
	 * 地址添加
	 * @param add
	 * @return
	 */
	@RequestMapping("/insertpro")
	@ResponseBody
	public Result insertpro(Address add) {
		Result r;
			int i=AddressService.insertAddress(add);
			if(i>=0) {
				r=new Result(0, "添加成功");
			}else {
				r=new Result(1, "添加失败");
			}
		return r;
	}
	/**
	 * 地址修改
	 * @param add
	 * @return
	 */
	@RequestMapping("/updateAddress")
	@ResponseBody
	public Result updateAddress(Address add) {
		Result r;
		int i=AddressService.updateAddress(add);
		if(i>=0) {
			r=new Result(0, "修改成功");
		}else {
			r=new Result(1, "修改失败");
		}
		return r;
	}
	/**
	 * 地址查
	 * @param adid
	 * @return
	 */
	@RequestMapping("/deleteAddress")
	@ResponseBody
	public Result deleteAddress(int adid) {
		Result r;
		int i=AddressService.deleteAddress(adid);
		if(i>=0) {
			r=new Result(0, "删除成功");
		}else {
			r=new Result(1, "删除失败");
		}
		return r;
	}
	/**
	 * 地址单查按地址id
	 * @param adid
	 * @return
	 */
	@RequestMapping("/danAddress")
	@ResponseBody
	public Result danAddress(int adid) {
		Result r;
		List<Address> i=AddressService.danAddress(adid);
		if(i!=null) {
			r=new Result(0, "", i.size(), i);
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	/**
	 * 查用户地址已默认的
	 * @param uid
	 * @return
	 */
	@RequestMapping("/getMo")
	@ResponseBody
	public Result getMo(int uid) {
		Result r;
		List<Address> i=AddressService.getMo(uid);
		if(i.size()>0) {
			r=new Result(0, "", i.size(), i);
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	/**
	 * 修改已默认
	 * @param add
	 * @return
	 */
	@RequestMapping("/Morenyi")
	@ResponseBody
	public Result Morenyi(Address add) {
		Result r;
		int i=AddressService.Morenyi(add);
		if(i>=0) {
			r=new Result(0, "默认地址成功");
		}else {
			r=new Result(1, "默认地址失败");
		}
		return r;
	}
	/**
	 * 修改取消默认
	 * @param add
	 * @return
	 */
	@RequestMapping("/Moren")
	@ResponseBody
	public Result Moren(Address add) {
		Result r;
		int i=AddressService.Moren(add);
		if(i>=0) {
			r=new Result(0, "取消默认成功");
		}else {
			r=new Result(1, "取消默认失败");
		}
		return r;
	}
	/**
	 * 购物车多删
	 * @param ids
	 * @return
	 */
	@RequestMapping("/deleteAllShoppingcart")
	@ResponseBody
	public Result deleteAllShoppingcart(String ids) {
		Result r;
			int i=ShoppingcartService.deleteAllShoppingcart(ids);
			if(i>=0) {
				r=new Result(0, "删除成功");
			}else {
				r=new Result(1, "删除失败");
			}
		return r;
	}
	/**
	 * 商品规格按颜色查
	 * @param speci
	 * @return
	 */
	@RequestMapping("/getsname")
	@ResponseBody
	public Result getsname(Specification speci) {
		Result r;
		 List<Specification> all=SpecificationService.getname(speci);
		if(all!=null) {
			r=new Result(0, "",all.size(),all);
			System.out.println();
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	/**
	 * 按购物车id修改规格表
	 * @param speci
	 * @return
	 */
	@RequestMapping("/upsstock")
	@ResponseBody
	public Result upsstock(Specification speci) {
		Result r;
			int i=SpecificationService.upsstock(speci);
			if(i>=0) {
				r=new Result(0, "修改成功");
			}else {
				r=new Result(1, "修改失败");
			}
		return r;
	}
}
