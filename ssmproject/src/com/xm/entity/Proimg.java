package com.xm.entity;

public class Proimg {
	private Integer imgid;
	private Integer pid;
	private Product product;
	private String imgurl;
	private Integer iweight;
	private Integer page;
	private Integer limit;
	public Proimg(Integer imgid, Integer pid, Product product, String imgurl, Integer iweight, Integer page,
			Integer limit) {
		super();
		this.imgid = imgid;
		this.pid = pid;
		this.product = product;
		this.imgurl = imgurl;
		this.iweight = iweight;
		this.page = page;
		this.limit = limit;
	}
	public Proimg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getImgid() {
		return imgid;
	}
	public void setImgid(Integer imgid) {
		this.imgid = imgid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Integer getIweight() {
		return iweight;
	}
	public void setIweight(Integer iweight) {
		this.iweight = iweight;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "Proimg [imgid=" + imgid + ", pid=" + pid + ", product=" + product + ", imgurl=" + imgurl + ", iweight="
				+ iweight + ", page=" + page + ", limit=" + limit + "]";
	}
	
	
}
