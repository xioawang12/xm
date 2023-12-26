package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Recomment;
import com.xm.entity.Recommentvo;



public interface RecommentMapper {
	/**
	 * 多条件查
	 * @param locid
	 * @return
	 */
	List<Recomment> findbyRecommentpage(Recommentvo recommentvo);
	/**
	 * 添加
	 * @param locid
	 * @return
	 */
	int insertRecomment(Recomment recomment);
	/**
	 * 根据推荐id修改
	 * @param locid
	 * @return
	 */
	int updateRecomment(Recomment recomment);
	/**
	 * 根据推荐id删除
	 * @param locid
	 * @return
	 */
	int deleteRecomment(@Param("id")int id);
	/**
	 * 根据推荐位置id全查
	 * @param locid
	 * @return
	 */
	List<Recomment>findall(@Param("locid")int locid);
	/**
	 * 根据商品id和推荐位置id全查
	 * @param locid
	 * @return
	 */
	List<Recomment>getname(Recomment recomment);
	
	/**
	 * 根据商品上架和推荐位置id全查
	 * @param locid
	 * @return
	 */
	List<Recomment> QianReco(int locid);
	/**
	 * 根据商品上架全查
	 * @param locid
	 * @return
	 */
	List<Recomment> QianRecos();
	

}
