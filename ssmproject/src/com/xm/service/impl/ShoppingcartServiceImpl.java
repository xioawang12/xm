package com.xm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.Shoppingcart;
import com.xm.mapper.ShoppingcartMapper;
import com.xm.service.ShoppingcartService;
@Service
public class ShoppingcartServiceImpl implements ShoppingcartService {
	
	@Autowired
	ShoppingcartMapper shoppingcartmapper;
	@Override
	public int insertShoppingcart(Shoppingcart shoppingcart) {
		// TODO Auto-generated method stub
		return shoppingcartmapper.insertShoppingcart(shoppingcart);
	}

	@Override
	public int deleteShoppingcart(int shopid) {
		// TODO Auto-generated method stub
		return shoppingcartmapper.deleteShoppingcart(shopid);
	}

	@Override
	public int deleteAllShoppingcart(String ids) {
		// TODO Auto-generated method stub
		return shoppingcartmapper.deleteAllShoppingcart(ids);
	}

	@Override
	public List<Shoppingcart> findShoppingcart(int uid) {
		// TODO Auto-generated method stub
		return shoppingcartmapper.findShoppingcart(uid);
	}

	@Override
	public List<Shoppingcart> findAll() {
		// TODO Auto-generated method stub
		return shoppingcartmapper.findAll();
	}

	@Override
	public List<Shoppingcart> getpsid(Shoppingcart shopp) {
		// TODO Auto-generated method stub
		return shoppingcartmapper.getpsid(shopp);
	}

	@Override
	public int updatesho(Shoppingcart shoppingcart) {
		// TODO Auto-generated method stub
		return shoppingcartmapper.updatesho(shoppingcart);
	}

	@Override
	public List<Shoppingcart> getshisid(Shoppingcart shopp) {
		// TODO Auto-generated method stub
		return shoppingcartmapper.getshisid(shopp);
	}

	

}
