package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Category;


public interface CategoryMapper {
	/**
	 * ȫ��
	 * @return
	 */
	public List<Category>gettype();
	/**
	 * ��ѯ��id��0����������
	 * @return
	 */
	public List<Category>oneall();
	/**
	 * ��ҳ��
	 * @param cat
	 * @return
	 */
	public List<Category>findall(Category cat);
	/**
	 * ���
	 * @param cat
	 * @return
	 */
	public int inserttype(Category cat);
	/**
	 * �޸�
	 * @param cat
	 * @return
	 */
	public int updatetype(Category cat);
	/**
	 * ɾ��
	 * @param cat
	 * @return
	 */
	public int deletetype(@Param("cateid")int cateid);
	/**
	 * ��֤����
	 * @return
	 */
	public List<Category>getname(Category cat);
	/**
	 * ǰ̨��Ʒ����ȫ��ǰ5
	 * @return
	 */
	public List<Category> getQianW();
	
}
