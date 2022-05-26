package kr.ac.kopo.day02;

import java.util.Scanner;

/*
  1~3사이의 정수 입력:
  1입력시 "ONE" 출력
  2입력시 "TWO"
  3입력시 "THREE"
  그 외 "EROOR"	
 */

/*
 * if문의 일반적인 형태는 n개중에 1개를 선택한다
 * switch문은 n개중에서 m개가 선택가능하다 -> 다중선택문
 */
public class SwitchMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 사이의 정수 입력: ");
		
		int num = sc.nextInt();
		
		// case안에서는 {}가 아무의미가 x
		// case : 어디서부터 시작하던 간에 마지막까지 읽는다. 
		// ex) num =2 -> TWO THREE EROOR
		// switch문을 빠져나오기 위해서 break문 사용
		// break문은 switch문, 반복문에서만 사용1
		// default문은 위치가 어디에 있든 case문을 다 수행하고 나서 수행된다
		// switch(수식) : 수식구문에는 byte, short, char, int, enum, String 이 가능
		switch(num) {
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		default :	
			System.out.println("EROOR");
		
		}
		
		
		// if문
		if(num == 1) {
			System.out.println("ONE");
		}
		if(num == 2) {
			System.out.println("TWO");
		}
		if(num == 3) {
			System.out.println("THREE");
		}else {
			//바로 위에 줄인 3이 아닐때 다 출력된다
			System.out.println("ERROR");
		}
		
		// 다중 if문
		if(num == 1) {
			System.out.println("ONE");
		}else if(num == 2) {
			System.out.println("TWO");
		}else if(num == 3) {
			System.out.println("THREE");
		}else {
			System.out.println("ERROR");
		}
		// num에 대하여 동등 비교를 하고 있다
		// -> Switch문으로 작성

		
		
	}

}
