package com.xm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xm.entity.Recomment;
import com.xm.entity.Recommentvo;
import com.xm.service.RecommentService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/recomment")
public class RecommentController {
	@Autowired
	RecommentService recommentService;//�����Ƽ���service
	/**
	 * ��������
	 * @param
	 * @return
	 */
	@RequestMapping("/findbyRecommentpage")
	@ResponseBody
	public Result findbyRecommentpage(Recommentvo recommentvo) {
		List<Recomment> rec=recommentService.findbyRecommentpage(recommentvo);
		recommentvo.setPage(null);
		recommentvo.setLimit(null);
		List<Recomment> all=recommentService.findbyRecommentpage(recommentvo);
		Result r;
		if (rec!=null) {
			r=new Result(0,"",all.size(),rec);
		} else {
			r=new Result(1,"������");

		}
		return r;
		}
		/**
		* ���
		* @param
		* @return
		*/
		@RequestMapping("/insertRecomment")
		@ResponseBody
		public Result insertProduct(Recomment recomment) {
			Result r;
			//������Ʒid���Ƽ�λ��id���Ƿ���ֵ
			List<Recomment>getrec=recommentService.getname(recomment);
			if(getrec.size()>0) {
				r=new Result(1, "�����Ƽ�ͬ��Ʒ��ͬ�Ƽ�λ��");
			}else {
				int jg=recommentService.insertRecomment(recomment);
				if(jg>0) {
					r=new Result(0, "�Ƽ��ɹ�");
				}else {
					r=new Result(1, "�Ƽ�ʧ��");
				}
			}
			return r;
		}
		/**
		 * �����Ƽ�id�޸�
		 * @param
		 * @return
		 */
		@RequestMapping("/updateRecomment")
		@ResponseBody
		public Result updateRecomment(Recomment recomment) {
			//�����Ƽ�λ��id���Ƿ���ֵ
			List<Recomment>listrec=recommentService.findall(recomment.getLocid());
			Result r;
			if(listrec.size()>0) {
				r=new Result(1, "�ù�����д���Ʒ");
			}else {
				int jg=recommentService.updateRecomment(recomment);
				if(jg>0) {
					r=new Result(0, "�޸ĳɹ�");
				}else {
					r=new Result(1, "�޸�ʧ��");
				}
			}
			return r;
		}
		/**
		 * �����Ƽ�idɾ��
		 * @param
		 * @return
		 */
		@RequestMapping("/deleteRecomment")
		@ResponseBody
		public Result deleteProduct(int id) {
			int jg=recommentService.deleteRecomment(id);
			Result r;
			if(jg>0) {
				r=new Result(0, "ɾ���ɹ�");
			}else {
				r=new Result(1, "ɾ��ʧ��");
			}
			return r;
		}
		/**
		 * �����Ƽ�λ��id��
		 * @param
		 * @return
		 */
		@RequestMapping("/findall")
		@ResponseBody
		public Result findall(int locid) {
			List<Recomment> rec=recommentService.findall(locid);
			Result r;
			if (rec!=null) {
				r=new Result(0,"",rec.size(),rec);
			} else {
				r=new Result(1,"������");

			}
			return r;
			}
}
