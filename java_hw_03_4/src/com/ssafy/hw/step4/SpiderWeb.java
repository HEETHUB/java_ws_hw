package com.ssafy.hw.step4;
import java.util.Scanner;

public class SpiderWeb {
	public static int stretch(int[][] web, int i, int j, int d, int check) {
		int[][] direction = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
		int ans = 0;
		int N = web.length;
		i += direction[d][0];
		j += direction[d][1];
		while (check < 2 &&i>=0&&i<N&&j<N&&j>=0) {
			if (web[i][j] == 0) {
				check = 0;
				ans++;
			} else check++;
			i += direction[d][0];
			j += direction[d][1];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] web = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				web[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		int r = 0;
		int c = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int cur = 0;
				int check = 0;
				if (web[i][j] == 1) check++;
				else cur++;
				for (int k = 0; k < 8; k++) {
					cur += stretch(web, i, j, k, check);
				}
				if (cur > max) {
					max = cur;
					r = i;
					c = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(r+","+c);
	}

}
