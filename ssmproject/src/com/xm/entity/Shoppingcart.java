package com.xm.entity;

public class Shoppingcart {
	private Integer shopid;
	private Integer uid;
	private Integer pid;
	private Integer sid;
	private double shopprice;
	private Integer shopnumber;
	private Product product;
	private User user;
	private Specification specification;
	public Integer getShopid() {
		return shopid;
	}
	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public double getShopprice() {
		return shopprice;
	}
	public void setShopprice(double shopprice) {
		this.shopprice = shopprice;
	}
	public Integer getShopnumber() {
		return shopnumber;
	}
	public void setShopnumber(Integer shopnumber) {
		this.shopnumber = shopnumber;
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
	public Shoppingcart(Integer shopid, Integer uid, Integer pid, Integer sid, double shopprice, Integer shopnumber,
			Product product, User user, Specification specification) {
		super();
		this.shopid = shopid;
		this.uid = uid;
		this.pid = pid;
		this.sid = sid;
		this.shopprice = shopprice;
		this.shopnumber = shopnumber;
		this.product = product;
		this.user = user;
		this.specification = specification;
	}
	public Shoppingcart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shoppingcart [shopid=" + shopid + ", uid=" + uid + ", pid=" + pid + ", sid=" + sid + ", shopprice="
				+ shopprice + ", shopnumber=" + shopnumber + ", product=" + product + ", user=" + user
				+ ", specification=" + specification + "]";
	}
	
	
	
	
}
