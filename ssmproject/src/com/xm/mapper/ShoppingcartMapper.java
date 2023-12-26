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
	/**
	 * ȫ��
	 * @return
	 */
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
	/**
	 * ����ids��ɾ
	 * @return
	 */
	int deleteAllShoppingcart (@Param("ids")String ids);
	/**
	 * ������Ʒid�͹��id�����û�idȫ��
	 * @return
	 */
	List<Shoppingcart> getpsid(Shoppingcart shopp);
	/**
	 * ���ݹ��ﳵid�޸�
	 * @return
	 */
	int updatesho(Shoppingcart shoppingcart);
	/**
	 * ǰ̨����pid��sid��ȡ��������
	 * @param shopp
	 * @return
	 */
	List<Shoppingcart> getshisid(Shoppingcart shopp);

}

