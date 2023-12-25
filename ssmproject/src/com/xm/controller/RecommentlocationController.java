package com.xm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Recomment;
import com.xm.entity.Recommentlocation;
import com.xm.entity.RecommentlocationVo;
import com.xm.service.RecommentService;
import com.xm.service.RecommentlocationService;
import com.xm.utils.Result;
@Controller
@RequestMapping("/RecommentlocationController")
public class RecommentlocationController {
	

		@Autowired
		RecommentlocationService recommentlocationService;
		@Autowired
		RecommentService RecommentService;
		/**
		 * 多条件查
		 * @param spvo
		 * @return
		 */
		@RequestMapping("/findByPage")
		@ResponseBody
		public Result findByPage(RecommentlocationVo recommvo) {
			List<Recommentlocation> speci=recommentlocationService.findByPage(recommvo);
			recommvo.setPage(null);
			recommvo.setLimit(null);
			List<Recommentlocation> all=recommentlocationService.findByPage(recommvo);
			Result r;
			if(speci!=null) {
				r=new Result(0, "", all.size(), speci);
			}else {
				r=new Result(1, "无数据");
			}
			return r;
		}
		/**
		 * 添加
		 * @param product
		 * @return
		 */
		@RequestMapping("/insertRecommentlocation")
		@ResponseBody
		public Result insertRecommentlocation(Recommentlocation recomm) {
			Result r;
			List<Recommentlocation>getrec=recommentlocationService.getname(recomm);
			if(getrec.size()>0) {
				r=new Result(1, "不能添加同名的位置");
			}else {
				int tj=recommentlocationService.insertRecommentlocation(recomm);
				if(tj>0) {
					r=new Result(0, "添加成功");
				}else {
					r=new Result(1, "添加失败");
				}
			}
			return r;
		}
		
		/**
		 * 修改
		 * @param product
		 * @return
		 */
		@RequestMapping("/updateRecommentlocation")
		@ResponseBody
		public Result updateRecommentlocation(Recommentlocation recomm) {
			int tj=recommentlocationService.updateRecommentlocation(recomm);
			Result r;
			if(tj>0) {
				r=new Result(0, "修改成功");
			}else {
				r=new Result(1, "修改失败");
			}
			return r;
		}
		/**
		 * 删除
		 * @parsam locid
		 * @return
		 */
		@RequestMapping("/deleteById")
		@ResponseBody
		public Result deleteById(int locid) {
			List<Recomment>reco=RecommentService.findall(locid);
			System.out.println(locid);
			Result r;
			if(reco.size()>0) {
				r=new Result(1, "该类型已被引用");
			}else {
				int tj=recommentlocationService.deleteById(locid);
				if(tj>0) {
					r=new Result(0, "删除成功");
				}else {
					r=new Result(1, "删除失败");
				}
			}	
			return r;
		}
		@RequestMapping("/getrec")
		@ResponseBody
		public List<Recommentlocation> getrec() {
			List<Recommentlocation>getreco=recommentlocationService.getrec();
			return getreco;
		}
}
