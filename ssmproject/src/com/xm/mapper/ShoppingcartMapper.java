package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Shoppingcart;

public interface ShoppingcartMapper {
	/**
	 * ǰ̨��
	 * @return
	 */
	List<Shoppingcart> findShoppingcart(int uid);
	List<Shoppingcart> findAll();
	/**
	 * ���
	 */
	int insertShoppingcart (Shoppingcart shoppingcart);
	/**
	 * ǰ̨ɾ��
	 * @param shopid
	 * @return
	 */
	int deleteShoppingcart (@Param("shopid")int shopid);
	int deleteAllShoppingcart (@Param("ids")String ids);
	List<Shoppingcart> getpsid(Shoppingcart shopp);
	int updatesho(Shoppingcart shoppingcart);
	/**
	 * ǰ̨����pid��sid��ȡ��������
	 * @param shopp
	 * @return
	 */
	List<Shoppingcart> getshisid(Shoppingcart shopp);

}

