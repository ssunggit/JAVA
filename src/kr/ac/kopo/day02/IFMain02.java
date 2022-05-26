package kr.ac.kopo.day02;

import java.util.Scanner;

/*
	
	if(조건1){
		문장1; // 조건1 참이라면 문장1을 수행
	}else{
		if(조건2){
			문장2; // 조건1이 거짓인거 중에서 조건2가 참인거라면 문장 2를 수행
		} else {
			문장3;
		}
	}
	
	출발한 시간을 입력하세요(ex 7시 30분 : 730) => 807
 	버스를 탑니다
 */
public class IFMain02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("집에서 출발한 시간을 입력하세요 (ex 7시 30분 : 730) => ");
		int time = sc.nextInt();
		// if문의 조건실행문이 한줄이라면 {}를 안붙여도 되지만 처음에는 {}를 작성해서 연습하자. 
		if (time < 815) {
			if (time < 800) {
				System.out.println("걸어서 학교에 간다");
			} else {
				System.out.println("버스 타고 학교 간다");
			}
		} else {
			System.out.println("택시 타고 학교 간다");
		}

		// 조건식은 범위가 큰 거부터 줄여나가도 되고,
		// 작은 범위부터 크게 나가도 된다. -> 중간부터 나아가게 된다면 코드짜기가 복잡.
		if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else {
			if (time < 815) {
				System.out.println("버스 타고 학교 간다");
			} else {
				System.out.println("택시 타고 학교 간다");
			}
		}

		
	}

}
