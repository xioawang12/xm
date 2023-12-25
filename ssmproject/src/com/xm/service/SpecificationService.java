package com.xm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Specification;
import com.xm.entity.SpecificationVo;

public interface SpecificationService {
	/**
	 * 多条件查
	 * @param spvo
	 * @return
	 */
	List<Specification> findByPage(SpecificationVo spvo);
	/**
	 * 添加
	 * @param speci
	 * @return
	 */
	int insertSpecification(Specification speci);
	/**
	 * 修改
	 * @param speci
	 * @return
	 */
	int updateSpecification(Specification speci);
	/**
	 * 删除
	 * @param pid
	 * @return
	 */
	int deleteById(int pid);
	/**
	 * 多删
	 * @param ids
	 * @return
	 */
	int deleteByIds(@Param("ids")String ids);
	
	List<Specification> getspec(int pid);
	
	List<Specification>getname(Specification speci);
	
	int upsstock(Specification speci);
	


}
