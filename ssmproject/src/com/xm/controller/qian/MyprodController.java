package com.xm.controller.qian;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Comment;
import com.xm.entity.Orders;
import com.xm.entity.OrdersDetail;
import com.xm.entity.User;
import com.xm.service.CategoryService;
import com.xm.service.CommentService;
import com.xm.service.OrdersDetailService;
import com.xm.service.OrdersService;
import com.xm.service.UserService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/MyprodController")
public class MyprodController {
	
	@Autowired
	CategoryService CategoryService;//类别service
	@Autowired
	OrdersDetailService ordersDetailService;
	@Autowired
	OrdersService ordersService;
	@Autowired
	CommentService commentService;
	@Autowired
	UserService userService;
	@RequestMapping("/AllComments")
	public String AllComments(Model model,int uid) {
		List<User> user=userService.getuserid(uid);
		List<OrdersDetail> com=ordersDetailService.quanchaOrdersDetail(uid);
		model.addAttribute("com", com);
		model.addAttribute("user", user);
		return "myprod";
		
	}
	@RequestMapping("/updateOrderss")
	@ResponseBody
	public Result updateOrderss(Orders orders) {
		Result r;
		int i=ordersService.updateOrderss(orders);
		if(i>=0) {
			r=new Result(0, "修改成功");
		}else {
			r=new Result(1, "修改失败");
		}
		return r;
	}
	@RequestMapping("/AddComments")
	@ResponseBody
	public Result AddComments(Comment comment) {
		Result r;
			int i=commentService.AddComments(comment);
			if(i>=0) {
				r=new Result(0, "添加成功");
			}else {
				r=new Result(1, "添加失败");
			}
		return r;
	}
	@RequestMapping("/Comments")
	@ResponseBody
	public Result Comments(int pid) {
		Result r;
			List<Comment> i=commentService.Comments(pid);
			if(i.size()>=0) {
				r=new Result(0, "",i.size(),i);
			}else {
				r=new Result(1, "无数据");
			}
		return r;
	}
	@RequestMapping("/getcomment")
	@ResponseBody
	public Result getcomment(int uid) {
		Result r;
			List<OrdersDetail> i=ordersDetailService.quanchaOrdersDetail(uid);
			if(i.size()>=0) {
				r=new Result(0, "",i.size(),i);
			}else {
				r=new Result(1, "无数据");
			}
		return r;
	}
}
