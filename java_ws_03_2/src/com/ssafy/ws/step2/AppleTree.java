package com.ssafy.ws.step2;

import java.util.Scanner;

public class AppleTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] farm = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N ; j++) {
				farm[i][j] = sc.nextInt();
			}
		}
		
		int[] dr1 = {-1,1,0,0};
		int[] dr2 = {0,0,-1,1};

		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int num = 0;
				num += farm[i][j];
				for (int k = 0; k<4; k++) {
					int ni = i + dr1[k];
					int nj = j + dr2[k];
					if (ni >=0&&ni<N&&nj>=0&&nj<N) num += farm[ni][nj];
				} if (num > max) max = num;
			}
		}
		System.out.println(max);
	}
}
