package com.xm.mapper;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.User;

public interface UserMapper {
	/**
	 * �û����������¼
	 * @param user
	 * @return
	 */
	public User login(User user);
	/**
	 * �޸�ͼƬ�͵绰
	 * @param user
	 * @return
	 */
	public int upimg(User user);
	/**
	 * �޸�����
	 * @param user
	 * @return
	 */
	public int uppwd(User user);
	/**
	 * ǰ̨ע��
	 * @param user
	 * @return
	 */
	public int adduser(User user);
	/**
	 * ǰ̨ע��ͬ����֤
	 * @param uname
	 * @return
	 */
	public List<User>getuname(String uname);
	/**
	 * ���û�idȫ��
	 */
	public List<User> getuserid(int uid);
	/**
	 * ��id�޸�
	 */
	public int updateUser(@Param("ubirthday")Date ubirthday,@Param("usex")String usex,@Param("uid")int uid);

	/**
	 * ��id�޸�ͷ��
	 */
	public int updateUimg(@Param("uimg")String uimg,@Param("uid")int uid);
}
