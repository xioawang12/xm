package com.xm.service;

import java.util.List;


import com.xm.entity.Address;

public interface AddressService {
	public int insertAddress(Address add);
	
	public List<Address> getuserid(int uid);
	
	public int updateAddress(Address add);
	
	public int deleteAddress(int adid);
	
	public int Morenyi(Address add);
	
	public int Moren(Address add);
	
	public List<Address> getMo(int uid);
	
	public List<Address> danAddress(int adid);
}

