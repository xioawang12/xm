package com.xm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.Recommentlocation;
import com.xm.entity.RecommentlocationVo;
import com.xm.mapper.RecommentlocationMapper;
import com.xm.service.RecommentlocationService;
@Service
public class RecommentlocationServiceImpl implements RecommentlocationService{
	@Autowired
	RecommentlocationMapper recommentmapper;
	@Override
	public List<Recommentlocation> findByPage(RecommentlocationVo recommvo) {
		// TODO Auto-generated method stub
		return recommentmapper.findByPage(recommvo);
	}
	@Override
	public int insertRecommentlocation(Recommentlocation recomm) {
		// TODO Auto-generated method stub
		return recommentmapper.insertRecommentlocation(recomm);
	}
	@Override
	public int updateRecommentlocation(Recommentlocation recomm) {
		// TODO Auto-generated method stub
		return recommentmapper.updateRecommentlocation(recomm);
	}
	@Override
	public int deleteById(int locid) {
		// TODO Auto-generated method stub
		return recommentmapper.deleteById(locid);
	}
	@Override
	public List<Recommentlocation> getrec() {
		// TODO Auto-generated method stub
		return recommentmapper.getrec();
	}
	@Override
	public List<Recommentlocation> getname(Recommentlocation recomm) {
		// TODO Auto-generated method stub
		return recommentmapper.getname(recomm);
	}

}
