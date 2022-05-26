package kr.ac.kopo.homework.step3;

import java.util.Scanner;
/*
 
 5개의 짝수를 입력받아 출력하는 코드를 작성
1's 정수 : 12
2's 정수 : 5
2's 정수 : 20
3's 정수 : 10
4's 정수 : 26
5's 정수 : 5
5's 정수 : 11
5's 정수 : 4
< 5개의 정수 출력 >
12 20 10 26 4
  
 */


public class Solution03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int index = 0;
		while (index < arr.length) {
			System.out.printf("%d's 정수 : ",index+1);
			int input = sc.nextInt();
			if(input%2==0) {
				arr[index]=input;
				index++;
			}
		}

		System.out.println("< 5개의 정수 출력 >");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}
