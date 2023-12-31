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
import com.xm.entity.Product;
import com.xm.service.AddressService;
import com.xm.service.CategoryService;
import com.xm.utils.Result;
@Controller
@RequestMapping("/AddressController")
public class AddressController {
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
	 * 存地址数据进入地址页面
	 * @param model
	 * @param uid
	 * @param session
	 * @return
	 */
	@RequestMapping("/addres")
	public String addres(Model model,int uid,HttpSession session) {
		List<Address> ad=AddressService.getuserid(uid);
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		session.setAttribute("list", list);
		session.setAttribute("list2", list2);
		model.addAttribute("ad", ad);
		return "address";
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
}

