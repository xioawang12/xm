package com.xm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Comment {
	private Integer comid;
	private Integer pid;
	private Integer uid;
	private Date comtime;
	private String comrating;
	private String comimgs;
	private String comcontet;
	private String comreply;
	private Date replytime;
	private String replyperson;
	private Product product;
	private User user;
	private Specification specification;
	private Orders orders;
	private OrdersDetail ordersDetail;
	public Integer getComid() {
		return comid;
	}
	public void setComid(Integer comid) {
		this.comid = comid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Date getComtime() {
		return comtime;
	}
	public void setComtime(Date comtime) {
		this.comtime = comtime;
	}
	public String getComrating() {
		return comrating;
	}
	public void setComrating(String comrating) {
		this.comrating = comrating;
	}
	public String getComimgs() {
		return comimgs;
	}
	public void setComimgs(String comimgs) {
		this.comimgs = comimgs;
	}
	public String getComcontet() {
		return comcontet;
	}
	public void setComcontet(String comcontet) {
		this.comcontet = comcontet;
	}
	public String getComreply() {
		return comreply;
	}
	public void setComreply(String comreply) {
		this.comreply = comreply;
	}
	public Date getReplytime() {
		return replytime;
	}
	public void setReplytime(Date replytime) {
		this.replytime = replytime;
	}
	public String getReplyperson() {
		return replyperson;
	}
	public void setReplyperson(String replyperson) {
		this.replyperson = replyperson;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Specification getSpecification() {
		return specification;
	}
	public void setSpecification(Specification specification) {
		this.specification = specification;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public OrdersDetail getOrdersDetail() {
		return ordersDetail;
	}
	public void setOrdersDetail(OrdersDetail ordersDetail) {
		this.ordersDetail = ordersDetail;
	}
	public Comment(Integer comid, Integer pid, Integer uid, Date comtime, String comrating, String comimgs,
			String comcontet, String comreply, Date replytime, String replyperson, Product product, User user,
			Specification specification, Orders orders, OrdersDetail ordersDetail) {
		super();
		this.comid = comid;
		this.pid = pid;
		this.uid = uid;
		this.comtime = comtime;
		this.comrating = comrating;
		this.comimgs = comimgs;
		this.comcontet = comcontet;
		this.comreply = comreply;
		this.replytime = replytime;
		this.replyperson = replyperson;
		this.product = product;
		this.user = user;
		this.specification = specification;
		this.orders = orders;
		this.ordersDetail = ordersDetail;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Comment [comid=" + comid + ", pid=" + pid + ", uid=" + uid + ", comtime=" + comtime + ", comrating="
				+ comrating + ", comimgs=" + comimgs + ", comcontet=" + comcontet + ", comreply=" + comreply
				+ ", replytime=" + replytime + ", replyperson=" + replyperson + ", product=" + product + ", user="
				+ user + ", specification=" + specification + ", orders=" + orders + ", ordersDetail=" + ordersDetail
				+ "]";
	}
	
}
