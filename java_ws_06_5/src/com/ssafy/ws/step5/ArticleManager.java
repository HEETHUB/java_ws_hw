package com.ssafy.ws.step5;

import java.util.Arrays;

public class ArticleManager {
	final int MAX_ARTICLE_SIZE = 1000;
	private Article[] articles = new Article[MAX_ARTICLE_SIZE];
	private int articleSize = 0;
	
	public void addArticle(Article article) {
		if (articleSize < MAX_ARTICLE_SIZE) {
			articles[articleSize++] = article;
		}else System.out.println("최대 기사 수에 도달했습니다.");
	}
	
	public Article[] getArticleList() {
		return Arrays.copyOfRange(articles, 0, articleSize);
	}
	
	public Article getArticle(int articleId) {
		for (int i = 0; i < articleSize; i++) {
			if (articles[i].getArticleId() == articleId) return articles[i];
		} return null;
	}
	
	public void removeArticle(int articleId) {
		for (int i = 0; i < articleSize; i++) {
			if (articles[i].getArticleId() == articleId) {
				for (int j = i; j < articleSize; j++) {
					if (j < articleSize - 1) articles[j] = articles[j+1];
					else {
						articles[j] = null;
						articleSize--;
					}
				}
			}
		}
	}
	
	
}
