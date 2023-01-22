package com.ssafy.ws.step5;

import java.util.Date;

public class ImageArticle extends Article {
	private String imageName;
	private int width;
	private int height;
	
	public ImageArticle() {
		super();
	}

	public ImageArticle(int articleId, String title, String content, int userSeq, int viewCnt, Date regDate, String imageName, int width, int height) {
		super(articleId, title, content, userSeq, viewCnt, regDate);
		this.imageName = imageName;
		this.width = width;
		this.height = height;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "ImageArticle [imageName=" + imageName + ", width=" + width + ", height=" + height + "]";
	}
}
