package kr.ac.kopo.day02;

import java.util.Scanner;
/*
 다중 if문
 if(조건1){
 
 }else if(조건2){
 
 }else if(조건3){
 
 }else{
 
 }
 
 !! 자바는 조건식에 boolean값만 들어갈 수 있다 정수나 실수가 그 값을 대체할 수 없다.
 */
public class IFMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("집에서 출발한 시간을 입력하세요 (ex 7시 30분 : 730) => ");
		int time = sc.nextInt();
		
		// 중첩된 if문
		if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else { //else블럭 바로 안에 if문이 나올경우 종속된 경우가 아니므로 다중 if문으로 표현가능하다!
			if (time < 815) {
				System.out.println("버스 타고 학교 간다");
			} else {
				System.out.println("택시 타고 학교 간다");
			}
		}
		
		// 다중 if문
		if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else if (time < 815) {
			System.out.println("버스 타고 학교 간다");
		} else {
			System.out.println("택시 타고 학교 간다");
			
		}
		
		if (time >= 800 && time <815) {
			System.out.println("버스 타고 학교 간다");
		} else if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else {
			System.out.println("택시 타고 학교 간다");
			
		}
		
		
		
		

	}

}
