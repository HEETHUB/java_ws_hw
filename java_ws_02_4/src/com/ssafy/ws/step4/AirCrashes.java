package com.ssafy.ws.step4;

import java.util.Scanner;

public class AirCrashes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt()	;
		int[] arr = new int[N];
		int max = 0;
		int min = 0;
		
		for (int i = 0 ; i < N; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) max = arr[i];
		}
		
		for (int i = 0; i < N; i++) {
			if (arr[i] < arr[N-1]) min = arr[i];
		}
		if (min == 0) System.out.println(-1);
		else System.out.println(max - min); 
	}
}
