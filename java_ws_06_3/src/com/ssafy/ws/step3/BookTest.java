package com.ssafy.ws.step3;

import java.util.Arrays;

/**
 * BookManager 클래스를 이용하여 도서 객체 추가,삭제,조회하는 클래스
 */
public class BookTest {

	public static void main(String[] args) {
		BookManager BM = new BookManager();
		Book b1 = new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 법");
		Book b2 = new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용");
		Book b3 = new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링");
		
		BM.add(b1);
		BM.add(b2);
		BM.add(b3);
		
		System.out.println(Arrays.toString(BM.getList()));
		
		System.out.println(BM.searchByIsbn("21424"));
		
		BM.remove("21424");
		
		System.out.println(Arrays.toString(BM.getList()));
	}
}
