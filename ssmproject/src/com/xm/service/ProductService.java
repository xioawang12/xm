package com.xm.service;

import java.util.List;

import com.xm.entity.Product;
import com.xm.entity.ProductVo;

public interface ProductService {
	public List<Product>findall(ProductVo provo);
	
	public int insertpro(Product pro);
	
	public int updatepro(Product pro);
	
	public int deletepro(int pid);
	
	public int deleteById(String ids);
	
	public List<Product>getpro();
	
	public List<Product>getcateid(int cateid);
	
	public int shangjia(Product pro);
	
	public int xiajia(Product pro);
	
	public int pishang(String ids);
	
	public int pixia(String ids);
	
	public List<Product>getname(Product pro);
	
	public List<Product>getQtaipro();
	
	public List<Product> getLeiShang(int cateid);
	
	public List<Product> getDetail(int pid);
	
	public List<Product> getprospec(int pid);
	
	public List<Product> getcate(String ids);
	
	public List<Product> getpname(String pname);
	

}
