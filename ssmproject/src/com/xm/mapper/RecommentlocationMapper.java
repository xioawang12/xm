package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Recommentlocation;
import com.xm.entity.RecommentlocationVo;

public interface RecommentlocationMapper {
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
/**
 * 删除
 * @param locid
 * @return
 */
int deleteById(@Param("locid")int locid);
/**
 * 全查
 * @return
 */
List<Recommentlocation>getrec();
/**
 * 根据名字全查
 * @param recomm
 * @return
 */
List<Recommentlocation>getname(Recommentlocation recomm);
}
