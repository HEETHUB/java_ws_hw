package com.ssafy.ws.step4;

import java.util.Arrays;

/**
 * 맛집 객체를 생성하고 정보를 출력하는 클래스
 */
public class RestaurantTest {
	public static void main(String[] args) {
		RestaurantManager RM = new RestaurantManager();
		Restaurant r1 = new Restaurant(0, "정박사", "샤로수길", "무한리필", 5);
		Restaurant r2 = new Restaurant(1, "옷살", "샤로수길초입", "탄두리치킨", 4);
		Review re1 = new Review(0, 0, "조희태", "최고에요");
		Review re2 = new Review(1, 1, "희태", "최고에요22");
		
		RM.addRestaurant(r1);
		RM.addRestaurant(r2);
		RM.addReview(re1);
		RM.addReview(re2);
		
		System.out.println(Arrays.toString(RM.getRestaurantList()));
	}
}
