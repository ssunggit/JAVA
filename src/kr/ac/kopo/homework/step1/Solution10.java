package kr.ac.kopo.homework.step1;

import java.util.Scanner;

/*
 * 10
 정수 3 개를 입력받아 큰수에서 작은수순으로 출력하는 코드를 작성
첫번째
정수 : 12
두번째
정수 : 26
세번째
정수 : 16
2
6 16 12

 */
public class Solution10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("첫번째 정수 : ");
		int number1 = sc.nextInt( );
		
		System.out.print("두번째 정수 : ");
		int number2 = sc.nextInt( );
		
		System.out.print("세번째 정수 : ");
		int number3 = sc.nextInt( );
		int max=0, mid=0, min=0;
		
		if(number1>number2&&number1>number3) {
			max=number1;
			if(number2>number3){
				mid = number2;
				min = number3;
			}else {
				mid = number3;
				min = number2;
			}
		}else if(number2>number1&&number2>number3) {
			max=number2;
			if(number1>number3){
				mid = number1;
				min = number3;
			}else {
				mid = number3;
				min = number1;
			}
		}else if(number3>number2&&number3>number1){
			max=number3;
			if(number2>number1){
				mid = number2;
				min = number1;
			}else {
				mid = number1;
				min = number2;
			}
			
		}
		
		System.out.print(max+" ");
		System.out.print(mid+" ");
		System.out.print(min);
	}
}
