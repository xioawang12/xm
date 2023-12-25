package com.xm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Shoppingcart;

public interface ShoppingcartService {
	List<Shoppingcart> findShoppingcart(int uid);
	List<Shoppingcart> findAll();
	int insertShoppingcart (Shoppingcart shoppingcart);
	int deleteShoppingcart (int id);
	int deleteAllShoppingcart (@Param("ids")String ids);
	List<Shoppingcart> getpsid(Shoppingcart shopp);
	int updatesho(Shoppingcart shoppingcart);
	
	List<Shoppingcart> getshisid(Shoppingcart shopp);
}

