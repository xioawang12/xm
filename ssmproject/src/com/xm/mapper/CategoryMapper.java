package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Category;


public interface CategoryMapper {
	/**
	 * 全查
	 * @return
	 */
	public List<Category>gettype();
	/**
	 * 查询副id是0的所有数据
	 * @return
	 */
	public List<Category>oneall();
	/**
	 * 分页查
	 * @param cat
	 * @return
	 */
	public List<Category>findall(Category cat);
	/**
	 * 添加
	 * @param cat
	 * @return
	 */
	public int inserttype(Category cat);
	/**
	 * 修改
	 * @param cat
	 * @return
	 */
	public int updatetype(Category cat);
	/**
	 * 删除
	 * @param cat
	 * @return
	 */
	public int deletetype(@Param("cateid")int cateid);
	/**
	 * 验证重名
	 * @return
	 */
	public List<Category>getname(Category cat);
	/**
	 * 前台商品类型全查前5
	 * @return
	 */
	public List<Category> getQianW();
	
}
