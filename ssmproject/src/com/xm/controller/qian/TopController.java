package com.xm.controller.qian;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xm.entity.Category;
import com.xm.entity.Product;
import com.xm.service.CategoryService;
import com.xm.service.ProductService;
import com.xm.service.RecommentService;

@Controller
@RequestMapping("/TopController")
public class TopController {
	@Autowired
	CategoryService CategoryService;//类别service
	@Autowired
	RecommentService RecommentService;//推荐service
	@Autowired
	ProductService ProductService;//商品service
	/**
	 * 存商品类型/添加/商品数据进入头部页面
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/getindex")
	public String getindex(Model model,HttpSession session) {
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		session.setAttribute("list", list);
		session.setAttribute("list2", list2);
		return "top";	
	}
}	
