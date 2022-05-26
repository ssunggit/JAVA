package kr.ac.kopo.homework.step1;

import java.util.Scanner;

/*
 * 2
 
3661 초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오 키 보 드 입 력
결과출력
1 시간 1 분 1 초

 */
public class Solution02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초단위로 입력해주세요: ");
		
		int time = sc.nextInt();
		
		int second = time % 60;
		int minute = time / 60;
		int hour = minute / 60;
		int realMinute = minute-(hour*60);

		System.out.printf("%d 시간 %d 분 %d 초", hour, realMinute, second);
	}

}
