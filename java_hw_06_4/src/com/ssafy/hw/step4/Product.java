package com.ssafy.hw.step4;

/**
 * 상품 정보를 나타내는 클래스
 */
public class Product {
	private String pCode;
	private String pName;
	private int price;
	private int quantity;
	private String vrand;
	private String desc;
	
	public Product() {}
	
	public Product(String pCode, String pName, int price, int quantity, String vrand, String desc) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.vrand = vrand;
		this.desc = desc;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getVrand() {
		return vrand;
	}

	public void setVrand(String vrand) {
		this.vrand = vrand;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Product [pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", quantity=" + quantity
				+ ", vrand=" + vrand + ", desc=" + desc + "]";
	}
}