package com.xm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.Proimg;
import com.xm.mapper.ProimgMapper;
import com.xm.service.ProimgService;
@Service
public class ProimgImpl implements ProimgService {
	@Autowired
	ProimgMapper proimgmapper;
	@Override
	public List<Proimg> findall(Proimg img) {
		// TODO Auto-generated method stub
		return proimgmapper.findall(img);
	}
	@Override
	public int insertimg(Proimg img) {
		// TODO Auto-generated method stub
		return proimgmapper.insertimg(img);
	}
	@Override
	public List<Proimg> getpid(int pid) {
		// TODO Auto-generated method stub
		return proimgmapper.getpid(pid);
	}
	@Override
	public int updateimg(Proimg img) {
		// TODO Auto-generated method stub
		return proimgmapper.updateimg(img);
	}
	@Override
	public int deleteimg(int imgid) {
		// TODO Auto-generated method stub
		return proimgmapper.deleteimg(imgid);
	}

}
