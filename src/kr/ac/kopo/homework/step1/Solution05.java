package kr.ac.kopo.homework.step1;

import java.util.Scanner;

/*
 * 5
 
1 달러는 현재 1,092.50 원 입니다 . 화면에서 달러를 입력 받아 원화로 보여주는 프로그램을
작성하세요
달러를
입력하세요 ? 10
원화
: 10925.00 원

 */
public class Solution05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달러를 입력하세요 : ");
		int dollar	=sc.nextInt();
		
		double won = 1092.50;
		
		System.out.printf("원화 : %.2f 원",dollar*won);
	}

}
