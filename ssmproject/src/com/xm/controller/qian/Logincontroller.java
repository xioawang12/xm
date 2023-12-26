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
	 * �û�
	 */
	@Autowired
	UserService userservice;
	/**
	 * ������֤
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
				response.getWriter().write("<script>alert('�˺��ѱ�����޷���¼!'); window.location='../denglu/login';</script>");	
			}
		}else {
			response.getWriter().write("<script>alert('�˺�������������µ�¼��<br/>�ú�����Ŷqwq'); window.location='../denglu/login';</script>");	
			
		}
		return null;
	}
	/**
	 * �����¼ҳ��
	 * @param session
	 * @return
	 */
	@RequestMapping("/login")
	public String tologin(HttpSession session){
		session.invalidate();
		return "login";
		}
	/**
	 * ��������ҳ��
	 * @return
	 */
	@RequestMapping("/addusers")
	public String addusers(){
		return "reg";
		}
	/**
	 * ע����֤
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
				response.getWriter().write("<script>alert('ע��ʧ��,���û����ѱ�ʹ��!');window.location='../denglu/addusers'; </script>");	
			}else {
				int i=userservice.adduser(user);
				if(i>0) {
					response.getWriter().write("<script>alert('ע��ɹ�,���ص�¼!');window.location='../denglu/login'; </script>");	
				}else {
				
					response.getWriter().write("<script>alert('ע��ʧ��,������ע��!');window.location='../denglu/addusers'; </script>");	
				}
			}
		}else {
			response.getWriter().write("<script>alert('�������벻��ͬ');window.location='../denglu/addusers'; </script>");	

		}
		return null;
	}
	/**
	 * �����޸�����ҳ��
	 * @return
	 */
	@RequestMapping("/uppwd")
	public String uppwd(){
		return "remima";
		}
	/**
	 * �޸�������֤
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
					response.getWriter().write("<script>alert('�����޸ĳɹ��������µ�¼!');window.location='../denglu/login'; </script>");	
				}else {
					response.getWriter().write("<script>alert('�����޸�ʧ��!'); window.location='../denglu/uppwd';</script>");
				}
			}else {
				response.getWriter().write("<script>alert('�������벻һ��!'); window.location='../denglu/uppwd';</script>");
			}
			
		}else {
			response.getWriter().write("<script>alert('������벻һ��!'); window.location='../denglu/uppwd';</script>");
		}
		return null;
	}
	/**
	 * �û�����֤
	 * @param user
	 * @return
	 */
	@RequestMapping("/getuname")
	@ResponseBody
	public Result getuname(User user) {
		Result r;
		 List<User> getname=userservice.getuname(user.getUname());
		if(getname.size()>0) {
			r=new Result(0, "�û����ѱ�ʹ��");
		}else {
			r=new Result(1, "�û���������");
		}
		return r;
	}
}
