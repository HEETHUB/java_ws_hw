package com.ssafy.hw.step4;

public class Refrigerator extends Product {
	private String category;
	private int liter;
	private boolean freezer;
	private int year;
	
	public Refrigerator() {
		super();
	}

	
	public Refrigerator(String pCode, String pName, int price, int quantity, String vrand, String desc, String category, int liter, boolean freezer, int year) {
		super(pCode, pName, price, quantity, vrand, desc);
		this.category = category;
		this.liter = liter;
		this.freezer = freezer;
		this.year = year;
		// TODO Auto-generated constructor stub
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	public boolean isFreezer() {
		return freezer;
	}

	public void setFreezer(boolean freezer) {
		this.freezer = freezer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Refrigerator [category=" + category + ", liter=" + liter + ", freezer=" + freezer + ", year=" + year
				+ "]";
	}
}
