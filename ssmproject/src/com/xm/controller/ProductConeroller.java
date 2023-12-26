package com.xm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Product;
import com.xm.entity.ProductVo;
import com.xm.entity.Proimg;
import com.xm.entity.Specification;
import com.xm.service.ProductService;
import com.xm.service.ProimgService;
import com.xm.service.SpecificationService;
import com.xm.utils.Result;

@Controller
@RequestMapping("/product")
public class ProductConeroller {
	@Autowired
	ProductService productservice;//������Ʒ��service
	@Autowired
	ProimgService proimgservice;//������ƷͼƬ��service
	@Autowired
	SpecificationService specificationservice;//���ù���service
	/**
	 * ��������
	 * @param 
	 * @return
	 */
	@RequestMapping("/findall")
	@ResponseBody
	public Result findbypage(ProductVo provo) {
		Result r;
		List<Product>pro=productservice.findall(provo);
		provo.setPage(null);
		provo.setLimit(null);
		List<Product>all=productservice.findall(provo);
		if(pro!=null) {
			r=new Result(0, "", all.size(), pro);
		}else {
			r=new Result(1, "������");
		}
		return r;
	}
	/**
	 * ���
	 * @param 
	 * @return
	 */
	@RequestMapping("/insertpro")
	@ResponseBody
	public Result insertpro(Product pro) {
		Result r;
		//������Ʒ���ֲ��Ƿ���ֵ
		List<Product>getpro=productservice.getname(pro);
		if(getpro.size()>0) {
			r=new Result(1, "�������ͬ������Ʒ");
		}else {
			int i=productservice.insertpro(pro);
			if(i>=0) {
				r=new Result(0, "��ӳɹ�");
			}else {
				r=new Result(1, "���ʧ��");
			}
		}
		return r;
	}
	/**
	 * ��id�޸�
	 * @param 
	 * @return
	 */
	@RequestMapping("/updatepro")
	@ResponseBody
	public Result updatepro(Product pro) {
		Result r;
		int i=productservice.updatepro(pro);
		if(i>=0) {
			r=new Result(0, "�޸ĳɹ�");
		}else {
			r=new Result(1, "�޸�ʧ��");
		}
		return r;
	}
	/**
	 * ��idɾ��
	 * @param 
	 * @return
	 */
	@RequestMapping("/deletepro")
	@ResponseBody
	public Result deletepro(int pid) {
		Result r;
		//������Ʒid����ƷͼƬ�Ƿ���ֵ
		List<Proimg>imgid=proimgservice.getpid(pid);
		//������Ʒid�����Ƿ���ֵ
		List<Specification>spid=specificationservice.getspec(pid);
		if(imgid.size()>0||spid.size()>0) {
			r=new Result(1, "����Ʒ�ѱ�����");
		}else {
			int i=productservice.deletepro(pid);
			if(i>=0) {
				r=new Result(0, "ɾ���ɹ�");
			}else {
				r=new Result(1, "ɾ��ʧ��");
			}
		}
		
		return r;
	}
	/**
	 * ��ids��ɾ
	 * @param 
	 * @return
	 */
	@RequestMapping("/deleteById")
	@ResponseBody
	public Result deleteById(String ids) {
		Result r;
		int i=productservice.deleteById(ids);
		if(i>=0) {
			r=new Result(0, "ɾ���ɹ�");
		}else {
			r=new Result(1, "ɾ��ʧ��");
		}
		return r;
	}
	/**
	 * ȫ��
	 * @param 
	 * @return
	 */
	@RequestMapping("/getpro")
	@ResponseBody
	public List<Product> getpro() {
		return productservice.getpro();
	}
	/**
	 * ������Ʒid�ϼ�
	 * @param 
	 * @return
	 */
	@RequestMapping("/shangjia")
	@ResponseBody
	public Result shangjia(Product pro) {
		Result r;
		int i=productservice.shangjia(pro);
		if(i>=0) {
			r=new Result(0, "�ϼܳɹ�");
		}else {
			r=new Result(1, "�ϼ�ʧ��");
		}
		return r;
	}
	/**
	 * ������Ʒid�¼�
	 * @param 
	 * @return
	 */
	@RequestMapping("/xiajia")
	@ResponseBody
	public Result xiajia(Product pro) {
		Result r;
		int i=productservice.xiajia(pro);
		if(i>=0) {
			r=new Result(0, "�¼ܳɹ�");
		}else {
			r=new Result(1, "�¼�ʧ��");
		}
		return r;
	}
	/**
	 * ����ids�����ϼ�
	 * @param 
	 * @return
	 */
	@RequestMapping("/pishang")
	@ResponseBody
	public Result pishang(String ids) {
		Result r;
		int i=productservice.pishang(ids);
		if(i>=0) {
			r=new Result(0, "�ϼܳɹ�");
		}else {
			r=new Result(1, "�ϼ�ʧ��");
		}
		return r;
	}
	/**
	 * ����ids�����¼�
	 * @param 
	 * @return
	 */
	@RequestMapping("/pixia")
	@ResponseBody
	public Result pixia(String ids) {
		Result r;
		int i=productservice.pixia(ids);
		if(i>=0) {
			r=new Result(0, "�¼ܳɹ�");
		}else {
			r=new Result(1, "�¼�ʧ��");
		}
		return r;
	}
}
