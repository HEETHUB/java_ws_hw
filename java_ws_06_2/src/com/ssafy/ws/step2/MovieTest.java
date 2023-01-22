package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieTest {
	public static void main(String[] args) {
		MovieManager MM = new MovieManager();
		Movie m1 = new Movie(0, "헤어질 결심", "박찬욱", "로맨스", 120);
		Movie m2 = new Movie(1, "기생충", "봉준호", "스릴러", 131);
		SeriesMovie m3 = new SeriesMovie(2, "아바타 2", "제임스 카메론", "SF", 180, 2, "물의 길");
		
		MM.add(m1);
		MM.add(m2);
		MM.add(m3);
		
		System.out.println(Arrays.toString(MM.getList()));
		System.out.println(MM.searchByTitle("아바타 2").getTitle());
	
	}
}
