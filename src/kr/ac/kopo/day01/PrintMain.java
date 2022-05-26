package kr.ac.kopo.day01;
//주석문의 경우 컴파일시 반영 되지 않는다. 개발자가 자신의 코드를 설명하기 위한 목적
// 여러줄 주석 코드안에 다중 주석처리가 안됨 즉 /**/ 안에 /**/ 쓰면 안됨

/*
여러줄
주석이
가능합니다
 */

// 한줄 주석이 가능

/*
 상수종류
 1. 정수형 상수
 2. 실수형 상수
 3. 문자형 상수: 대문자('A'), 소문자('a'), 숫자문자('1'), 특수문자('!'), 
 			  공백문자(스페이스(' '), 엔터('\n'), 탭('\t')),
 			  한글('가')
 4. 문자열 상수("abc")
 5. 논리형 상수(true, false)
 */

/*
 출력메소드
 1. println()	: 개행문자 포함
 2. print()		: 개행문자 포함X
 3. printf()	: JDK1.5 추가, 개행문자 포함X, 출력문자 형태
 				: 쌍따옴표안에 문자열들만 출력하는 것이 목적 -> 출력문자를 쓴다.
	출력문자(포맷문자) 
	%d	: 정수
	%f	: 실수
	%c	: 문자
	%s	: 문자열
	%b	: 논리
	
 					
 */

public class PrintMain {
	public static void main(String[] args) {
		System.out.println(10); // ln의 경우 줄바꿈 -> 개행문자
		System.out.println(13.14); 
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true); 
		
		// 하나의 출력문안에 여러개의 문자타입을 쓰고싶을 때 방법들
		System.out.println("23살"); 
		System.out.print(23); 
		System.out.println("살");
		System.out.println(23 + "살"); // + : 이어 붙이기
		
		// 10 + 20 = 30
		System.out.println(10 + " + " + 20 + " = " + 10 + 20); // 10 + 20 = 1020
		System.out.println(10 + " + " + 20 + " = " + (10 + 20)); // 10 + 20 = 30 
		
		System.out.printf("%d살\n", 23); //공백문자로 줄바꿈함
		System.out.println(); //출력없이 줄바꿈만 함
		System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
	
		System.out.printf("[%7d]\n", 1200); // 7자리로 출력하여 기본적으로 오른쪽 정렬
		System.out.printf("[%7d]\n", 950);
		System.out.printf("[%-7d]\n", 15800); // 7자리로 출력하여 왼쪽 정렬 
		System.out.printf("[%04d]\n", 45); // 4자리로 출력하며 빈자리 0으로 채움 
		System.out.printf("[%f]\n", 12.2456); // 기본적으로 소수점 6번째자리까지 출력 
		System.out.printf("[%.2f]\n", 12.2456); // 소수점 2번째자리까지 출력되며 반올림이 됨
		System.out.printf("%b\n", true);
		System.out.printf( "오늘 점심은 %d시에 %s" , 12, "강남식당");

	}

}
