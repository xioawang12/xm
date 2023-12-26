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
	 * ��Ʒ����
	 */
	@Autowired
	CategoryService CategoryService;//���service
	/**
	 * ������ϸ
	 */
	@Autowired
	OrdersDetailService ordersDetailService;
	/**
	 * ����
	 */
	@Autowired
	OrdersService ordersService;
	/**��Ʒ����
	 * 
	 */
	@Autowired
	CommentService commentService;
	/**
	 * �û�
	 */
	@Autowired
	UserService userService;
	/**
	 * ���û�/������ϸ���ݽ�������ҳ��
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
	 * �޸Ķ���״̬5������
	 * @param orders
	 * @return
	 */
	@RequestMapping("/updateOrderss")
	@ResponseBody
	public Result updateOrderss(Orders orders) {
		Result r;
		int i=ordersService.updateOrderss(orders);
		if(i>=0) {
			r=new Result(0, "�޸ĳɹ�");
		}else {
			r=new Result(1, "�޸�ʧ��");
		}
		return r;
	}
	/**
	 * ��Ʒ�������
	 * @param comment
	 * @return
	 */
	@RequestMapping("/AddComments")
	@ResponseBody
	public Result AddComments(Comment comment) {
		Result r;
			int i=commentService.AddComments(comment);
			if(i>=0) {
				r=new Result(0, "��ӳɹ�");
			}else {
				r=new Result(1, "���ʧ��");
			}
		return r;
	}
	/**
	 * ��ѯ��Ʒ���۵���
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
				r=new Result(1, "������");
			}
		return r;
	}
	/**
	 *������ϸ���û�id��
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
				r=new Result(1, "������");
			}
		return r;
	}
}
