package com.ssafy.hw.step4;

import java.util.Arrays;

/**
 * 상품 객체를 생성하고 출력하는 클래스 
 *
 */
public class ProductTest {
	public static void main(String[] args) {
		ProductManager PM = new ProductManager();
		Refrigerator p1 = new Refrigerator("R00001", "S냉장고", 1000000, 20, "삼성", "삼성에서 출시한 스마트냉장고입니다.", "냉장고", 1000, true, 2021);
		Refrigerator p2 = new Refrigerator("R00002", "L냉장고", 100000, 10, "엘리스", "엘리스 저가형 냉장고.", "냉장고", 300, false, 2022);
		Product p3 = new Product("P00001", "우주폰S", 500000, 100, "삼성", "삼성에서 출시한 우주폰S입니다.");
		
		PM.addProduct(p1);
		PM.addProduct(p2);
		PM.addProduct(p3);
		
		
		System.out.println("***************냉장고목록***************");
		System.out.println(Arrays.toString(PM.getRefrigerators()));
		System.out.println("***************냉동고 있는 목록***************");
		System.out.println(Arrays.toString(PM.getRefrigeratorsFreezer(true)));
		System.out.println("***************이름검색***************");
		System.out.println(PM.searchByName("S냉장고"));
		System.out.println(PM.searchByName("우주폰S"));
		System.out.println("***************재고총가격***************");
		System.out.println(PM.getTotalPrice());
		
//		Product p4 = new Refrigerator("00", "11", 100, 10, "apple", "ddd", "냉장고", 100, false, 2021);
////		((Refrigerator)p4).is 
////		Refrigerator p5 = (Refrigerator)p4;
//		System.out.println((Refrigerator)p4 instanceof Refrigerator);
	}
}
