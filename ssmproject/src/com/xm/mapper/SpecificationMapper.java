package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Product;
import com.xm.entity.Specification;
import com.xm.entity.SpecificationVo;

public interface SpecificationMapper {
	/**
	 * ��������
	 * @param spvo
	 * @return
	 */
	List<Specification> findByPage(SpecificationVo spvo);
	/**
	 * ���
	 * @param speci
	 * @return
	 */
	int insertSpecification(Specification speci);
	/**
	 * �޸�
	 * @param speci
	 * @return
	 */
	int updateSpecification(Specification speci);
	/**
	 * ɾ��
	 * @param pid
	 * @return
	 */
	int deleteById(int pid);
	/**
	 * ��ɾ
	 * @param ids
	 * @return
	 */
	int deleteByIds(@Param("ids")String ids);
	/**
	 * ��idȫ��
	 * @param pid
	 * @return
	 */
	List<Specification> getspec(@Param("pid")int pid);
	/**
	 * ����name����Ʒȫ��
	 * @param speci
	 * @return
	 */
	List<Specification>getname(Specification speci);
	/**
	 * ��������
	 * @param speci
	 * @return
	 */
	int upsstock(Specification speci);

}
