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
public class Solution08 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i-1; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= 5-i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1; j <= 9-i; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= i-4; j++) {
					System.out.print("*");
				}

				System.out.println();
			}
		}

	}
}
