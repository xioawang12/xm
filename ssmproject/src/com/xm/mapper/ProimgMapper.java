package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Proimg;

public interface ProimgMapper {
	/**
	 * ȫ��
	 * @return
	 */
	public List<Proimg>findall(Proimg img);
	/**
	 * ���
	 * @return
	 */
	public int insertimg(Proimg img);
	/**
	 * ��ѯpid
	 * @return
	 */
	public List<Proimg>getpid(@Param("pid")int pid);
	/**
	 * �޸�
	 * @param img
	 * @return
	 */
	public int updateimg(Proimg img);
	
	public int deleteimg(@Param("imgid")int imgid);
}
