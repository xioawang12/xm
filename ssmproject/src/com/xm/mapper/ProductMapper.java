package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Product;
import com.xm.entity.ProductVo;

public interface ProductMapper {
	/**
	 * 模糊查
	 * @param provo
	 * @return
	 */
	public List<Product>findall(ProductVo provo);
	/**
	 * 添加
	 * @param pro
	 * @return
	 */
	public int insertpro(Product pro);
	/**
	 * 修改
	 * @param pro
	 * @return
	 */
	public int updatepro(Product pro);
	/**
	 * 删除
	 * @param pro
	 * @return
	 */
	public int deletepro(@Param("pid")int pid);
	/**
	 * 批量删
	 * @param ids
	 * @return
	 */
	public int deleteById(@Param("ids")String ids);
	/**
	 * 商品全查
	 * @return
	 */
	public List<Product>getpro();
	/**
	 * 根据id查出商品
	 * @param cateid
	 * @return
	 */
	public List<Product>getcateid(@Param("cateid")int cateid);
	/**
	 * 上架
	 * @param pro
	 * @return
	 */
	public int shangjia(Product pro);
	/**
	 * 下架
	 * @param pro
	 * @return
	 */
	public int xiajia(Product pro);
	/**
	 * 批量上架
	 * @param ids
	 * @return
	 */
	public int pishang(@Param("ids")String ids);
	/**
	 * 批量下架
	 * @param ids
	 * @return
	 */
	public int pixia(@Param("ids")String ids);
	/**
	 * 根据name全查
	 * @param pro
	 * @return
	 */
	public List<Product>getname(Product pro);
	/**
	 * 前台商品全查前5
	 * @return
	 */
	public List<Product> getQtaipro();
	
	/**
	 * 以商品类型查
	 * @param cateid
	 * @return
	 */
	public List<Product> getLeiShang(int cateid);
	/**
	 * 商品详情按id全查
	 * @return
	 */
	public List<Product> getDetail(int pid);
	/**
	 * 商品id全查
	 * @return
	 */
	public List<Product> getprospec(int pid);
	/**
	 * 点击结算传值
	 * @param ids
	 * @return
	 */
	public List<Product> getcate(@Param("ids")String ids);
	/**
	 * 前台搜索模糊查
	 * @param pname
	 * @return
	 */
	public List<Product> getpname(String pname);


}
