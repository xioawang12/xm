package com.xm.entity;

public class SpecificationVo {
	private Integer pid;
	private String scolor;
	private Double minSoriginal;
	private Double maxSoriginal;
	private Integer  page;
	private Integer limit;
	public SpecificationVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpecificationVo(Integer pid, String scolor, Double minSoriginal, Double maxSoriginal, Integer page,
			Integer limit) {
		super();
		this.pid = pid;
		this.scolor = scolor;
		this.minSoriginal = minSoriginal;
		this.maxSoriginal = maxSoriginal;
		this.page = page;
		this.limit = limit;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getScolor() {
		return scolor;
	}
	public void setScolor(String scolor) {
		this.scolor = scolor;
	}
	public Double getMinSoriginal() {
		return minSoriginal;
	}
	public void setMinSoriginal(Double minSoriginal) {
		this.minSoriginal = minSoriginal;
	}
	public Double getMaxSoriginal() {
		return maxSoriginal;
	}
	public void setMaxSoriginal(Double maxSoriginal) {
		this.maxSoriginal = maxSoriginal;
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
		return "SpecificationVo [pid=" + pid + ", scolor=" + scolor + ", minSoriginal=" + minSoriginal
				+ ", maxSoriginal=" + maxSoriginal + ", page=" + page + ", limit=" + limit + "]";
	}
	
}
