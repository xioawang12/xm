package com.xm.service;

import java.util.List;



import com.xm.entity.Recomment;
import com.xm.entity.Recommentvo;

public interface RecommentService {
	List<Recomment> findbyRecommentpage(Recommentvo recommentvo);
	int insertRecomment(Recomment recomment);
	int updateRecomment(Recomment recomment);
	int deleteRecomment(int id);
	List<Recomment>findall(Recomment recomment);
	
	List<Recomment>getname(Recomment recomment);
	
	/**
	 * ǰ̨��ҳͼƬ
	 * @return
	 */
	List<Recomment> QianReco(int locid);
	
	/**
	 * ǰ̨��ҳͼƬ
	 * @return
	 */
	List<Recomment> QianRecos();
}
