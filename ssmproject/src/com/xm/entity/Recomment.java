package com.xm.entity;

public class Recomment {
	private Integer recomid;
	private Integer pid;
	private Product product;
	private Integer locid;
	private Recommentlocation recommentlocation;
	private Integer rweight;
	private String recomcate;
	public Recomment(Integer recomid, Integer pid, Product product, Integer locid, Recommentlocation recommentlocation,
			Integer rweight, String recomcate) {
		super();
		this.recomid = recomid;
		this.pid = pid;
		this.product = product;
		this.locid = locid;
		this.recommentlocation = recommentlocation;
		this.rweight = rweight;
		this.recomcate = recomcate;
	}
	public Recomment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getRecomid() {
		return recomid;
	}
	public void setRecomid(Integer recomid) {
		this.recomid = recomid;
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
	public Integer getLocid() {
		return locid;
	}
	public void setLocid(Integer locid) {
		this.locid = locid;
	}
	public Recommentlocation getRecommentlocation() {
		return recommentlocation;
	}
	public void setRecommentlocation(Recommentlocation recommentlocation) {
		this.recommentlocation = recommentlocation;
	}
	public Integer getRweight() {
		return rweight;
	}
	public void setRweight(Integer rweight) {
		this.rweight = rweight;
	}
	public String getRecomcate() {
		return recomcate;
	}
	public void setRecomcate(String recomcate) {
		this.recomcate = recomcate;
	}
	@Override
	public String toString() {
		return "Recomment [recomid=" + recomid + ", pid=" + pid + ", product=" + product + ", locid=" + locid
				+ ", recommentlocation=" + recommentlocation + ", rweight=" + rweight + ", recomcate=" + recomcate
				+ "]";
	}
	
}
