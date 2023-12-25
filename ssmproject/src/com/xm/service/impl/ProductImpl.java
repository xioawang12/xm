package com.xm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.Product;
import com.xm.entity.ProductVo;
import com.xm.mapper.ProductMapper;
import com.xm.service.ProductService;
@Service
public class ProductImpl implements ProductService {
	@Autowired
	ProductMapper productmapper;
	@Override
	public List<Product> findall(ProductVo provo) {
		// TODO Auto-generated method stub
		return productmapper.findall(provo);
	}
	@Override
	public int insertpro(Product pro) {
		// TODO Auto-generated method stub
		return productmapper.insertpro(pro);
	}
	@Override
	public int updatepro(Product pro) {
		// TODO Auto-generated method stub
		return productmapper.updatepro(pro);
	}
	@Override
	public int deletepro(int pid) {
		// TODO Auto-generated method stub
		return productmapper.deletepro(pid);
	}
	@Override
	public int deleteById(String ids) {
		// TODO Auto-generated method stub
		return productmapper.deleteById(ids);
	}
	@Override
	public List<Product> getpro() {
		// TODO Auto-generated method stub
		return productmapper.getpro();
	}
	@Override
	public List<Product> getcateid(int cateid) {
		// TODO Auto-generated method stub
		return productmapper.getcateid(cateid);
	}
	@Override
	public int shangjia(Product pro) {
		// TODO Auto-generated method stub
		return productmapper.shangjia(pro);
	}
	@Override
	public int xiajia(Product pro) {
		// TODO Auto-generated method stub
		return productmapper.xiajia(pro);
	}
	@Override
	public int pishang(String ids) {
		// TODO Auto-generated method stub
		return productmapper.pishang(ids);
	}
	@Override
	public int pixia(String ids) {
		// TODO Auto-generated method stub
		return productmapper.pixia(ids);
	}
	@Override
	public List<Product> getname(Product pro) {
		// TODO Auto-generated method stub
		return productmapper.getname(pro);
	}
	@Override
	public List<Product> getQtaipro() {
		// TODO Auto-generated method stub
		return productmapper.getQtaipro();
	}
	@Override
	public List<Product> getLeiShang(int cateid) {
		// TODO Auto-generated method stub
		return productmapper.getLeiShang(cateid);
	}
	@Override
	public List<Product> getDetail(int pid) {
		// TODO Auto-generated method stub
		return productmapper.getDetail(pid);
	}
	@Override
	public List<Product> getprospec(int pid) {
		// TODO Auto-generated method stub
		return productmapper.getprospec(pid);
	}
	@Override
	public List<Product> getcate(String ids) {
		// TODO Auto-generated method stub
		return productmapper.getcate(ids);
	}


}
