package com.xm.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Product;
import com.xm.entity.User;
import com.xm.service.UserService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userservice;//调用用户的service
	/**
	 * 根据用户名称和用户密码全查
	 * @param
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public Result login(User user,HttpSession session) {
		Result r;
		user=userservice.login(user);
		
		if(user!=null) {
			if(user.getUstate()==0&&user.getUrole()==0) {
				session.setAttribute("user", user);
				r=new Result(0, "登陆成功");
			}else {
				r=new Result(1, "您的账号没有权限或者账号已被封禁");
			}
		}else {
			r=new Result(1, "用户名或密码错误");
		}
		return r;
	}
	/**
	 * 根据用户id修改头像
	 * @param
	 * @return
	 */
	@RequestMapping("/upuimg")
	@ResponseBody
	public Result upuimg(User user) {
		Result r;
		int i=userservice.upimg(user);
		if(i>=0) {
			r=new Result(0, "修改成功");
		}else {
			r=new Result(1, "修改失败");
		}
		return r;
	}
	/**
	 * 根据用户id修改密码
	 * @param
	 * @return
	 */
	@RequestMapping("/uppwd")
	@ResponseBody
	public Result uppwd(User user) {
		Result r;
		if (user.getUpwd().equals(user.getUpwd2())) {
			if (user.getUpwd3().equals(user.getUpwd4())) {
				int i=userservice.uppwd(user);
				if(i>0) {
					r=new Result(0, "修改成功,请重新登陆");
					//out.print("<script>alert('密码已修改请重新登录');location.href='../../login.jsp'</script>");
					//response.sendRedirect("../../login.jsp");
				}else {
					r=new Result(1, "修改失败");
				}
			}else {
				r=new Result(1, "与新密码不一致");
			}
			
		}else {
			r=new Result(1, "旧密码输入错误");
		}
		return r;
	}
}
