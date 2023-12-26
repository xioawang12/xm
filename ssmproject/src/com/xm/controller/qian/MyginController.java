package com.xm.controller.qian;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xm.entity.Category;
import com.xm.entity.Comment;
import com.xm.entity.User;
import com.xm.service.CategoryService;
import com.xm.service.UserService;

@Controller
@RequestMapping("/MyginController")
public class MyginController {
	/**
	 * ��Ʒ����
	 */
	@Autowired
	CategoryService CategoryService;//���service
	/**
	 * �û�
	 */
	@Autowired
	UserService userService;
	/**
	 * ���û�/��Ʒ�������ݽ����������ҳ��
	 * @param model
	 * @param uid
	 * @return
	 */
	@RequestMapping("/getUser")
	public String getUser(Model model) {
		List<Category> list=CategoryService.gettype();
		List<Category> list2=CategoryService.getQianW();
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		return "mygxin";
	}
}
