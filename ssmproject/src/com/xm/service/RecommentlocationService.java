package com.xm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Recommentlocation;
import com.xm.entity.RecommentlocationVo;

public interface RecommentlocationService {
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

int deleteById(int locid);

List<Recommentlocation>getrec();

List<Recommentlocation>getname(Recommentlocation recomm);
}
