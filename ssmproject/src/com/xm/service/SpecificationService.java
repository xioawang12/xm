package com.xm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Specification;
import com.xm.entity.SpecificationVo;

public interface SpecificationService {
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
	
	List<Specification> getspec(int pid);
	
	List<Specification>getname(Specification speci);
	
	int upsstock(Specification speci);
	


}
