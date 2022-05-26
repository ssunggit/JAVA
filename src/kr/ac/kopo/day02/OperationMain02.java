package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * a 입력 : 10
 * b 입력 : 3
 * 
 * 10이 3의 배수인가? false
 * 
 * a 입력 : 10
 * b 입력 : 5
 * 
 * 10이 5의 배수인가? true
 * 
 */
public class OperationMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("b 입력 : ");
		int b = sc.nextInt();
		
		// b가 0일 경우 오류가 뜨기 때문에 앞에 b!=0 && 추가 
		// 논리연산자는 교환법칙이 성립되지 않는다!
		boolean result = (b!=0 && a % b == 0);
		
		System.out.printf("%d가 %d의 배수인가? %b\n", a, b, result);
	}

}
