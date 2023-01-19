package com.ssafy.hw.step4;

/**
 * 상품 정보를 나타내는 클래스
 */
public class Product {
	String pCode; 
	String pName;
	int price;
	int quantity;
	String brand;
	String desc;
	
	public Product(String pCode, String pName, int price, int quantity, String brand, String desc){
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.desc = desc;
	}
	
	public String toString() {
		return  "Product [pCode="+this.pCode+", pName="+this.pName+", price="+this.price+", quantity="+this.quantity+", brand="+this.brand+", desc="+this.desc+"]";
	}

}
