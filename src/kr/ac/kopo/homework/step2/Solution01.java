package kr.ac.kopo.homework.step2;

import java.util.Scanner;

/* 1
 1. 정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 코드를 작성
1 - 100사이의 정수를 입력 : 60
< 1 ~ 60 정수 출력 >
1 2 3 .... 60
 */
public class Solution01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100사이의 정수를 입력 : ");
		int number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.print(i+" ");
		}
		
		
	}
	
}
