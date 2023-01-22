package com.ssafy.ws.step3;

import java.util.Arrays;

/**
 * 도서리스트를 배열로 유지하며 관리하는 클래스
 */
public class BookManager {
	final int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
	private int size = 0;
	
	public void add(Book book) {
		if (size < MAX_SIZE) books[size++] = book;
		else System.out.println("최대 도서 수에 도달했습니다.");
	}
	
	public void remove(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				for (int j = i; j < size; j++) {
					if (j == size-1) {
						books[j] = null;
						size--;
						return;
					}
					else books[j] = books[j+1];
				}
			}
		}
	}
	
	public Book[] getList() {
		return Arrays.copyOfRange(books, 0, size);
	}
	
	public Book searchByIsbn(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) return books[i];
		} return null;
	}
}


