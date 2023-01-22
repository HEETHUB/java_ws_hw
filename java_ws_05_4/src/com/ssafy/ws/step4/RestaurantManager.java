package com.ssafy.ws.step4;

import java.util.Arrays;

/**
 * 맛집, 리뷰 객체의 리스트를 배열로 유지하며 관리하는 클래스
 */
public class RestaurantManager {	
	final int MAX_RESTAURANT_SIZE = 100;
	final int MAX_REVIEW_SIZE = 1000;
	Restaurant[] restaurants = new Restaurant[MAX_RESTAURANT_SIZE];
	Review[] reviews = new Review[MAX_REVIEW_SIZE];
	private int restaurantSize = 0;
	private int reviewSize = 0;
	
	public void addRestaurant(Restaurant restaurant) {
		if (restaurantSize < MAX_RESTAURANT_SIZE) {
			restaurants[restaurantSize++] = restaurant;
		}else System.out.println("최대 등록 갯수에 도달했습니다.");
	}
	
	public boolean updateRestaurant(Restaurant restaurant) {
		for (int i = 0; i < restaurantSize; i++) {
			if (restaurants[i] == restaurant) {
				return true;
			}
		}return false;
	}
	
	public void removeRestaurant(int resId) {
		for (int i = 0; i < restaurantSize; i++) {
			if (restaurants[i].getResId() == resId) {
				for (int j = i; j < restaurantSize; j++) {
					if (j < restaurantSize - 1) {
						restaurants[j] = restaurants[j+1];
					} else {
						restaurants[j] = null;
						restaurantSize--;
						return;
					}
				}
			}
		}
	}
	
	public Restaurant[] getRestaurantList() {
		return Arrays.copyOfRange(restaurants, 0, restaurantSize);
	}
	
	public Restaurant getRestaurant(int resId) {
		for (int i = 0; i < restaurantSize; i++) {
			if (restaurants[i].getResId() == resId) return restaurants[i];
		}return null;
	}
	
	public void addReview(Review review) {
		if (reviewSize < MAX_REVIEW_SIZE) {
			reviews[reviewSize++] = review;
		}else System.out.println("최대 등록 갯수에 도달했습니다.");
	}
	
	public void removeReview(int reviewId) {
		for (int i = 0; i < reviewSize; i++) {
			if (reviews[i].getReviewId() == reviewId) {
				for (int j = i; j < reviewSize; j++) {
					if (j < reviewSize - 1) {
						reviews[j] = reviews[j+1];
					} else {
						reviews[j] = null;
						reviewSize--;
						return;
					}
				}
			}
		}
	}
	
	public Review[] getReviewList() {
		return Arrays.copyOfRange(reviews, 0, reviewSize);
	}
	
}
