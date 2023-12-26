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
	RecommentService recommentService;//调用推荐的service
	/**
	 * 多条件查
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
			r=new Result(1,"无数据");

		}
		return r;
		}
		/**
		* 添加
		* @param
		* @return
		*/
		@RequestMapping("/insertRecomment")
		@ResponseBody
		public Result insertProduct(Recomment recomment) {
			Result r;
			//根据商品id和推荐位置id查是否有值
			List<Recomment>getrec=recommentService.getname(recomment);
			if(getrec.size()>0) {
				r=new Result(1, "不能推荐同商品在同推荐位置");
			}else {
				int jg=recommentService.insertRecomment(recomment);
				if(jg>0) {
					r=new Result(0, "推荐成功");
				}else {
					r=new Result(1, "推荐失败");
				}
			}
			return r;
		}
		/**
		 * 根据推荐id修改
		 * @param
		 * @return
		 */
		@RequestMapping("/updateRecomment")
		@ResponseBody
		public Result updateRecomment(Recomment recomment) {
			//根据推荐位置id查是否有值
			List<Recomment>listrec=recommentService.findall(recomment.getLocid());
			Result r;
			if(listrec.size()>0) {
				r=new Result(1, "该规格已有此商品");
			}else {
				int jg=recommentService.updateRecomment(recomment);
				if(jg>0) {
					r=new Result(0, "修改成功");
				}else {
					r=new Result(1, "修改失败");
				}
			}
			return r;
		}
		/**
		 * 根据推荐id删除
		 * @param
		 * @return
		 */
		@RequestMapping("/deleteRecomment")
		@ResponseBody
		public Result deleteProduct(int id) {
			int jg=recommentService.deleteRecomment(id);
			Result r;
			if(jg>0) {
				r=new Result(0, "删除成功");
			}else {
				r=new Result(1, "删除失败");
			}
			return r;
		}
		/**
		 * 根据推荐位置id查
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
				r=new Result(1,"无数据");

			}
			return r;
			}
}
