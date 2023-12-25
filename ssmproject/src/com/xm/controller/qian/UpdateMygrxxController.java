package com.xm.controller.qian;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.service.UserService;
import com.xm.utils.DateUtils;
import com.xm.utils.Result;

@Controller
@RequestMapping("/UpdateMygrxxController")
public class UpdateMygrxxController {
	@Autowired
	UserService userService;
	@RequestMapping("/updateUser")
	@ResponseBody
	public Result updateUser(@Param("ubirthday")String ubirthday,@Param("usex")String usex,@Param("uid")int uid) {
		Date date=DateUtils.stringToDate(ubirthday);
		int i=userService.updateUser(date,usex,uid);
		
		Result r;
		if (i>0) {
			r=new Result(0, "修改成功");
		}else {
			r=new Result(1, "修改失败");
		}
		
		return r;
	}
	@RequestMapping("/updateUimg")
	@ResponseBody
	public Result updateUimg( String uimg,int uid) {
		//Date date=DateUtils.stringToDate(ubirthday);
		int i=userService.updateUimg(uimg,uid);
		
		Result r;
		if (i>0) {
			r=new Result(0, "修改成功");
		}else {
			r=new Result(1, "修改失败");
		}
		
		return r;
	}
}
