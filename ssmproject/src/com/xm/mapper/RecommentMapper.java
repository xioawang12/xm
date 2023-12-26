package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Recomment;
import com.xm.entity.Recommentvo;



public interface RecommentMapper {
	/**
	 * ��������
	 * @param locid
	 * @return
	 */
	List<Recomment> findbyRecommentpage(Recommentvo recommentvo);
	/**
	 * ���
	 * @param locid
	 * @return
	 */
	int insertRecomment(Recomment recomment);
	/**
	 * �����Ƽ�id�޸�
	 * @param locid
	 * @return
	 */
	int updateRecomment(Recomment recomment);
	/**
	 * �����Ƽ�idɾ��
	 * @param locid
	 * @return
	 */
	int deleteRecomment(@Param("id")int id);
	/**
	 * �����Ƽ�λ��idȫ��
	 * @param locid
	 * @return
	 */
	List<Recomment>findall(@Param("locid")int locid);
	/**
	 * ������Ʒid���Ƽ�λ��idȫ��
	 * @param locid
	 * @return
	 */
	List<Recomment>getname(Recomment recomment);
	
	/**
	 * ������Ʒ�ϼܺ��Ƽ�λ��idȫ��
	 * @param locid
	 * @return
	 */
	List<Recomment> QianReco(int locid);
	/**
	 * ������Ʒ�ϼ�ȫ��
	 * @param locid
	 * @return
	 */
	List<Recomment> QianRecos();
	

}
