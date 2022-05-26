package kr.ac.kopo.homework.step3;

import java.util.Scanner;

/*
10개의 정수를 입력받아 출력
1's num : 12
2's num : 5
3's num : 8
4's num : 30
5's num : 22
6's num : 87
7's num : 9
8's num : 4
9's num : 15
10's num : 22
< 짝수 >

12 8 30 22 4 22
짝수의 총합 : XXX
< 홀수 >
5 87 9 15
홀수의 총합 : XXX 
 */

public class Solution02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d's num : ", i + 1);
			num[i] = sc.nextInt();
			
		}
		System.out.println(" <짝수> ");
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2 == 0) {
				sum1 += num[i];
				System.out.printf("%d  ", num[i]);
			}
		}
		System.out.println();
		System.out.println("짝수의 총합 : " + sum1);
		
		System.out.println(" <홀수> ");
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2 == 1) {
				sum2 += num[i];
				System.out.printf("%d  ", num[i]);
			}
		}
		System.out.println();
		System.out.println("홀수의 총합 : " + sum2);
		
		
		
	}
}
