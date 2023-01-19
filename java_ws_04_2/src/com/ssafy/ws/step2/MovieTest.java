package com.ssafy.ws.step2;

public class MovieTest {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie(0, "기생충", "봉준호", "스릴러", 131);
		
		m1.title = "the Lord of the Ring";
		m1.director = "Peter Jackson";
		m1.genre = "Fantasy";
		m1.id = 12345;
		m1.runningTime = 120;
	}

}
