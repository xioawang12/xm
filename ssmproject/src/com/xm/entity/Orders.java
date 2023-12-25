package com.xm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Orders {
	private Integer orderid;
	private Integer uid;
	private User user;
	private Integer adid;
	private Address address;
	private String orderstate;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone= "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date ordertime;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone= "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date orpaytime;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone= "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date ordeliver;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone= "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date orfinish;
	private String orlogistics;
	private String oroddnum;
	private double freight;
	private String remark;
	private Integer isdelete;
	private double totalprice;
	private Shoppingcart shoppingcart;
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getAdid() {
		return adid;
	}
	public void setAdid(Integer adid) {
		this.adid = adid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public Date getOrpaytime() {
		return orpaytime;
	}
	public void setOrpaytime(Date orpaytime) {
		this.orpaytime = orpaytime;
	}
	public Date getOrdeliver() {
		return ordeliver;
	}
	public void setOrdeliver(Date ordeliver) {
		this.ordeliver = ordeliver;
	}
	public Date getOrfinish() {
		return orfinish;
	}
	public void setOrfinish(Date orfinish) {
		this.orfinish = orfinish;
	}
	public String getOrlogistics() {
		return orlogistics;
	}
	public void setOrlogistics(String orlogistics) {
		this.orlogistics = orlogistics;
	}
	public String getOroddnum() {
		return oroddnum;
	}
	public void setOroddnum(String oroddnum) {
		this.oroddnum = oroddnum;
	}
	public double getFreight() {
		return freight;
	}
	public void setFreight(double freight) {
		this.freight = freight;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getIsdelete() {
		return isdelete;
	}
	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public Shoppingcart getShoppingcart() {
		return shoppingcart;
	}
	public void setShoppingcart(Shoppingcart shoppingcart) {
		this.shoppingcart = shoppingcart;
	}
	public Orders(Integer orderid, Integer uid, User user, Integer adid, Address address, String orderstate,
			Date ordertime, Date orpaytime, Date ordeliver, Date orfinish, String orlogistics, String oroddnum,
			double freight, String remark, Integer isdelete, double totalprice, Shoppingcart shoppingcart) {
		super();
		this.orderid = orderid;
		this.uid = uid;
		this.user = user;
		this.adid = adid;
		this.address = address;
		this.orderstate = orderstate;
		this.ordertime = ordertime;
		this.orpaytime = orpaytime;
		this.ordeliver = ordeliver;
		this.orfinish = orfinish;
		this.orlogistics = orlogistics;
		this.oroddnum = oroddnum;
		this.freight = freight;
		this.remark = remark;
		this.isdelete = isdelete;
		this.totalprice = totalprice;
		this.shoppingcart = shoppingcart;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", uid=" + uid + ", user=" + user + ", adid=" + adid + ", address="
				+ address + ", orderstate=" + orderstate + ", ordertime=" + ordertime + ", orpaytime=" + orpaytime
				+ ", ordeliver=" + ordeliver + ", orfinish=" + orfinish + ", orlogistics=" + orlogistics + ", oroddnum="
				+ oroddnum + ", freight=" + freight + ", remark=" + remark + ", isdelete=" + isdelete + ", totalprice="
				+ totalprice + ", shoppingcart=" + shoppingcart + "]";
	}
	
	
	
	
}

