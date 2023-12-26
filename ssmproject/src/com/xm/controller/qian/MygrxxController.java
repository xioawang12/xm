package com.xm.controller.qian;

import java.util.List;

import javax.mail.Session;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xm.entity.Category;
import com.xm.entity.User;
import com.xm.service.CategoryService;
import com.xm.service.UserService;

@Controller
@RequestMapping("/MygrxxController")
public class MygrxxController {
	/**
	 * 商品类型
	 */
	@Autowired
	CategoryService CategoryService;//类别service
	/**
	 * 用户
	 */
	@Autowired
	UserService userService;
	/**
	 * 存用户/商品类型数据进入个人信息页面
	 * @param model
	 * @param uid
	 * @param session
	 * @return
	 */
	@RequestMapping("/getUser")
	public String getUser(Model model,HttpSession session) {
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		session.setAttribute("list", list);
		session.setAttribute("list2", list2);
		return "mygrxx";
	}
}
