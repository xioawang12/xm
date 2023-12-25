package com.xm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Recommentlocation;
import com.xm.entity.RecommentlocationVo;

public interface RecommentlocationService {
	/**
	 * 多条件
	 * @param recommvo
	 * @return
	 */
List<Recommentlocation> findByPage(RecommentlocationVo recommvo);
/**
 * 添加
 * @param speci
 * @return
 */
int insertRecommentlocation(Recommentlocation recomm);
/**
 * 修改
 * @param speci
 * @return
 */
int updateRecommentlocation(Recommentlocation recomm);

int deleteById(int locid);

List<Recommentlocation>getrec();

List<Recommentlocation>getname(Recommentlocation recomm);
}
