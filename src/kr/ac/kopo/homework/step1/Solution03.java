package kr.ac.kopo.homework.step1;

import java.util.Scanner;

/*
 * 3
 
반지름이 10 인 원의 면적을 구해서 출력하시오 키 보 드 입 력
참고
: 원주율 3.141592
결과출력
: 원의 면적은 143.1234 입니다

 */
public class Solution03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력해주세요: ");
		
		int radius = sc.nextInt();
		
		final double PI = 3.141592;

		System.out.printf("원의 면적은 %.4f 입니다", PI*radius*radius);
	}

}
