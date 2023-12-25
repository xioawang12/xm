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
	@Autowired
	CategoryService CategoryService;//���service
	@Autowired
	AddressService AddressService;
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
}

