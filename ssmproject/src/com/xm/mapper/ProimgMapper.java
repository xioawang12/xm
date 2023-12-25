package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Proimg;

public interface ProimgMapper {
	/**
	 * 全查
	 * @return
	 */
	public List<Proimg>findall(Proimg img);
	/**
	 * 添加
	 * @return
	 */
	public int insertimg(Proimg img);
	/**
	 * 查询pid
	 * @return
	 */
	public List<Proimg>getpid(@Param("pid")int pid);
	/**
	 * 修改
	 * @param img
	 * @return
	 */
	public int updateimg(Proimg img);
	
	public int deleteimg(@Param("imgid")int imgid);
}
