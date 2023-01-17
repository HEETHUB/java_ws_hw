package com.ssafy.ws.step5;
import java.util.Scanner;


public class Fernace {

	public static void main(String[] args) {
		// Scanner 선언
		Scanner sc = new Scanner(System.in);
		// A, B, N 선언
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		// 지정되어있는 온도들을 ArrayList temps에 저장
		int[] temps = new int[N];
		
		for (int i=0; i<N; i++) {
			temps[i] = sc.nextInt();
		}
		
		// 소요시간 sec, 현재온도 curTemp
		int sec = 0;
		int curTemp = A;
		
		// 지정된 온도로 바꾼다면 curTemp를 바꿀 온도로 지정, sec++
		for (int t : temps) {
			if (Math.abs(curTemp - B) > Math.abs(t - B)) {
				curTemp = t;
			}
		}
		
		if (curTemp != A) {
			sec++;
		}

		// curTemp가 B와 같아질 때까지 온도조정
		sec += Math.abs(curTemp - B);
		// 답 출력
		System.out.println(sec);
	}

}
