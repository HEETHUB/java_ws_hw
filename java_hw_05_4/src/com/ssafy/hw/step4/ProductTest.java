package com.ssafy.hw.step4;

import java.util.Arrays;

/**
 * 상품 객체를 생성하고 출력하는 클래스 
 *
 */
public class ProductTest {
	public static void main(String[] args) {
		ProductManager PM = new ProductManager();
		
		Product p1 = new Product("00", "아이폰", 1500000, 10, "Apple", "아이폰입니다.");
		Product p2 = new Product("01", "아이패드", 1000000, 5, "Apple", "아이패드입니다.");
		Product p3 = new Product("02", "맥북", 2500000, 1, "Apple", "맥북입니다.");
		
		Review r1 = new Review(0, "00", "조희태", "좋아요!");
		Review r2 = new Review(1, "00", "조희태1", "좋아요22!");
		Review r3 = new Review(2, "02", "조희태2", "좋아요444!");
		Review r4 = new Review(3, "01", "조희태3", "좋아22요!");
		Review r5 = new Review(4, "01", "조희태4", "11좋아요!");
		
		PM.addProduct(p1);
		PM.addProduct(p2);
		PM.addProduct(p3);
		
		PM.addReview(r1);
		PM.addReview(r2);
		PM.addReview(r3);
		PM.addReview(r4);
		PM.addReview(r5);
		
		System.out.println(Arrays.toString(PM.getProductList()));
		System.out.println(Arrays.toString(PM.getProductReview("00")));
		
		p1 = new Product("00", "갤럭시", 1500000, 10, "Apple", "아이폰입니다.");
		System.out.println(Arrays.toString(PM.getProductList()));
		PM.updateProduct(p1);
		System.out.println(Arrays.toString(PM.getProductList()));
		
		
	}
}
