package com.ssafy.ws.step4;

/**
 * 한식 맛집 정보를 나타내는 클래스
 */
public class KoreanRestaurant extends Restaurant{
	private int number;
	private String breakTime;
	
	public KoreanRestaurant() {
		super();
	}

	public KoreanRestaurant(int resId, String name, String address, String signatureMenu, int rate, int number, String breakTime) {
		super(resId, name, address, signatureMenu, rate);
		this.number = number;
		this.breakTime = breakTime;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}

	@Override
	public String toString() {
		return "KoreanRestaurant [number=" + number + ", breakTime=" + breakTime + "]";
	}
}
