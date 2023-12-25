package com.xm.mapper;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.User;

public interface UserMapper {
	/**
	 * 用户名加密码登录
	 * @param user
	 * @return
	 */
	public User login(User user);
	/**
	 * 修改图片和电话
	 * @param user
	 * @return
	 */
	public int upimg(User user);
	/**
	 * 修改密码
	 * @param user
	 * @return
	 */
	public int uppwd(User user);
	/**
	 * 前台注册
	 * @param user
	 * @return
	 */
	public int adduser(User user);
	/**
	 * 前台注册同名验证
	 * @param uname
	 * @return
	 */
	public List<User>getuname(String uname);
	/**
	 * 按用户id全查
	 */
	public List<User> getuserid(int uid);
	/**
	 * 按id修改
	 */
	public int updateUser(@Param("ubirthday")Date ubirthday,@Param("usex")String usex,@Param("uid")int uid);

	/**
	 * 按id修改头像
	 */
	public int updateUimg(@Param("uimg")String uimg,@Param("uid")int uid);
}
