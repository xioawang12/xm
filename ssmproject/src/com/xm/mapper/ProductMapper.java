package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Product;
import com.xm.entity.ProductVo;

public interface ProductMapper {
	/**
	 * ģ����
	 * @param provo
	 * @return
	 */
	public List<Product>findall(ProductVo provo);
	/**
	 * ���
	 * @param pro
	 * @return
	 */
	public int insertpro(Product pro);
	/**
	 * �޸�
	 * @param pro
	 * @return
	 */
	public int updatepro(Product pro);
	/**
	 * ɾ��
	 * @param pro
	 * @return
	 */
	public int deletepro(@Param("pid")int pid);
	/**
	 * ����ɾ
	 * @param ids
	 * @return
	 */
	public int deleteById(@Param("ids")String ids);
	/**
	 * ��Ʒȫ��
	 * @return
	 */
	public List<Product>getpro();
	/**
	 * ����id�����Ʒ
	 * @param cateid
	 * @return
	 */
	public List<Product>getcateid(@Param("cateid")int cateid);
	/**
	 * �ϼ�
	 * @param pro
	 * @return
	 */
	public int shangjia(Product pro);
	/**
	 * �¼�
	 * @param pro
	 * @return
	 */
	public int xiajia(Product pro);
	/**
	 * �����ϼ�
	 * @param ids
	 * @return
	 */
	public int pishang(@Param("ids")String ids);
	/**
	 * �����¼�
	 * @param ids
	 * @return
	 */
	public int pixia(@Param("ids")String ids);
	/**
	 * ����nameȫ��
	 * @param pro
	 * @return
	 */
	public List<Product>getname(Product pro);
	/**
	 * ǰ̨��Ʒȫ��ǰ5
	 * @return
	 */
	public List<Product> getQtaipro();
	
	/**
	 * ����Ʒ���Ͳ�
	 * @param cateid
	 * @return
	 */
	public List<Product> getLeiShang(int cateid);
	/**
	 * ��Ʒ���鰴idȫ��
	 * @return
	 */
	public List<Product> getDetail(int pid);
	/**
	 * ��Ʒidȫ��
	 * @return
	 */
	public List<Product> getprospec(int pid);
	/**
	 * ������㴫ֵ
	 * @param ids
	 * @return
	 */
	public List<Product> getcate(@Param("ids")String ids);
	/**
	 * ǰ̨����ģ����
	 * @param pname
	 * @return
	 */
	public List<Product> getpname(String pname);


}
