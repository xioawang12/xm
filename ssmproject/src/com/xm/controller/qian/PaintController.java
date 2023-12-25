package com.xm.controller.qian;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xm.entity.Category;
import com.xm.entity.Product;
import com.xm.service.CategoryService;
import com.xm.service.ProductService;


@Controller
@RequestMapping("/PaintController")
public class PaintController {
	@Autowired
	CategoryService CategoryService;//Àà±ðservice
	@Autowired
	ProductService productservice;
	@RequestMapping("/getpros")
	public String getpros(Model model) {
		List<Product> proquan=productservice.getpro();
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		model.addAttribute("proquan",proquan);
		return "paint";	
	}
}
