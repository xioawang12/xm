package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Address;
import com.xm.entity.Product;

public interface AddressMapper {
	/**
	 * ���
	 * @param pro
	 * @return
	 */
	public int insertAddress(Address add);
	/**
	 * ���û�idȫ��
	 */
	public List<Address> getuserid(int uid);
	/**
	 * ���û�idȫ��
	 */
	public List<Address> getMo(int uid);
	/**
	 * �޸�
	 * @param add
	 * @return
	 */
	public int updateAddress(Address add);
	/**
	 *Ĭ��1
	 * @param pro
	 * @return
	 */
	public int Morenyi(Address add);
	/**
	 * Ĭ��
	 * @param pro
	 * @return
	 */
	public int Moren(Address add);
	/**
	 * ɾ��
	 * @param pro
	 * @return
	 */
	public int deleteAddress(@Param("adid")int adid);
	/**
	 * �޸�
	 * @param adid
	 * @return
	 */
	public List<Address> danAddress(@Param("adid") int adid);
}

