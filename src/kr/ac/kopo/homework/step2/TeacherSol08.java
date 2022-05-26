package kr.ac.kopo.homework.step2;

import java.util.Scanner;

/* 8
 * 
다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
반복문 5개, 조건문 1개 이용가능
반복문 3개, 조건문 3개
반복문 3개, 조건문 1개
반복문 2개, 조건문 2개
*****
-****
--***
---**
----*
---** 
--*** 
-**** 
***** 

 */

public class TeacherSol08 {
	public static void main(String[] args) {
		/*
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i-1; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= 6-i; j++) {
					System.out.print("*");
				}
				
			} else {
				for (int j = 1; j <= 9-i; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= i-4; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		
		/*
		int star = 5;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5-star; j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<5) {
				star--;
			}else {
				star++;
			}
		}
		*/
		
		// 별의 시작열로 파악한 코드\
//		i : '*'의 시작열
//		1 :	1
//		2 :	2
//		3 :	3
//		4 :	4	
//		5 :	5	
//		6 :	4
//		7 :	3	
//		8 :	2	
//		9 :	1
		
		/*
		 
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5; j++) {
					if(j<i) {
						System.out.print("-");
					}else {
						System.out.print("*");
					}
				}	
			} else {
				for (int j = 1; j <= 5; j++) {
					System.out.print(j < 10-i ? '-': '*');
				}
			}
			System.out.println();
		}
		
		*/
		
		int start = 1;
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 5; j++) {
				if(j < start) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
			if(i < 5) {
				start++;
			} else {
				start--;
			}
		}			

	}
}
