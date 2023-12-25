package com.xm.entity;

public class Recommentlocation {
private Integer locid;
private String location;
public Recommentlocation() {
	super();
	// TODO Auto-generated constructor stub
}
public Recommentlocation(Integer locid, String location) {
	super();
	this.locid = locid;
	this.location = location;
}
public Integer getLocid() {
	return locid;
}
public void setLocid(Integer locid) {
	this.locid = locid;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Recommentlocation [locid=" + locid + ", location=" + location + "]";
}

}
