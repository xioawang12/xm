package com.xm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Product;
import com.xm.entity.ProductVo;
import com.xm.entity.Proimg;
import com.xm.entity.Specification;
import com.xm.service.ProductService;
import com.xm.service.ProimgService;
import com.xm.service.SpecificationService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/product")
public class ProductConeroller {
	@Autowired
	ProductService productservice;
	@Autowired
	ProimgService proimgservice;
	@Autowired
	SpecificationService specificationservice;
	@RequestMapping("/findall")
	@ResponseBody
	public Result findbypage(ProductVo provo) {
		Result r;
		List<Product>pro=productservice.findall(provo);
		provo.setPage(null);
		provo.setLimit(null);
		List<Product>all=productservice.findall(provo);
		if(pro!=null) {
			r=new Result(0, "", all.size(), pro);
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	@RequestMapping("/insertpro")
	@ResponseBody
	public Result insertpro(Product pro) {
		Result r;
		List<Product>getpro=productservice.getname(pro);
		if(getpro.size()>0) {
			r=new Result(1, "不能添加同名的商品");
		}else {
			int i=productservice.insertpro(pro);
			if(i>=0) {
				r=new Result(0, "添加成功");
			}else {
				r=new Result(1, "添加失败");
			}
		}
		return r;
	}
	@RequestMapping("/updatepro")
	@ResponseBody
	public Result updatepro(Product pro) {
		Result r;
		int i=productservice.updatepro(pro);
		if(i>=0) {
			r=new Result(0, "修改成功");
		}else {
			r=new Result(1, "修改失败");
		}
		return r;
	}
	@RequestMapping("/deletepro")
	@ResponseBody
	public Result deletepro(int pid) {
		Result r;
		List<Proimg>imgid=proimgservice.getpid(pid);
		List<Specification>spid=specificationservice.getspec(pid);
		if(imgid.size()>0||spid.size()>0) {
			r=new Result(1, "该商品已被引用");
		}else {
			int i=productservice.deletepro(pid);
			if(i>=0) {
				r=new Result(0, "删除成功");
			}else {
				r=new Result(1, "删除失败");
			}
		}
		
		return r;
	}
	@RequestMapping("/deleteById")
	@ResponseBody
	public Result deleteById(String ids) {
		Result r;
		int i=productservice.deleteById(ids);
		if(i>=0) {
			r=new Result(0, "删除成功");
		}else {
			r=new Result(1, "删除失败");
		}
		return r;
	}
	@RequestMapping("/getpro")
	@ResponseBody
	public List<Product> getpro() {
		return productservice.getpro();
	}
	@RequestMapping("/shangjia")
	@ResponseBody
	public Result shangjia(Product pro) {
		Result r;
		int i=productservice.shangjia(pro);
		if(i>=0) {
			r=new Result(0, "上架成功");
		}else {
			r=new Result(1, "上架失败");
		}
		return r;
	}
	@RequestMapping("/xiajia")
	@ResponseBody
	public Result xiajia(Product pro) {
		Result r;
		int i=productservice.xiajia(pro);
		if(i>=0) {
			r=new Result(0, "下架成功");
		}else {
			r=new Result(1, "下架失败");
		}
		return r;
	}
	@RequestMapping("/pishang")
	@ResponseBody
	public Result pishang(String ids) {
		Result r;
		int i=productservice.pishang(ids);
		if(i>=0) {
			r=new Result(0, "上架成功");
		}else {
			r=new Result(1, "上架失败");
		}
		return r;
	}
	@RequestMapping("/pixia")
	@ResponseBody
	public Result pixia(String ids) {
		Result r;
		int i=productservice.pixia(ids);
		if(i>=0) {
			r=new Result(0, "下架成功");
		}else {
			r=new Result(1, "下架失败");
		}
		return r;
	}
}
