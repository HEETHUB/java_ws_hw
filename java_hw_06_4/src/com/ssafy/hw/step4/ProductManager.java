package com.ssafy.hw.step4;

import java.util.Arrays;

/**
 * 상품리스트를 배열로 유지하며 관리하는 클래스
 */
public class ProductManager {
	private final int MAX_PRODUCT_SIZE = 100;
	private final int MAX_REVIEW_SIZE = 1000;
	private Product[] products = new Product[MAX_PRODUCT_SIZE];
	private Review[] reviews = new Review[MAX_REVIEW_SIZE];
	private int pCount = 0;
	private int rCount = 0;
	
	
	public boolean addProduct(Product product) {
		if (pCount < MAX_PRODUCT_SIZE) {
			products[pCount] = product;
			pCount++;
			return true;
		}else return false;
	}
	
	public boolean updateProduct(Product product) {
		for (int i = 0 ; i < pCount; i++) {
			if (products[i] == product) {
				products[i] = product;
				return true;
			}
		}return false;
	}
	
	public int sell(String pCode, int cnt) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode() == pCode) {
				products[i].setQuantity(products[i].getQuantity()-cnt);
				return products[i].getQuantity();
			}
		} return -1;
	}
	
	public Product[] getProductList() {
		return Arrays.copyOfRange(products, 0, pCount);
	}
	
	public Product searchByCode(String pCode) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode().equals(pCode)) return products[i];
		}return null;
	}
	
	public boolean addReview(Review review) {
		if (rCount < MAX_REVIEW_SIZE) {
			reviews[rCount] = review;
			rCount++;
			return true;
		}else return false;
	}
	
	public boolean removeReview(int reviewId) {
		for (int i = 0; i < rCount; i++) {
			if (reviews[i].getReviewId() == reviewId) {
				for (int j = i; j < rCount; j++) {
					reviews[j] = reviews[j+1];
					if (j == rCount-1) reviews[j] = null;
				} return true;
			}
		}return false;
	}
	
	public Review[] getProductReview(String pCode) {
		Review[] ans = new Review[rCount];
		int n = 0;
		for (int i = 0; i < rCount; i++) {
			if (reviews[i].getpCode().equals(pCode)) {
				ans[n] = reviews[i];
				n++;
			}
		}return Arrays.copyOfRange(ans, 0, n);
	}
	
	public boolean removeReview(String pCode) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode().equals(pCode)) {
				for (int j = i; j < pCount; j++) {
					products[j] = products[j+1];
					if (j == pCount-1) products[j] = null;
				} return true;
			}
		}return false;
	}
	
	public Product searchByName(String pName) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpName().equals(pName)) return products[i];
		}return null;
	}
	
	public long getTotalPrice() {
		int res = 0;
		for (int i = 0; i < pCount; i++) {
			res += products[i].getPrice();
		}
		return res;
	}
	
	public Product[] getProducts() {
		int cnt = 0;
		
		for (int i = 0; i < pCount; i++) {
			if (products[i] instanceof Product) {
				cnt++;
			}
		}
		if (cnt == 0) return null;
		int cur = 0;
		Product[] res = new Product[cnt];
		for (int i = 0; i < pCount; i++) {
			if (products[i] instanceof Product) {
				res[cur++] = products[i];
			}
		}
		return res;
	}
	
	public Refrigerator[] getRefrigerators() {
		int cnt = 0;
		
		for (int i = 0; i < pCount; i++) {
			if (products[i] instanceof Refrigerator) {
				cnt++;
			}
		}
		if (cnt == 0) return null;
		int cur = 0;
		Refrigerator[] res = new Refrigerator[cnt];
		for (int i = 0; i < pCount; i++) {
			if (products[i] instanceof Refrigerator) {
				res[cur++] = (Refrigerator)products[i];
			}
		}
		return res;
	}
	
	public Refrigerator[] getRefrigeratorsFreezer(boolean freezer) {
		int cnt = 0;

		
		for (int i = 0; i < pCount; i++) {
			if (products[i] instanceof Refrigerator) {
				if (((Refrigerator)products[i]).isFreezer() == true) cnt++;
			}
		}

		if (cnt == 0) return null;
		
		Refrigerator[] ans = new Refrigerator[cnt];
		cnt = 0;
		for (int i = 0; i < pCount; i++) {
			if (products[i] instanceof Refrigerator) {
				if (((Refrigerator)products[i]).isFreezer() == true) ans[cnt++] = (Refrigerator)products[i];
			}
		}
		return ans;
	}

}
		