package com.Github.Practice_Springboot_Without_DataBase;

public class Product {

	 int pId;
	 String pName;
	 String pPrice;
	 String category;
	String pCompany;

	public Product() {
		super();
	}

	public Product(int pId, String pName, String pPrice, String category, String pCompany) {
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.category = category;
		this.pCompany = pCompany;
	}

	public int getPid() {
		return pId;
	}

	public void setPid(int pId) {
		this.pId = pId;
	}

	public String getPname() {
		return pName;
	}

	public void setPname(String pName) {
		this.pName = pName;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setpCategory(String category) {
		this.category = category;
	}

	public String getPcompany() {
		return pCompany;
	}

	public void setPcompany(String pCompany) {
		this.pCompany = pCompany;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", category=" + category
				+ ", pCompany=" + pCompany + "]";
	}

}
