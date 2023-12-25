package com.xm.controller.qian;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xm.entity.Category;
import com.xm.entity.Product;
import com.xm.entity.Recomment;
import com.xm.entity.Specification;
import com.xm.service.CategoryService;
import com.xm.service.ProductService;
import com.xm.service.RecommentService;
import com.xm.service.SpecificationService;

@Controller
@RequestMapping("/IndexController")
public class IndexController {
	@Autowired
	CategoryService CategoryService;//类别service
	@Autowired
	RecommentService RecommentService;//类别service
	@Autowired 
	ProductService ProductService;
	@Autowired
	SpecificationService SpecificationService;
	@RequestMapping("/getindex")
	public String getindex(Model model,HttpSession session) {
		List<Recomment> recomm1=RecommentService.QianReco(1);
		List<Recomment> recomm2=RecommentService.QianReco(2);
		List<Recomment> recomm3=RecommentService.QianReco(3);
		List<Recomment> recomm4=RecommentService.QianReco(4);
		List<Recomment> recomm5=RecommentService.QianReco(5);
		List<Product> pro=ProductService.getpro();
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		model.addAttribute("recomm1", recomm1);
		model.addAttribute("recomm2", recomm2);
		model.addAttribute("recomm3", recomm3);
		model.addAttribute("recomm4", recomm4);
		model.addAttribute("recomm5", recomm5);
		session.setAttribute("pro", pro);
		return "index";	
	}
}
