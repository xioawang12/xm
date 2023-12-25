package com.xm.entity;

public class OrdersDetail {
	private Integer oid;
	private Integer pid;
	private Integer orderid;
	private Integer sid;
	private Integer number;
	private double price;
	private String remark;
	private Product product;
	private Orders orders;
	private Specification specification;
	private Integer adid;
	private Address address;
	private Integer page;
	private Integer limit;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Specification getSpecification() {
		return specification;
	}
	public void setSpecification(Specification specification) {
		this.specification = specification;
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
	public OrdersDetail(Integer oid, Integer pid, Integer orderid, Integer sid, Integer number, double price,
			String remark, Product product, Orders orders, Specification specification, Integer adid, Address address,
			Integer page, Integer limit) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.orderid = orderid;
		this.sid = sid;
		this.number = number;
		this.price = price;
		this.remark = remark;
		this.product = product;
		this.orders = orders;
		this.specification = specification;
		this.adid = adid;
		this.address = address;
		this.page = page;
		this.limit = limit;
	}
	public OrdersDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrdersDetail [oid=" + oid + ", pid=" + pid + ", orderid=" + orderid + ", sid=" + sid + ", number="
				+ number + ", price=" + price + ", remark=" + remark + ", product=" + product + ", orders=" + orders
				+ ", specification=" + specification + ", adid=" + adid + ", address=" + address + ", page=" + page
				+ ", limit=" + limit + "]";
	}
	
	
	
	
}
