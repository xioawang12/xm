package com.xm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.Address;
import com.xm.mapper.AddressMapper;
import com.xm.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressMapper AddressMapper;
	@Override
	public int insertAddress(Address add) {
		// TODO Auto-generated method stub
		return AddressMapper.insertAddress(add);
	}
	@Override
	public List<Address> getuserid(int uid) {
		// TODO Auto-generated method stub
		return AddressMapper.getuserid(uid);
	}
	@Override
	public int updateAddress(Address add) {
		// TODO Auto-generated method stub
		return AddressMapper.updateAddress(add);
	}
	@Override
	public int deleteAddress(int adid) {
		// TODO Auto-generated method stub
		return AddressMapper.deleteAddress(adid);
	}
	@Override
	public int Morenyi(Address add) {
		// TODO Auto-generated method stub
		return AddressMapper.Morenyi(add);
	}
	@Override
	public int Moren(Address add) {
		// TODO Auto-generated method stub
		return AddressMapper.Moren(add);
	}
	@Override
	public List<Address> getMo(int uid) {
		// TODO Auto-generated method stub
		return AddressMapper.getMo(uid);
	}
	@Override
	public List<Address> danAddress(int adid) {
		// TODO Auto-generated method stub
		return AddressMapper.danAddress(adid);
	}

}

