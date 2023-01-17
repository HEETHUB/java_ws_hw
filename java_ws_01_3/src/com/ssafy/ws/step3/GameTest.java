package com.ssafy.ws.step3;

import java.util.Scanner;

/**
 * 가위,바위,보 게임을 하는 클래스
 */
public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력하세요.");
		int n = sc.nextInt();
		int score = 0;
		int rule = 1;
		
		if (n == 1) {
			rule = 5; 
			n = 3;
			} else if (n == 2) {
				rule = 3; 
				n = 2;
				} else {
					rule = 1; 
					n = 1;
					}
		
		for (int i=0; i<rule; i++) {
			int num = (int) (Math.random() * 3) + 1;
			System.out.print("가위바위보 중 하나 입력:");
			
			String me = sc.next();
			int mine = 0;
			if (me.equals("가위")) {
				mine = 1;
			} else if (me.equals("바위")) {
				mine = 2;
			} else if (me.equals("보")){
				mine = 3;
			}
			
			if (num > mine) {
				if ((num-mine)%2==1) {
					System.out.println("졌습니다!!!");
					score--;
				}
				else {
					System.out.println("이겼습니다!!!");
					score++;
				}
			}else if (num < mine) {
				if ((mine-num)%2==1) {
					System.out.println("이겼습니다!!!");
					score--;
				}
				else {
					System.out.println("졌습니다!!!");
					score++;
				}
			} else {
				System.out.println("비겼습니다!!!");
			}
			
			if (score == n || score == -n) {
				if (score == n) {
					System.out.println("### 사용자 승!!!");
					score = 0;
					break;
				} else {
					System.out.println("### 컴퓨터 승!!!");
					score = 0;
					break;
				}
			}
			
		}
		if (score > 0) {
			System.out.println("### 사용자 승!!!");
		} else if (score < 0){
			System.out.println("### 컴퓨터 승!!!");
		} else {
			System.out.println("### 무승부!!!");
		}
		
	}
}
