package com.ssafy.ws.step3;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i=0; i<M; i++) {
			int n = sc.nextInt();
			for (int j = n-1; j<N; j++) {
				if ((j+1)%n==0) {
					if (arr[j] == 0) arr[j] = 1;
					else arr[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
