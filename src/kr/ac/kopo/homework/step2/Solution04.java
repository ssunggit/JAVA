package kr.ac.kopo.homework.step2;

import java.util.Scanner;

/* 4
 
단을 입력받아 구구단을 출력하세요
2 - 9 단을 입력 : 6
*** 6단 ***
6 * 1 = 6
6 * 2 = 12
...
6 * 9 = 54

 */
public class Solution04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 9 단을 입력 : ");
		int input = sc.nextInt();
		
		System.out.printf("*** %2d단 ***\n", input);
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d *%2d = %2d\n", input, i, input*i);
		}
		
		

	}
}
