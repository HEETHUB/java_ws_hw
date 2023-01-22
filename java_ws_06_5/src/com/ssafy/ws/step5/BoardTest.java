package com.ssafy.ws.step5;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class BoardTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserManager UM = new UserManager();
		ArticleManager AM = new ArticleManager();
		CommentManager CM = new CommentManager();
		User user = new User(1, "ssafy", "1234", "김싸피", "ssafy.hong", "ssafy@ssafy.com");
		Date date = new Date();
		Article ar0 = new Article(0, "공지사항", "없음", 0, 0, date);
		Article ar1 = new Article(1, "코딩테스트란", "게시글 내용", 0, 0, date	);
		Article ar2 = new Article(2, "취뽀는 나에게", "그저 쉬운 것", 0, 0, date);
		Article ar3 = new Article(3, "Java 완전정복", "끝", 0, 0, date);
		Comment comment = new Comment(0, 0, 0, "잘 보았습니다.", date);
		
		UM.signup(user);
//		UM.login("", "1234");
		AM.addArticle(ar1);
		CM.addComment(comment);
		
		
		
		System.out.println("----------------------------");
		System.out.println("게시판 접속");
		System.out.println("----------------------------");
		System.out.println("작업을 선택하세요.");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("0. 종료");
		System.out.println("----------------------------");
		
		int choose = sc.nextInt();
		System.out.println("ID 입력 :");
		String ID = sc.next();
		System.out.println("PASSWORD 입력 :");
		String password = sc.next();
		UM.login(ID, password);
		System.out.println("----------------------------");
		System.out.println("로그인 성공");
		System.out.println("김싸피님 환영합니다.");
		System.out.println("----------------------------");
		System.out.println("게시글 목록");
		for (Article article : AM.getArticleList()) {
			System.out.println(article.getTitle());
		}
		System.out.println("----------------------------");
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 선택");
		System.out.println("3. 로그아웃");
		System.out.println("0. 종료");
		System.out.println("----------------------------");
		int n = sc.nextInt();
		System.out.println("게시글 선택 :");
		int n1 = sc.nextInt();
		System.out.println("----------------------------");
		System.out.println("제목 : "+AM.getArticle(1).getTitle());
		System.out.println("작성자 : "+UM.getLoginUser().getNickName());
		System.out.println("조회수 : "+AM.getArticle(1).getViewCnt());
		System.out.println("작성일 : "+AM.getArticle(1).regDate);
		System.out.println("내용 : "+AM.getArticle(1).getContent());
		System.out.println("----------------------------");
		System.out.println("총 댓글의 수 : "+CM.getcommentList().length);
		
		
	}
}
