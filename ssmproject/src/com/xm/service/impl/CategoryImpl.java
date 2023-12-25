package com.xm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.Category;
import com.xm.mapper.CategoryMapper;
import com.xm.service.CategoryService;
@Service
public class CategoryImpl implements CategoryService {
	@Autowired
	public CategoryMapper categorymapper;
	/**
	 * ȫ��
	 */
	@Override
	public List<Category> findall(Category cat) {
		// TODO Auto-generated method stub
		return categorymapper.findall(cat);
	}
	/**
	 * ���
	 */
	@Override
	public int inserttype(Category cat) {
		// TODO Auto-generated method stub
		return categorymapper.inserttype(cat);
	}
	/**
	 * ��ѯ��id��0����������
	 */
	@Override
	public List<Category> oneall() {
		// TODO Auto-generated method stub
		return categorymapper.oneall();
	}
	/**
	 * �޸�
	 */
	@Override
	public int updatetype(Category cat) {
		// TODO Auto-generated method stub
		return categorymapper.updatetype(cat);
	}
	/**
	 * ɾ��
	 */
	@Override
	public int deletetype(int cateid) {
		// TODO Auto-generated method stub
		return categorymapper.deletetype(cateid);
	}
	@Override
	public List<Category> gettype() {
		// TODO Auto-generated method stub
		return categorymapper.gettype();
	}
	@Override
	public List<Category> getname(Category cat) {
		// TODO Auto-generated method stub
		return categorymapper.getname(cat);
	}
	@Override
	public List<Category> getQianW() {
		// TODO Auto-generated method stub
		return categorymapper.getQianW();
	}

	

}
