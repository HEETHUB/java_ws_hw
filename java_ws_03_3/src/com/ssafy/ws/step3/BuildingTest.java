package com.ssafy.ws.step3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * B구획의 빌딩 최고 높이 구하기
 */ 
public class BuildingTest {
	
	public static boolean check(char[][] map, int i, int j) {
		int[] dr = {1,-1,0,0,1,1,-1,-1};
		int[] dc = {0,0,1,-1,1,-1,1,-1};
		int N = map.length;
		
		for (int d = 0; d < 8; d++) {
			if (i+dr[d] >=0&&i+dr[d]<N&&j+dc[d]>=0&&j+dc[d]<N) {
			if (map[i+dr[d]][j+dc[d]] == 'G') return false;
		}
	} return true;
	}
	
	public static int sumB(char[][] map, int i, int j) {
		int ans = 0;
		int N = map.length;
		for (int n = 0; n < N; n++) {
			if (map[n][j] == 'B') ans++;
			if (map[i][n] == 'B') ans++;
		}
		ans -= 1;
		return ans;
	}

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] result = new int[T];
		
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			char[][] map = new char[N][N];
			int ans = 2;
			int max = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int sum = 0;
					if (check(map, i, j) == true) sum = sumB(map, i, j);
					if (sum > max) max = sum;
				}
			}
			result[t] = max;
		}
		for (int t=1; t <= T; t++) System.out.println("#"+t+" "+result[t-1]);
	}
}