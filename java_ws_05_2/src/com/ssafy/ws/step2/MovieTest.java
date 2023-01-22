package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieTest {

	public static void main(String[] args) {
		MovieManager MM = new MovieManager();
		Movie m1 = new Movie(0, "헤어질 결심", "박찬욱", "로맨스", 120);
		Movie m2 = new Movie(1, "기생충", "봉준호", "스릴러", 131);
		
		MM.add(m1);
		MM.add(m2);
		
		System.out.println(Arrays.toString(MM.getList()));
		System.out.println(MM.searchByTitle("헤어질 결심").getTitle());
	}
}
