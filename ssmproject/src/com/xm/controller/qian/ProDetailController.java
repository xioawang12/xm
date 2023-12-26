package com.xm.controller.qian;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Category;
import com.xm.entity.Comment;
import com.xm.entity.Product;
import com.xm.entity.Proimg;
import com.xm.entity.Recomment;
import com.xm.entity.Shoppingcart;
import com.xm.entity.Specification;
import com.xm.service.CategoryService;
import com.xm.service.CommentService;
import com.xm.service.ProductService;
import com.xm.service.ProimgService;
import com.xm.service.RecommentService;
import com.xm.service.ShoppingcartService;
import com.xm.service.SpecificationService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/ProDetailController")
public class ProDetailController {
	@Autowired
	ShoppingcartService shoppingcartservice;//购物车service
	@Autowired
	CategoryService CategoryService;//类别service
	@Autowired
	ProductService productService;//商品service
	@Autowired
	ProimgService proimgService;//商品图片service
	@Autowired
	RecommentService RecommentService;//推荐service
	@Autowired
	CommentService commentService;//商品评价service
	@Autowired
	SpecificationService specificationservice;
	/**
	 * 存商品/商品类型/购物车/商品图片/推荐数据进入订单商品详细页面
	 * @param model
	 * @param session
	 * @param pid
	 * @param cateid
	 * @return
	 */
	@RequestMapping("/getDetail")
	public String getDetail(Model model, HttpSession session,int pid,int cateid) {
		List<Product> pross=productService.getLeiShang(cateid);
		List<Product> pro=productService.getDetail(pid);
		List<Product> pros=productService.getprospec(pid);
		List<Proimg> proimg=proimgService.getpid(pid);
		List<Recomment> recomment=RecommentService.QianRecos();
		List<Recomment> recomments=RecommentService.QianReco(5);
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		List<Comment> com=commentService.getComments(pid);
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		model.addAttribute("recomments", recomments);
		model.addAttribute("com", com);
		model.addAttribute("pro", pro);
		model.addAttribute("pros", pros);
		model.addAttribute("proimg", proimg);
		model.addAttribute("recomment", recomment);
		return "proDetail";
	}
	/**
	 * 按商品规格查
	 * @param speci
	 * @return
	 */
	@RequestMapping("/getproses")
	@ResponseBody
	public Result getproses(Specification speci) {
		Result r;
		 List<Specification> all=specificationservice.getname(speci);
		if(all!=null) {
			r=new Result(0, "",all.size(),all);
			System.out.println();
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	/**
	 * 按购物车多个表id查询
	 * @param shopp
	 * @return
	 */
	@RequestMapping("/getpsid")
	@ResponseBody
	public Result getpsid(Shoppingcart shopp) {
		Result r;
		 List<Shoppingcart> all=shoppingcartservice.getpsid(shopp);
		if(all.size()>0) {
			r=new Result(0, "",all.size(),all);
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
	/**
	 * 购物车添加
	 * @param shopp
	 * @return
	 */
	@RequestMapping("/innershopp")
	@ResponseBody
	public Result innershopp(Shoppingcart shopp) {
		Result r;
		int i=shoppingcartservice.insertShoppingcart(shopp);
		if(i>=0) {
			r=new Result(0, "购物车添加成功");
		}else {
			r=new Result(1, "购物车添加失败");
		}
		return r;
	}
	/**
	 * 购物车修改
	 * @param shopp
	 * @return
	 */
	@RequestMapping("/updateshopp")
	@ResponseBody
	public Result updateshopp(Shoppingcart shopp) {
		Result r;
		int i=shoppingcartservice.updatesho(shopp);
		if(i>=0) {
			r=new Result(0, "购物车添加成功");
		}else {
			r=new Result(1, "购物车添加失败");
		}
		return r;
	}
	/**
	 * 购物车单表按商品id购物车id查
	 * @param shopp
	 * @return
	 */
	@RequestMapping("/getshisid")
	@ResponseBody
	public Result getshisid(Shoppingcart shopp) {
		Result r;
		 List<Shoppingcart> all=shoppingcartservice.getshisid(shopp);
		if(all.size()>0) {
			r=new Result(0, "",all.size(),all);
			System.out.println();
		}else {
			r=new Result(1, "无数据");
		}
		return r;
	}
}
