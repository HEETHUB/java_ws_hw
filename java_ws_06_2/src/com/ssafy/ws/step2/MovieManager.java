package com.ssafy.ws.step2;

import java.util.Arrays;

/**
 * 영화리스트를 배열로 관리하는 클래스
 * @author 
 *
 */
public class MovieManager {
	final int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0;
	
	public void add(Movie movie) {
		if (size == MAX_SIZE) {
			System.out.println("최대 등록 수에 도달하였습니다.");
		} else {
			movieList[size++] = movie;
		}
	}
	
	public Movie[] getList() {
		return Arrays.copyOfRange(movieList, 0, size);
	}
	
	public Movie searchByTitle(String title) {
		for (int i = 0; i < size ; i++) {
			if (movieList[i].getTitle().equals(title)) return movieList[i];
		} return null;
	}
}
