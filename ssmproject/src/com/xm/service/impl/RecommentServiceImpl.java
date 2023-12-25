package com.xm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.Recomment;
import com.xm.entity.Recommentvo;
import com.xm.mapper.RecommentMapper;
import com.xm.service.RecommentService;
@Service
public class RecommentServiceImpl implements RecommentService {
	@Autowired
	RecommentMapper RecommentMapper;
	@Override
	public List<Recomment> findbyRecommentpage(Recommentvo recommentvo) {
		// TODO Auto-generated method stub
		return RecommentMapper.findbyRecommentpage(recommentvo);
	}

	@Override
	public int insertRecomment(Recomment recomment) {
		// TODO Auto-generated method stub
		return RecommentMapper.insertRecomment(recomment);
	}

	@Override
	public int updateRecomment(Recomment recomment) {
		// TODO Auto-generated method stub
		return RecommentMapper.updateRecomment(recomment);
	}

	@Override
	public int deleteRecomment(int id) {
		// TODO Auto-generated method stub
		return RecommentMapper.deleteRecomment(id);
	}

	@Override
	public List<Recomment> findall(int locid) {
		// TODO Auto-generated method stub
		return RecommentMapper.findall(locid);
	}

	@Override
	public List<Recomment> getname(Recomment recomment) {
		// TODO Auto-generated method stub
		return RecommentMapper.getname(recomment);
	}

	@Override
	public List<Recomment> QianReco(int locid) {
		// TODO Auto-generated method stub
		return RecommentMapper.QianReco(locid);
	}

	@Override
	public List<Recomment> QianRecos() {
		// TODO Auto-generated method stub
		return RecommentMapper.QianRecos();
	}

}
