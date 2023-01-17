package com.ssafy.ws.step5;

import java.util.Scanner;

public class EmergencyEscape {
	
	public static int delAlti(int[] arr, int i, int min) {
		if (i+min < arr.length) {
			return arr[i+min]-arr[i];
		}else return -1;
	}
	
	public static int avgVeloc(int[] arr, int i, int min) {
		int ans = 0;
		if (i+min < arr.length) {
			for (int j=i; j<i+min;j++) {
				ans += arr[j];
			} return ans/min;
		} else return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N = N, veloc = 속도 배열, alti = 고도 배열
		int N = sc.nextInt();
		int[] veloc = new int[N];
		int[] alti = new int[N];
		
		// veloc, alti 배열 입력
		for (int i = 0; i < N; i++) {
			veloc[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			alti[i] = sc.nextInt();
		}
		
		// index를 돌면서 탈출 여부 확인
		int i = 0;
		outer : while (i < N) {
			for (int j = 2; j<=4; j++) {
				if (delAlti(alti, i, j) <= -1000*j && avgVeloc(veloc, i, j) >= 1300-j*100) {
					System.out.println(i+1+j);
					break outer;
				}
			}
			i++;
			// 탈출하지 않았다면 -1 출력
			if (i==N) System.out.println(-1);
		}
	}
}
