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
	/**
	 * 商品类型
	 */
	@Autowired
	CategoryService CategoryService;//类别service
	/**
	 * 订单详细
	 */
	@Autowired
	OrdersDetailService ordersDetailService;
	/**
	 * 订单
	 */
	@Autowired
	OrdersService ordersService;
	/**商品评价
	 * 
	 */
	@Autowired
	CommentService commentService;
	/**
	 * 用户
	 */
	@Autowired
	UserService userService;
	/**
	 * 存用户/订单详细数据进入评论页面
	 * @param model
	 * @param uid
	 * @return
	 */
	@RequestMapping("/AllComments")
	public String AllComments(Model model,int uid) {
		List<OrdersDetail> coms=ordersDetailService.quanchaOrdersDetails(uid);
		model.addAttribute("coms", coms);
		return "myprod";
		
	}
	@RequestMapping("/AllCommentss")
	public String AllComments(Model model,int uid,int orderid) {
		List<OrdersDetail> com=ordersDetailService.quanchaOrdersDetail(uid,orderid);
		List<OrdersDetail> coms=ordersDetailService.quanchaOrdersDetails(uid);
		model.addAttribute("com", com);
		model.addAttribute("coms", coms);
		return "myprod";
		
	}
	/**
	 * 修改订单状态5带评论
	 * @param orders
	 * @return
	 */
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
	/**
	 * 商品评论添加
	 * @param comment
	 * @return
	 */
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
	/**
	 * 查询商品评论倒序
	 * @param pid
	 * @return
	 */
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
	/**
	 *订单详细按用户id查
	 * @param uid
	 * @return
	 */
	@RequestMapping("/getcomment")
	@ResponseBody
	public Result getcomment(int uid,int orderid) {
		Result r;
			List<OrdersDetail> i=ordersDetailService.quanchaOrdersDetail(uid,orderid);
			if(i.size()>=0) {
				r=new Result(0, "",i.size(),i);
			}else {
				r=new Result(1, "无数据");
			}
		return r;
	}
}
