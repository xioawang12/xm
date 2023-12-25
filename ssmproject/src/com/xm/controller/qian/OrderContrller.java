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
	CategoryService CategoryService;//���service
	@Autowired
	ProductService ProductService;//��Ʒservice
	@Autowired
	ShoppingcartService ShoppingcartService;//���ﳵservice
	@Autowired
	SpecificationService SpecificationService;//���service
	@Autowired
	AddressService AddressService;
	@Autowired
	OrdersService ordersService;
	@Autowired
	OrdersDetailService ordersDetailService;
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
	@RequestMapping("/updateOrders")
	@ResponseBody
	public Result updateOrders(Orders orders) {
		Result r;
		int i=ordersService.updateOrders(orders);
		if(i>=0) {
			r=new Result(0, "�޸ĳɹ�");
		}else {
			r=new Result(1, "�޸�ʧ��");
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
				r=new Result(1, "���ʧ��");
			}
		return r;
	}
	@RequestMapping("/getshoppord2")
	@ResponseBody
	public Result getshoppord2(Orders orders) {
		Result r;
			List<Orders> i=ordersService.getshoppord2(orders);
			if(i.size()>=0) {
				r=new Result(0, "",i.size(),i);
			}else {
				r=new Result(1, "������");
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
				r=new Result(1, "������");
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
				r=new Result(1, "���ʧ��");
			}
		return r;
	}
	@RequestMapping("/getcate")
	@ResponseBody
	public Result getcate(String ids) {
		Result r;
		List<Product> i=ProductService.getcate(ids);
		if(i!=null) {
			r=new Result(0, "", i.size(), i);
		}else {
			r=new Result(1, "������");
		}
		return r;
	}
	@RequestMapping("/getadd")
	@ResponseBody
	public Result getadd(Address add,int uid) {
		Result r;
		List<Address> i=AddressService.getuserid(uid);
		if(i!=null) {
			r=new Result(0, "", i.size(), i);
		}else {
			r=new Result(1, "������");
		}
		return r;
	}
	@RequestMapping("/insertpro")
	@ResponseBody
	public Result insertpro(Address add) {
		Result r;
			int i=AddressService.insertAddress(add);
			if(i>=0) {
				r=new Result(0, "��ӳɹ�");
			}else {
				r=new Result(1, "���ʧ��");
			}
		return r;
	}
	@RequestMapping("/updateAddress")
	@ResponseBody
	public Result updateAddress(Address add) {
		Result r;
		int i=AddressService.updateAddress(add);
		if(i>=0) {
			r=new Result(0, "�޸ĳɹ�");
		}else {
			r=new Result(1, "�޸�ʧ��");
		}
		return r;
	}
	@RequestMapping("/deleteAddress")
	@ResponseBody
	public Result deleteAddress(int adid) {
		Result r;
		int i=AddressService.deleteAddress(adid);
		if(i>=0) {
			r=new Result(0, "ɾ���ɹ�");
		}else {
			r=new Result(1, "ɾ��ʧ��");
		}
		return r;
	}
	@RequestMapping("/danAddress")
	@ResponseBody
	public Result danAddress(int adid) {
		Result r;
		List<Address> i=AddressService.danAddress(adid);
		if(i!=null) {
			r=new Result(0, "", i.size(), i);
		}else {
			r=new Result(1, "������");
		}
		return r;
	}
	@RequestMapping("/getMo")
	@ResponseBody
	public Result getMo(int uid) {
		Result r;
		List<Address> i=AddressService.getMo(uid);
		if(i.size()>0) {
			r=new Result(0, "", i.size(), i);
		}else {
			r=new Result(1, "������");
		}
		return r;
	}
	@RequestMapping("/Morenyi")
	@ResponseBody
	public Result Morenyi(Address add) {
		Result r;
		int i=AddressService.Morenyi(add);
		if(i>=0) {
			r=new Result(0, "Ĭ�ϵ�ַ�ɹ�");
		}else {
			r=new Result(1, "Ĭ�ϵ�ַʧ��");
		}
		return r;
	}
	@RequestMapping("/Moren")
	@ResponseBody
	public Result Moren(Address add) {
		Result r;
		int i=AddressService.Moren(add);
		if(i>=0) {
			r=new Result(0, "ȡ��Ĭ�ϳɹ�");
		}else {
			r=new Result(1, "ȡ��Ĭ��ʧ��");
		}
		return r;
	}
	@RequestMapping("/deleteAllShoppingcart")
	@ResponseBody
	public Result deleteAllShoppingcart(String ids) {
		Result r;
			int i=ShoppingcartService.deleteAllShoppingcart(ids);
			if(i>=0) {
				r=new Result(0, "ɾ���ɹ�");
			}else {
				r=new Result(1, "ɾ��ʧ��");
			}
		return r;
	}
	@RequestMapping("/getsname")
	@ResponseBody
	public Result getsname(Specification speci) {
		Result r;
		 List<Specification> all=SpecificationService.getname(speci);
		if(all!=null) {
			r=new Result(0, "",all.size(),all);
			System.out.println();
		}else {
			r=new Result(1, "������");
		}
		return r;
	}
	@RequestMapping("/upsstock")
	@ResponseBody
	public Result upsstock(Specification speci) {
		Result r;
			int i=SpecificationService.upsstock(speci);
			if(i>=0) {
				r=new Result(0, "�޸ĳɹ�");
			}else {
				r=new Result(1, "�޸�ʧ��");
			}
		return r;
	}
}
