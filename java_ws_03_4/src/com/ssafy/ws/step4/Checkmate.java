package com.ssafy.ws.step4;

import java.util.Scanner;

/**
 * 체크메이트 판별하기
 */ 
public class Checkmate {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] result = new int[T];
		
		for (int t = 0; t < T; t++) {
			int ans = 0;
			int N = sc.nextInt();
			int[] A = new int[2];
			int[] B = new int[2];
			for (int a = 0; a < 2; a++) {
				A[a] = sc.nextInt();
			}
			for (int b = 0; b < 2; b++) {
				B[b] = sc.nextInt();
			}
			int[] dr = {1,-1,1,-1};
			int[] dc = {1,1,-1,-1};
			if (A[0]==B[0]||A[1]==B[1]) ans = 1;
			else {
						int d = 1;
						while (d < N) {
							if (A[0]+dr[0]*d==B[0] && A[1]+dc[0]*d==B[1]) {
								ans = 1;
								break;
							} else if (A[0]+dr[1]*d==B[0] && A[1]+dc[1]*d==B[1]) {
								ans = 1;
								break;
							} else if (A[0]+dr[2]*d==B[0] && A[1]+dc[2]*d==B[1]) {
								ans = 1;
								break;
							} else if (A[0]+dr[3]*d==B[0] && A[1]+dc[3]*d==B[1]) {
								ans = 1;
								break;
							} else d++;
					}
				}
			result[t] = ans;
			}
		for (int t=1; t <= T; t++) {
			System.out.println("#"+t+" "+result[t-1]);
		}
			
		}
	}
