package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Recomment;
import com.xm.entity.Recommentvo;



public interface RecommentMapper {
	List<Recomment> findbyRecommentpage(Recommentvo recommentvo);
	int insertRecomment(Recomment recomment);
	int updateRecomment(Recomment recomment);
	int deleteRecomment(@Param("id")int id);
	List<Recomment>findall(@Param("locid")int locid);
	
	List<Recomment>getname(Recomment recomment);
	
	/**
	 * 
	 * @param locid
	 * @return
	 */
	List<Recomment> QianReco(int locid);
	/**
	 * 
	 * @param locid
	 * @return
	 */
	List<Recomment> QianRecos();
	

}
