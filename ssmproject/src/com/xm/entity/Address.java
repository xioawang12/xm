package com.xm.entity;

public class Address {
	private Integer adid;
	private Integer uid;
	private User user;
	private String adprovince;
	private String adcity;
	private String addistrict;
	private String addstreet;
	private String detailaddress;
	private String addname;
	private String addphone;
	private Integer moren;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Integer adid, Integer uid, User user, String adprovince, String adcity, String addistrict,
			String addstreet, String detailaddress, String addname, String addphone, Integer moren) {
		super();
		this.adid = adid;
		this.uid = uid;
		this.user = user;
		this.adprovince = adprovince;
		this.adcity = adcity;
		this.addistrict = addistrict;
		this.addstreet = addstreet;
		this.detailaddress = detailaddress;
		this.addname = addname;
		this.addphone = addphone;
		this.moren = moren;
	}
	public Integer getAdid() {
		return adid;
	}
	public void setAdid(Integer adid) {
		this.adid = adid;
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
	public String getAdprovince() {
		return adprovince;
	}
	public void setAdprovince(String adprovince) {
		this.adprovince = adprovince;
	}
	public String getAdcity() {
		return adcity;
	}
	public void setAdcity(String adcity) {
		this.adcity = adcity;
	}
	public String getAddistrict() {
		return addistrict;
	}
	public void setAddistrict(String addistrict) {
		this.addistrict = addistrict;
	}
	public String getAddstreet() {
		return addstreet;
	}
	public void setAddstreet(String addstreet) {
		this.addstreet = addstreet;
	}
	public String getDetailaddress() {
		return detailaddress;
	}
	public void setDetailaddress(String detailaddress) {
		this.detailaddress = detailaddress;
	}
	public String getAddname() {
		return addname;
	}
	public void setAddname(String addname) {
		this.addname = addname;
	}
	public String getAddphone() {
		return addphone;
	}
	public void setAddphone(String addphone) {
		this.addphone = addphone;
	}
	public Integer getMoren() {
		return moren;
	}
	public void setMoren(Integer moren) {
		this.moren = moren;
	}
	@Override
	public String toString() {
		return "Address [adid=" + adid + ", uid=" + uid + ", user=" + user + ", adprovince=" + adprovince + ", adcity="
				+ adcity + ", addistrict=" + addistrict + ", addstreet=" + addstreet + ", detailaddress="
				+ detailaddress + ", addname=" + addname + ", addphone=" + addphone + ", moren=" + moren + "]";
	}
}

