package com.ssafy.ws.step4;

import java.util.Scanner;

/**
 * 60 갑자를 서양력으로 변환하는 프로그램
 */

public class GabjaTest {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("60갑자를 입력하세요: ");
    	String gapja = sc.next();
    	
    	while (gapja.equals("종료") == false) {
    		
    		char first = gapja.charAt(0);
    		char second = gapja.charAt(1);
    		char[] gan = {'경','신','임','계','갑','을','병','정','무','기'};
    		char[] ji = {'신','유','술','해','자','축','인','묘','진','사','오','미'};
    		int g = 0;
    		int j = 0;
    		
    		for (int i = 0; i < gan.length; i++) {
    			if (gan[i] == first ) g = i;
    		}
    		
    		for (int i = 0; i < gan.length; i++) {
    			if (ji[i] == second ) j = i;
    		}
    		
    		for (int i = 1800; i <= 2100; i++) {
    			if ((i-1800)%10 == g) {
    				if ((i-1800)%12 == j) {
    					System.out.print(i + " ");
    				}
    			}
    		}
    		System.out.println();
    		
    		System.out.print("60갑자를 입력하세요: ");
    		gapja = sc.next();
    		
    	}
    	
    	
    	
    }
}
