package kr.ac.kopo.homework.step1;

import java.util.Scanner;

/*
 * 4
 
4. 화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면
에 출력하시오

정수를 입력하세요 : 10
나눌 수를 입력하세요 7

몫
: 1
나머지
: 3

 */
public class Solution04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int number1 = sc.nextInt();
		
		System.out.print("나눌 수를 입력하세요 : ");
		
		int number2 = sc.nextInt();
		System.out.println();
		
		System.out.printf("몫: %d\n나머지: %d",number1/number2, number1%number2);
	}

}
