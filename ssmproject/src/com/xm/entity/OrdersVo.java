package com.xm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class OrdersVo {
	private String addphone;
	private String oroddnum;
	private String orderstate;
	private String orlogistics;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date maxubirthday;
	@DateTimeFormat(pattern= "yyyy-MM-dd")
	private Date minubirthday;
	private Integer page;
	private Integer limit;
	public String getAddphone() {
		return addphone;
	}
	public void setAddphone(String addphone) {
		this.addphone = addphone;
	}
	public String getOroddnum() {
		return oroddnum;
	}
	public void setOroddnum(String oroddnum) {
		this.oroddnum = oroddnum;
	}
	public String getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	public String getOrlogistics() {
		return orlogistics;
	}
	public void setOrlogistics(String orlogistics) {
		this.orlogistics = orlogistics;
	}
	public Date getMaxubirthday() {
		return maxubirthday;
	}
	public void setMaxubirthday(Date maxubirthday) {
		this.maxubirthday = maxubirthday;
	}
	public Date getMinubirthday() {
		return minubirthday;
	}
	public void setMinubirthday(Date minubirthday) {
		this.minubirthday = minubirthday;
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
	public OrdersVo(String addphone, String oroddnum, String orderstate, String orlogistics, Date maxubirthday,
			Date minubirthday, Integer page, Integer limit) {
		super();
		this.addphone = addphone;
		this.oroddnum = oroddnum;
		this.orderstate = orderstate;
		this.orlogistics = orlogistics;
		this.maxubirthday = maxubirthday;
		this.minubirthday = minubirthday;
		this.page = page;
		this.limit = limit;
	}
	public OrdersVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrdersVo [addphone=" + addphone + ", oroddnum=" + oroddnum + ", orderstate=" + orderstate
				+ ", orlogistics=" + orlogistics + ", maxubirthday=" + maxubirthday + ", minubirthday=" + minubirthday
				+ ", page=" + page + ", limit=" + limit + "]";
	}
	
	
	
	
	
	
}
