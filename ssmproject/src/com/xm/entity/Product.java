package com.xm.entity;

public class Product {
	private Integer pid;
	private Shoppingcart shoppingcart;
	private Specification specification;
	private String pname;
	private Integer cateid;
	private Category category;
	private String pimg;
	private String pintro;
	private String pdetail;
	private Integer pischoice;
	private Integer pstate;
	private String pmaterial;
	private String pstyle;
	private Proimg proimg;
	public Product(Integer pid, Shoppingcart shoppingcart, Specification specification, String pname, Integer cateid,
			Category category, String pimg, String pintro, String pdetail, Integer pischoice, Integer pstate,
			String pmaterial, String pstyle, Proimg proimg) {
		super();
		this.pid = pid;
		this.shoppingcart = shoppingcart;
		this.specification = specification;
		this.pname = pname;
		this.cateid = cateid;
		this.category = category;
		this.pimg = pimg;
		this.pintro = pintro;
		this.pdetail = pdetail;
		this.pischoice = pischoice;
		this.pstate = pstate;
		this.pmaterial = pmaterial;
		this.pstyle = pstyle;
		this.proimg = proimg;
	}
	

	public Product(String pname, Integer cateid) {
		super();
		this.pname = pname;
		this.cateid = cateid;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Shoppingcart getShoppingcart() {
		return shoppingcart;
	}
	public void setShoppingcart(Shoppingcart shoppingcart) {
		this.shoppingcart = shoppingcart;
	}
	public Specification getSpecification() {
		return specification;
	}
	public void setSpecification(Specification specification) {
		this.specification = specification;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getCateid() {
		return cateid;
	}
	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public String getPintro() {
		return pintro;
	}
	public void setPintro(String pintro) {
		this.pintro = pintro;
	}
	public String getPdetail() {
		return pdetail;
	}
	public void setPdetail(String pdetail) {
		this.pdetail = pdetail;
	}
	public Integer getPischoice() {
		return pischoice;
	}
	public void setPischoice(Integer pischoice) {
		this.pischoice = pischoice;
	}
	public Integer getPstate() {
		return pstate;
	}
	public void setPstate(Integer pstate) {
		this.pstate = pstate;
	}
	public String getPmaterial() {
		return pmaterial;
	}
	public void setPmaterial(String pmaterial) {
		this.pmaterial = pmaterial;
	}
	public String getPstyle() {
		return pstyle;
	}
	public void setPstyle(String pstyle) {
		this.pstyle = pstyle;
	}
	public Proimg getProimg() {
		return proimg;
	}
	public void setProimg(Proimg proimg) {
		this.proimg = proimg;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", shoppingcart=" + shoppingcart + ", specification=" + specification
				+ ", pname=" + pname + ", cateid=" + cateid + ", category=" + category + ", pimg=" + pimg + ", pintro="
				+ pintro + ", pdetail=" + pdetail + ", pischoice=" + pischoice + ", pstate=" + pstate + ", pmaterial="
				+ pmaterial + ", pstyle=" + pstyle + ", proimg=" + proimg + "]";
	}
	
	
}
