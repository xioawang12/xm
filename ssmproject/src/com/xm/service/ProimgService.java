package com.xm.service;

import java.util.List;

import com.xm.entity.Proimg;

public interface ProimgService {
	public List<Proimg>findall(Proimg img);
	
	public int insertimg(Proimg img);
	
	public List<Proimg>getpid(int pid);
	
	public int updateimg(Proimg img);
	
	public int deleteimg(int imgid);
}
