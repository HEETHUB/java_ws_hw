package com.ssafy.hw.step4;

/**
 * 리뷰 정보를 나타내는 클래스
 */
public class Review {
	int reviewId;
	String pCode;
	String writer;
	String content;
	
	public Review(int reviewId, String pCode, String writer, String content) {
		this.reviewId = reviewId;
		this.pCode = pCode;
		this.writer = writer;
		this.content = content;
	}
	
	public String toString() {
		return "Review [reviewId="+this.reviewId+", pCode="+this.pCode+", writer="+this.writer+", content="+this.content+"]";
	}
}
