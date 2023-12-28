package com.xm.entity;

public class ProductVo {
	private String pname;
	private Integer cateid;
	private Integer pstate;
	private Integer page;
	private Integer limit;
	public ProductVo(String pname, Integer cateid, Integer pstate, Integer page, Integer limit) {
		super();
		this.pname = pname;
		this.cateid = cateid;
		this.pstate = pstate;
		this.page = page;
		this.limit = limit;
	}
	
	public ProductVo(String pname, Integer cateid) {
		super();
		this.pname = pname;
		this.cateid = cateid;
	}

	public ProductVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getCateid() {
		return cateid;
	}
	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}
	public Integer getPstate() {
		return pstate;
	}
	public void setPstate(Integer pstate) {
		this.pstate = pstate;
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
		return "ProductVo [pname=" + pname + ", cateid=" + cateid + ", pstate=" + pstate + ", page=" + page + ", limit="
				+ limit + "]";
	}
	
}
