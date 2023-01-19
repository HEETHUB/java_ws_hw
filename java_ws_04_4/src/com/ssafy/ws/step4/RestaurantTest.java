package com.ssafy.ws.step4;

import java.util.Arrays;

/**
 * 맛집 객체를 생성하고 정보를 출력하는 클래스
 */
public class RestaurantTest {
	public static void main(String[] args) {
		Restaurant r1 = new Restaurant(101, "을밀대", "서울", "냉면", 4);
		Restaurant r2 = new Restaurant(401, "도마29", "대구", "연어초밥", 3);
		Review re1 = new Review(1, 101, "김싸피", "너무 맛있네요.");
		Review re2 = new Review(2, 401, "나싸피", "연어초밥은 여기가 최고!");
		
		
		System.out.println("*******************맛집목록*******************");
		System.out.println("Restaurat "+r1.toString());
		System.out.println("Restaurat "+r2.toString());
		System.out.println("*******************리뷰목록*******************");
		System.out.println("Review "+re1.toString());
		System.out.println("Review "+re2.toString());
	}
}
