package com.xm.entity;

public class RecommentlocationVo {
	private String location;
	private Integer  page;
	private Integer limit;
	public RecommentlocationVo(String location, Integer page, Integer limit) {
		super();
		this.location = location;
		this.page = page;
		this.limit = limit;
	}
	public RecommentlocationVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
		return "RecommentlocationVo [location=" + location + ", page=" + page + ", limit=" + limit + "]";
	}
	
	
	
}
