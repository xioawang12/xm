package com.xm.service;


import java.util.Date;
import java.util.List;

import com.xm.entity.User;

public interface UserService {
	public User login(User user);
	
	public int upimg(User user);
	
	public int uppwd(User user);
	
	public int adduser(User user);
	
	public List<User>getuname(String uname);
	
	public List<User> getuserid(int uid);
	
	public int updateUser(Date ubirthday,String usex,int uid);
	
	public int updateUimg(String uimg,int uid);
}
