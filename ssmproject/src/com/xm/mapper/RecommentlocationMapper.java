package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Recommentlocation;
import com.xm.entity.RecommentlocationVo;

public interface RecommentlocationMapper {
	/**
	 * ������
	 * @param recommvo
	 * @return
	 */
List<Recommentlocation> findByPage(RecommentlocationVo recommvo);
/**
 * ���
 * @param speci
 * @return
 */
int insertRecommentlocation(Recommentlocation recomm);
/**
 * �޸�
 * @param speci
 * @return
 */
int updateRecommentlocation(Recommentlocation recomm);
/**
 * ɾ��
 * @param locid
 * @return
 */
int deleteById(@Param("locid")int locid);
/**
 * ȫ��
 * @return
 */
List<Recommentlocation>getrec();
/**
 * ��������ȫ��
 * @param recomm
 * @return
 */
List<Recommentlocation>getname(Recommentlocation recomm);
}
