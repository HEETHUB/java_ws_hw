package com.ssafy.ws.step5;

import java.util.Map;
import java.util.Scanner;

public class MinerGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] mine = new int[N][N];
		int r = 0;
		int c = 0;
		// 광산 정보 입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mine[i][j] = sc.nextInt();
				if (mine[i][j] == 0) {
					r = i;
					c = j;
				}
			}
		}
		
		// M = 광부 이동 횟수, moving = 동작 커맨드
		int M = sc.nextInt();
		char[] moving = new char[M];
		for (int m = 0; m < M; m++) {
			moving[m] = sc.next().charAt(0);
		}

		// ans = 캐낸 암석 수, dr = 팔방으로 향하는 행, dc =팔방으로 향하는 열
		int ans = 0;
		int[] dr = {1,-1,0,0,1,1,-1,-1};
		int[] dc = {0,0,1,-1,1,-1,1,-1};
		
		for (int m = 0; m < M; m++) {
			if (moving[m] == 'U') {
				if (mine[r-1][c] == 0) r--;
				else if (mine[r-1][c] == 1) {
					mine[r-1][c]--;
					ans++;
					r--;
				}
				else {
					mine[r-1][c]--;
				}
			} else if (moving[m] == 'D') {
				if (mine[r+1][c] == 0) r++;
				else if (mine[r+1][c] == 1) {
					mine[r+1][c]--;
					ans++;
					r++;
				}
				else {
					mine[r+1][c]--;
				}
			} else if (moving[m] == 'L') {
				if (mine[r][c-1] == 0) c--;
				else if (mine[r][c-1] == 1) {
					mine[r][c-1]--;
					ans++;
					c--;
				}
				else {
					mine[r][c-1]--;
				}
			} else if (moving[m] == 'R') {
				if (mine[r][c+1] == 0) c++;
				else if (mine[r][c+1] == 1) {
					mine[r][c+1]--;
					ans++;
					c++;
				}
				else {
					mine[r][c+1]--;
				}
			} else {
				for (int k = 0; k < 8; k++) {
					if(r+dr[k]>=0&&r+dr[k]<N&&c+dc[k]>=0&&c+dc[k]<N) {
						if (mine[r+dr[k]][c+dc[k]] != 0) {
							ans++;
							mine[r+dr[k]][c+dc[k]] = 0;
						}
					}
				}
			} 
		}
		
		System.out.println("광부 위치 : ("+r+","+c+")");
		System.out.println("부순 암석 개수 : "+ans);
	}
}
