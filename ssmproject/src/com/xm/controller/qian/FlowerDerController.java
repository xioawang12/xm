package com.xm.controller.qian;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xm.entity.Category;
import com.xm.entity.Product;
import com.xm.entity.ProductVo;
import com.xm.entity.Proimg;
import com.xm.service.CategoryService;
import com.xm.service.ProductService;
import com.xm.service.ProimgService;

@Controller
@RequestMapping("/flowerder")
public class FlowerDerController {
	/**
	 * 商品类型
	 */
	@Autowired
	CategoryService CategoryService;//类别service
	
	/**
	 * 商品图片
	 */
	@Autowired
	ProimgService proimgService;
	/**
	 * 商品
	 */
	@Autowired
	ProductService productservice;
	/**
	 * 存商品数据进入商品类型页面
	 * @param model
	 * @param cateid
	 * @return
	 */
	@RequestMapping("/getpro")
	public String getpro(Model model,int cateid) {
		List<Product> pro=productservice.getLeiShang(cateid);
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		model.addAttribute("pro", pro);
		return "flowerDer";	
	}
}
