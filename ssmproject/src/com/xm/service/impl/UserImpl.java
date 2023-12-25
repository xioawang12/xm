package com.xm.service.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.User;
import com.xm.mapper.UserMapper;
import com.xm.service.UserService;
@Service
public class UserImpl implements UserService {
	@Autowired
	UserMapper usermapper;
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return usermapper.login(user);
	}
	@Override
	public int upimg(User user) {
		// TODO Auto-generated method stub
		return usermapper.upimg(user);
	}
	@Override
	public int uppwd(User user) {
		// TODO Auto-generated method stub
		return usermapper.uppwd(user);
	}
	@Override
	public int adduser(User user) {
		// TODO Auto-generated method stub
		return usermapper.adduser(user);
	}
	@Override
	public List<User> getuname(String uname) {
		// TODO Auto-generated method stub
		return usermapper.getuname(uname);
	}
	@Override
	public List<User> getuserid(int uid) {
		// TODO Auto-generated method stub
		return usermapper.getuserid(uid);
	}
	@Override
	public int updateUser(Date ubirthday, String usex, int uid) {
		// TODO Auto-generated method stub
		return usermapper.updateUser(ubirthday, usex, uid);
	}
	@Override
	public int updateUimg(String uimg, int uid) {
		// TODO Auto-generated method stub
		return usermapper.updateUimg(uimg, uid);
	}

}
