package com.ssafy.ws.step5;

import java.util.Arrays;

public class CommentManager {
	final int MAX_COMMENT_SIZE = 1000;
	private Comment[] comments = new Comment[MAX_COMMENT_SIZE];
	private int commentSize = 0;
	
	public void addComment(Comment comment) {
		if (commentSize < MAX_COMMENT_SIZE) comments[commentSize++] = comment;
		else System.out.println("최대 댓글 수에 도달했습니다.");
	}
	
	public void removeComment(int commentId) {
		for (int i = 0; i < commentSize; i++) {
			if (comments[i].getCommentId() == commentId) {
				for (int j = i; j < commentSize; j++) {
					if (j < commentSize - 1) comments[j] = comments[j+1];
					else {
						comments[j] = null;
						commentSize--;
					}
				}
			}
		}
	}
	
	public void removeArticle(int articleId) {
		for (int i = 0; i < commentSize; i++) {
			if (comments[i].getArticleId() == articleId) {
				comments[i] = null;
				for (int j = i; j < commentSize; j++) {
					if (j < commentSize) comments[j] = comments[j+1];
					else {
						comments[j] = null;
						commentSize--;
					}
				}
			}
		}
	}
	
	public Comment[] getcommentList() {
		return Arrays.copyOfRange(comments, 0, commentSize);
	}
}
