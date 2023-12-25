package com.xm.entity;

public class Recommentvo {
	private Integer locid;
	private Integer page;
	private Integer limit;
	public Recommentvo(Integer locid, Integer page, Integer limit) {
		super();
		this.locid = locid;
		this.page = page;
		this.limit = limit;
	}
	public Recommentvo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getLocid() {
		return locid;
	}
	public void setLocid(Integer locid) {
		this.locid = locid;
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
		return "Recommentvo [locid=" + locid + ", page=" + page + ", limit=" + limit + "]";
	}
	
	
}
