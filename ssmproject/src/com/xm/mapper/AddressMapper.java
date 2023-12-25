package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Address;
import com.xm.entity.Product;

public interface AddressMapper {
	/**
	 * 添加
	 * @param pro
	 * @return
	 */
	public int insertAddress(Address add);
	/**
	 * 按用户id全查
	 */
	public List<Address> getuserid(int uid);
	/**
	 * 按用户id全查
	 */
	public List<Address> getMo(int uid);
	/**
	 * 修改
	 * @param add
	 * @return
	 */
	public int updateAddress(Address add);
	/**
	 *默认1
	 * @param pro
	 * @return
	 */
	public int Morenyi(Address add);
	/**
	 * 默认
	 * @param pro
	 * @return
	 */
	public int Moren(Address add);
	/**
	 * 删除
	 * @param pro
	 * @return
	 */
	public int deleteAddress(@Param("adid")int adid);
	/**
	 * 修改
	 * @param adid
	 * @return
	 */
	public List<Address> danAddress(@Param("adid") int adid);
}

