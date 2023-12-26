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
	UserService userservice;//�����û���service
	/**
	 * �����û����ƺ��û�����ȫ��
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
				r=new Result(0, "��½�ɹ�");
			}else {
				r=new Result(1, "�����˺�û��Ȩ�޻����˺��ѱ����");
			}
		}else {
			r=new Result(1, "�û������������");
		}
		return r;
	}
	/**
	 * �����û�id�޸�ͷ��
	 * @param
	 * @return
	 */
	@RequestMapping("/upuimg")
	@ResponseBody
	public Result upuimg(User user) {
		Result r;
		int i=userservice.upimg(user);
		if(i>=0) {
			r=new Result(0, "�޸ĳɹ�");
		}else {
			r=new Result(1, "�޸�ʧ��");
		}
		return r;
	}
	/**
	 * �����û�id�޸�����
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
					r=new Result(0, "�޸ĳɹ�,�����µ�½");
					//out.print("<script>alert('�������޸������µ�¼');location.href='../../login.jsp'</script>");
					//response.sendRedirect("../../login.jsp");
				}else {
					r=new Result(1, "�޸�ʧ��");
				}
			}else {
				r=new Result(1, "�������벻һ��");
			}
			
		}else {
			r=new Result(1, "�������������");
		}
		return r;
	}
}
