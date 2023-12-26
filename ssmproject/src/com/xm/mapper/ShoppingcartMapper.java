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
	/**
	 * 全查
	 * @return
	 */
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
	/**
	 * 根据ids多删
	 * @return
	 */
	int deleteAllShoppingcart (@Param("ids")String ids);
	/**
	 * 根据商品id和规格id还有用户id全查
	 * @return
	 */
	List<Shoppingcart> getpsid(Shoppingcart shopp);
	/**
	 * 根据购物车id修改
	 * @return
	 */
	int updatesho(Shoppingcart shoppingcart);
	/**
	 * 前台根据pid和sid获取所有数据
	 * @param shopp
	 * @return
	 */
	List<Shoppingcart> getshisid(Shoppingcart shopp);

}

