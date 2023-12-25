package com.xm.entity;

public class Specification {
private Integer  sid;
private Integer pid;//类型编号，外籍
private String scolor;
private Double soriginal;
private Product product;//外键对象
private Integer sstock;
public Specification() {
	super();
	// TODO Auto-generated constructor stub
}
public Specification(Integer sid, Integer pid, String scolor, Double soriginal, Product product, Integer sstock) {
	super();
	this.sid = sid;
	this.pid = pid;
	this.scolor = scolor;
	this.soriginal = soriginal;
	this.product = product;
	this.sstock = sstock;
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
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
public Double getSoriginal() {
	return soriginal;
}
public void setSoriginal(Double soriginal) {
	this.soriginal = soriginal;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Integer getSstock() {
	return sstock;
}
public void setSstock(Integer sstock) {
	this.sstock = sstock;
}

public Specification(Integer sid, String scolor, Double soriginal, Product product, Integer sstock) {
	super();
	this.sid = sid;
	this.scolor = scolor;
	this.soriginal = soriginal;
	this.product = product;
	this.sstock = sstock;
}
@Override
public String toString() {
	return "Specification [sid=" + sid + ", pid=" + pid + ", scolor=" + scolor + ", soriginal=" + soriginal
			+ ", product=" + product + ", sstock=" + sstock + "]";
}
}
