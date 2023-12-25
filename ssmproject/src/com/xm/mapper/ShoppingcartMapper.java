package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Shoppingcart;

public interface ShoppingcartMapper {
	/**
	 * 前台查
	 * @return
	 */
	List<Shoppingcart> findShoppingcart(int uid);
	List<Shoppingcart> findAll();
	/**
	 * 添加
	 */
	int insertShoppingcart (Shoppingcart shoppingcart);
	/**
	 * 前台删除
	 * @param shopid
	 * @return
	 */
	int deleteShoppingcart (@Param("shopid")int shopid);
	int deleteAllShoppingcart (@Param("ids")String ids);
	List<Shoppingcart> getpsid(Shoppingcart shopp);
	int updatesho(Shoppingcart shoppingcart);
	/**
	 * 前台根据pid和sid获取所有数据
	 * @param shopp
	 * @return
	 */
	List<Shoppingcart> getshisid(Shoppingcart shopp);

}

