package com.xm.entity;

public class Category {
	private Integer cateid;
	private String  catename;
	private Integer parentid;
	private Integer page;
	private Integer limit;
	public Category(Integer cateid, String catename, Integer parentid, Integer page, Integer limit) {
		super();
		this.cateid = cateid;
		this.catename = catename;
		this.parentid = parentid;
		this.page = page;
		this.limit = limit;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCateid() {
		return cateid;
	}
	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
	public Integer getParentid() {
		return parentid;
	}
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
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
		return "Category [cateid=" + cateid + ", catename=" + catename + ", parentid=" + parentid + ", page=" + page
				+ ", limit=" + limit + "]";
	}
	
}
