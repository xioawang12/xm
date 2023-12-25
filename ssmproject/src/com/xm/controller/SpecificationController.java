package com.xm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Product;
import com.xm.entity.Specification;
import com.xm.entity.SpecificationVo;
import com.xm.service.ProductService;
import com.xm.service.SpecificationService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/SpecificationController")
public class SpecificationController {
	@Autowired
	SpecificationService speservice;
	@Autowired
	ProductService productService;
	/**
	 * ��������
	 * @param spvo
	 * @return
	 */
	@RequestMapping("/findByPage")
	@ResponseBody
	public Result findByPage(SpecificationVo spvo) {
		List<Specification> speci=speservice.findByPage(spvo);
		spvo.setPage(null);
		spvo.setLimit(null);
		List<Specification> all=speservice.findByPage(spvo);
		Result r;
		if(speci!=null) {
			r=new Result(0, "", all.size(), speci);
		}else {
			r=new Result(1, "������");
		}
		return r;
	}
	/**
	 * ���
	 * @param speci
	 * @return
	 */
	@RequestMapping("/insertSpecification")
	@ResponseBody
	public Result insertSpecification(Specification speci) {
		Result r;
		List<Specification>getspec=speservice.getname(speci);
		if(getspec.size()>0) {
			r=new Result(1, "������ͬ��Ʒ�����ͬ���ֵĹ��");
		}else {
			int tj=speservice.insertSpecification(speci);
			if(tj>0) {
				r=new Result(0, "��ӳɹ�");
			}else {
				r=new Result(1, "���ʧ��");
			}
		}
		return r;
	}
	
	/**
	 * �޸�
	 * @param speci
	 * @return
	 */
	@RequestMapping("/updateSpecification")
	@ResponseBody
	public Result updateSpecification(Specification speci) {
		int tj=speservice.updateSpecification(speci);
		Result r;
		if(tj>0) {
			r=new Result(0, "�޸ĳɹ�");
		}else {
			r=new Result(1, "�޸�ʧ��");
		}
		return r;
	}
	/**
	 * ɾ��
	 * @parsam pid
	 * @return
	 */
	@RequestMapping("/deleteById")
	@ResponseBody
	public Result deleteById(int pid) {
		int tj=speservice.deleteById(pid);
		Result r;
			if(tj>0) {
				r=new Result(0, "ɾ���ɹ�");
			}else {
				r=new Result(1, "ɾ��ʧ��");
			}
		
		return r;
	}
	/**
	 * ���ɾ��
	 * @param ids
	 * @return
	 */
	@RequestMapping("/deleteByIds")
	@ResponseBody
	public Result deleteByIds(String ids) {
		int tj=speservice.deleteByIds(ids);
		Result r;
		if(tj>0) {
			r=new Result(0, "ɾ���ɹ�");
		}else {
			r=new Result(1, "ɾ��ʧ��");
		}
		return r;
	}
}
