package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.entity.Product;
import com.xm.entity.Specification;
import com.xm.entity.SpecificationVo;

public interface SpecificationMapper {
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
	/**
	 * 按id全查
	 * @param pid
	 * @return
	 */
	List<Specification> getspec(@Param("pid")int pid);
	/**
	 * 根据name和商品全查
	 * @param speci
	 * @return
	 */
	List<Specification>getname(Specification speci);
	/**
	 * 结算清库存
	 * @param speci
	 * @return
	 */
	int upsstock(Specification speci);

}
