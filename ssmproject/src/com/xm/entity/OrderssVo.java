package com.xm.entity;

public class OrderssVo {
private Integer uid;
private String orderstate;
public OrderssVo() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}
public String getOrderstate() {
	return orderstate;
}
public void setOrderstate(String orderstate) {
	this.orderstate = orderstate;
}
public OrderssVo(Integer uid, String orderstate) {
	super();
	this.uid = uid;
	this.orderstate = orderstate;
}


}
