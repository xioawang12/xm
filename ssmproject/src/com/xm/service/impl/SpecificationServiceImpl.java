package com.xm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.Specification;
import com.xm.entity.SpecificationVo;
import com.xm.mapper.SpecificationMapper;
import com.xm.service.SpecificationService;
@Service
public class SpecificationServiceImpl implements SpecificationService {
	@Autowired
	SpecificationMapper sper;
	@Override
	public List<Specification> findByPage(SpecificationVo spvo) {
		// TODO Auto-generated method stub
		return sper.findByPage(spvo);
	}
	@Override
	public int insertSpecification(Specification speci) {
		// TODO Auto-generated method stub
		return sper.insertSpecification(speci);
	}
	@Override
	public int updateSpecification(Specification speci) {
		// TODO Auto-generated method stub
		return sper.updateSpecification(speci);
	}
	@Override
	public int deleteById(int pid) {
		// TODO Auto-generated method stub
		return sper.deleteById(pid);
	}
	@Override
	public int deleteByIds(String ids) {
		// TODO Auto-generated method stub
		return sper.deleteByIds(ids);
	}
	@Override
	public List<Specification> getspec(int pid) {
		// TODO Auto-generated method stub
		return sper.getspec(pid);
	}
	@Override
	public List<Specification> getname(Specification speci) {
		// TODO Auto-generated method stub
		return sper.getname(speci);
	}
	@Override
	public int upsstock(Specification speci) {
		// TODO Auto-generated method stub
		return sper.upsstock(speci);
	}



}
