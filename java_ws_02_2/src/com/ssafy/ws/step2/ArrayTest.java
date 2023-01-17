package com.ssafy.ws.step2;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iArr = new int[] {3,6,3,4,1,2,3,5,4,5};
		for (int i=0; i<iArr.length;i++) {
			System.out.print(iArr[i]);
		}
		
		int n = sc.nextInt();
		String[] foods = new String[n];
		
		for (int i = 0; i < n; i++) {
			foods[i] = sc.next();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(foods[i]);
		}
		
	}
}
