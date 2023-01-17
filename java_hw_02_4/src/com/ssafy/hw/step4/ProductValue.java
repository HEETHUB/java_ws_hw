package com.ssafy.hw.step4;

import java.util.Scanner;

public class ProductValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] goods = new int[N];
		
		for (int i = 0 ; i < N; i++) {
			goods[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			int rank = 1;
			for (int j = 0 ; j < N; j++) {
				if (goods[j] > goods[i]) rank++;
			}
			System.out.print(rank+" ");
		}
	}

}
