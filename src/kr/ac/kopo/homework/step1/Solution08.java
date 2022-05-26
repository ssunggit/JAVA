package kr.ac.kopo.homework.step1;

import java.util.Scanner;

/*
 * 8
 
화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램을
작성하시오
입력
알파벳 ) : a
변경된
값 : A
참고
> 화면에서 받은 문자열에서 한 문자 가져오기
String inputStr = sc.nextLine( );
char c = inputStr.charAt(0);

 */
public class Solution08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine( );
		char c = inputStr.charAt(0);
	
		System.out.print('c');
	}

}
