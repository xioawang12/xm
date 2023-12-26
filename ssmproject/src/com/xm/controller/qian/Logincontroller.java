package com.xm.controller.qian;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Specification;
import com.xm.entity.User;
import com.xm.service.UserService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/denglu")
public class Logincontroller {
	/**
	 * 用户
	 */
	@Autowired
	UserService userservice;
	/**
	 * 密码验证
	 * @param user
	 * @param session
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/logins")
	public String login(User user,HttpSession session,HttpServletResponse response) throws IOException{
		user=userservice.login(user);
		response.setContentType("text/html;charset=utf-8");
		if(user!=null) {
			if(user.getUstate()==0) {
				session.setAttribute("user", user);
				response.getWriter().write("<script>window.location='../IndexController/getindex'; </script>");	
			}else {
				response.getWriter().write("<script>alert('账号已被封禁无法登录!'); window.location='../denglu/login';</script>");	
			}
		}else {
			response.getWriter().write("<script>alert('账号密码错误，请重新登录！<br/>好好想想哦qwq'); window.location='../denglu/login';</script>");	
			
		}
		return null;
	}
	/**
	 * 进入登录页面
	 * @param session
	 * @return
	 */
	@RequestMapping("/login")
	public String tologin(HttpSession session){
		session.invalidate();
		return "login";
		}
	/**
	 * 进入密码页面
	 * @return
	 */
	@RequestMapping("/addusers")
	public String addusers(){
		return "reg";
		}
	/**
	 * 注册验证
	 * @param user
	 * @param session
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/adduser")
	public String adduser(User user,HttpSession session,Model model,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		List<User>getuse=userservice.getuname(user.getUname());
		if(user.getUpwd().equals(user.getUpwd2())) {
			if(getuse.size()>0) {
				response.getWriter().write("<script>alert('注册失败,该用户名已被使用!');window.location='../denglu/addusers'; </script>");	
			}else {
				int i=userservice.adduser(user);
				if(i>0) {
					response.getWriter().write("<script>alert('注册成功,返回登录!');window.location='../denglu/login'; </script>");	
				}else {
				
					response.getWriter().write("<script>alert('注册失败,请重新注册!');window.location='../denglu/addusers'; </script>");	
				}
			}
		}else {
			response.getWriter().write("<script>alert('两次密码不相同');window.location='../denglu/addusers'; </script>");	

		}
		return null;
	}
	/**
	 * 进入修改密码页面
	 * @return
	 */
	@RequestMapping("/uppwd")
	public String uppwd(){
		return "remima";
		}
	/**
	 * 修改密码验证
	 * @param user
	 * @param session
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/upupwd")
	public String upupwd(User user,HttpSession session,Model model,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		if (user.getUpwd().equals(user.getUpwd2())) {
			if (user.getUpwd3().equals(user.getUpwd4())) {
				int i=userservice.uppwd(user);
				if(i>0) {
					response.getWriter().write("<script>alert('密码修改成功，请重新登录!');window.location='../denglu/login'; </script>");	
				}else {
					response.getWriter().write("<script>alert('密码修改失败!'); window.location='../denglu/uppwd';</script>");
				}
			}else {
				response.getWriter().write("<script>alert('与新密码不一致!'); window.location='../denglu/uppwd';</script>");
			}
			
		}else {
			response.getWriter().write("<script>alert('与旧密码不一致!'); window.location='../denglu/uppwd';</script>");
		}
		return null;
	}
	/**
	 * 用户名验证
	 * @param user
	 * @return
	 */
	@RequestMapping("/getuname")
	@ResponseBody
	public Result getuname(User user) {
		Result r;
		 List<User> getname=userservice.getuname(user.getUname());
		if(getname.size()>0) {
			r=new Result(0, "用户名已被使用");
		}else {
			r=new Result(1, "用户名可以用");
		}
		return r;
	}
}
