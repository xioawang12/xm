package com.xm.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {
	private Integer uid;
	private String uname;
	private String upwd;
	private String uphone;
	private String uemail;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date ubirthday;
	private String usex;
	private int adAid;
	private Address address;
	private int ustate;
	private int urole;
	private String uimg;
	private String upwd2;
	private String upwd3;
	private String upwd4;
	public User(Integer uid, String uname, String upwd, String uphone, String uemail, Date ubirthday, String usex,
			int adAid, Address address, int ustate, int urole, String uimg, String upwd2, String upwd3, String upwd4) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.uphone = uphone;
		this.uemail = uemail;
		this.ubirthday = ubirthday;
		this.usex = usex;
		this.adAid = adAid;
		this.address = address;
		this.ustate = ustate;
		this.urole = urole;
		this.uimg = uimg;
		this.upwd2 = upwd2;
		this.upwd3 = upwd3;
		this.upwd4 = upwd4;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public Date getUbirthday() {
		return ubirthday;
	}
	public void setUbirthday(Date ubirthday) {
		this.ubirthday = ubirthday;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public int getAdAid() {
		return adAid;
	}
	public void setAdAid(int adAid) {
		this.adAid = adAid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getUstate() {
		return ustate;
	}
	public void setUstate(int ustate) {
		this.ustate = ustate;
	}
	public int getUrole() {
		return urole;
	}
	public void setUrole(int urole) {
		this.urole = urole;
	}
	public String getUimg() {
		return uimg;
	}
	public void setUimg(String uimg) {
		this.uimg = uimg;
	}
	public String getUpwd2() {
		return upwd2;
	}
	public void setUpwd2(String upwd2) {
		this.upwd2 = upwd2;
	}
	public String getUpwd3() {
		return upwd3;
	}
	public void setUpwd3(String upwd3) {
		this.upwd3 = upwd3;
	}
	public String getUpwd4() {
		return upwd4;
	}
	public void setUpwd4(String upwd4) {
		this.upwd4 = upwd4;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", uphone=" + uphone + ", uemail=" + uemail
				+ ", ubirthday=" + ubirthday + ", usex=" + usex + ", adAid=" + adAid + ", address=" + address
				+ ", ustate=" + ustate + ", urole=" + urole + ", uimg=" + uimg + ", upwd2=" + upwd2 + ", upwd3=" + upwd3
				+ ", upwd4=" + upwd4 + "]";
	}
	
}
