
package kr.ac.kopo.homework.step3;

import java.util.Scanner;

/*
 5 개 의 정 수 를 입 력 받 아 다 음 과 같 이 출 력 하 시오
1's num : 12
2's num : 5
3's num : 8
4's num : 30
5's num : 22
< PRINT >
12 5 8 30 22
총합 : XXX
 
 */
public class Solution01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d's num : ", i + 1);
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println(" < PRINT > ");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d  ", num[i]);
		}
		System.out.println();
		System.out.println("총합 : " + sum);
		

	}
}
