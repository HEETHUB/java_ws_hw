package com.ssafy.ws.step1;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;

		for (int i = 1; i <= n; i++) {
			if (i%2 == 0) ans += i;
		}
		System.out.println(ans);
		
	}

}
