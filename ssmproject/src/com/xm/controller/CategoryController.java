package com.xm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Category;
import com.xm.entity.Product;
import com.xm.service.CategoryService;
import com.xm.service.ProductService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	public CategoryService categoryservice;
	@Autowired
	ProductService productservice;
	
	@RequestMapping("/findall")
	@ResponseBody
	public Result findbypage(Category cat) {
		Result r;
		List<Category>pro=categoryservice.findall(cat);
		cat.setPage(null);
		cat.setLimit(null);
		List<Category>all=categoryservice.findall(cat);
		if(pro!=null) {
			r=new Result(0, "", all.size(), pro);
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	@RequestMapping("/onefindall")
	@ResponseBody
	public List<Category> onefindbypage() {
		return categoryservice.oneall();
	}
	@RequestMapping("/gettype")
	@ResponseBody
	public List<Category> gettype() {
		return categoryservice.gettype();
	}
	@RequestMapping("/inserttype")
	@ResponseBody
	public Result inserttype(Category cat) {
		Result r;
		List<Category>typename=categoryservice.getname(cat);
		if(typename.size()>0) {
			r=new Result(1, "不能添加重名的");
		}else {
			int i=categoryservice.inserttype(cat);
			if(i>=0) {
				r=new Result(0, "添加成功");
			}else {
				r=new Result(1, "添加失败");
			}
		}
		return r;
	}
	@RequestMapping("/updatetype")
	@ResponseBody
	public Result updatetype(Category cat) {
		Result r;
		int i=categoryservice.updatetype(cat);
		if(i>=0) {
			r=new Result(0, "修改成功");
		}else {
			r=new Result(1, "修改失败");
		}
		return r;
	}
	@RequestMapping("/deletetype")
	@ResponseBody
	public Result deletetype(int cateid) {
		Result r;
		List<Product>pro=productservice.getcateid(cateid);
		if(pro.size()>0) {
			r=new Result(1, "该类型已被引用");
		}else {
			int i=categoryservice.deletetype(cateid);
			if(i>=0) {
				r=new Result(0, "删除成功");
			}else {
				r=new Result(1, "删除失败");
			}
		}
		return r;
	}
}
