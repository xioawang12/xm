package com.xm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Category;
import com.xm.entity.Product;
import com.xm.entity.ProductVo;
import com.xm.entity.Proimg;
import com.xm.service.ProimgService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/proimg")
public class ProimgController {
	@Autowired
	ProimgService proimgservice;//调用商品图片的service
	/**
	 * 多条件查
	 * @param 
	 * @return
	 */
	@RequestMapping("/findall")
	@ResponseBody
	public Result findbypage(Proimg img) {
		Result r;
		List<Proimg>pro=proimgservice.findall(img);
		img.setPage(null);
		img.setLimit(null);
		List<Proimg>all=proimgservice.findall(img);
		if(pro!=null) {
			r=new Result(0, "", all.size(), pro);
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	/**
	 * 添加
	 * @param 
	 * @return
	 */
	@RequestMapping("/insertimg")
	@ResponseBody
	public Result insertimg(Proimg img) {
		Result r;
		int i=proimgservice.insertimg(img);
		if(i>=0) {
			r=new Result(0, "添加成功");
		}else {
			r=new Result(1, "添加失败");
		}
		return r;
	}
	/**
	 * 根据商品id全查
	 * @param 
	 * @return
	 */
	@RequestMapping("/getpid")
	@ResponseBody
	public Result getpid(int pid) {
		Result r;
		List<Proimg>pro=proimgservice.getpid(pid);
		if(pro!=null) {
			r=new Result(0, "", pro.size(), pro);
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	/**
	 * 根据商品id修改
	 * @param 
	 * @return
	 */
	@RequestMapping("/updateimg")
	@ResponseBody
	public Result updateimg(Proimg img) {
		Result r;
		int i=proimgservice.updateimg(img);
		if(i>=0) {
			r=new Result(0, "修改成功");
		}else {
			r=new Result(1, "修改失败");
		}
		return r;
	}
	/**
	 * 根据商品图片id删除
	 * @param 
	 * @return
	 */
	@RequestMapping("/deleteimg")
	@ResponseBody
	public Result deleteimg(int imgid) {
		Result r;
		int i=proimgservice.deleteimg(imgid);
		if(i>=0) {
			r=new Result(0, "删除成功");
		}else {
			r=new Result(1, "删除失败");
		}
		return r;
	}
}
