package kr.ac.kopo.homework.step8.teacher;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc = new Scanner(System.in);
	
	private int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
//	public void process() {
//	// 입력한 데이터가 3이라면 멈추게 do while 을 사용할 수도 있지만 
//	// while 문을 가장 많이 사용
//		loop: while(true) {
//			int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료) : ");
//			switch (type) {
//			case 1:
//				System.out.println("특정년도 선택");
//				break;
//			case 2:
//				System.out.println("특정월 선택");
//				break;
//			case 3:
//				System.out.println("종료 선택");
//				break loop;
//			}
//		}
//	}
	
	public void process() {
		while(true) {
			int year = 0;
			int month = 0;
			int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료) : ");
			CalendarUtil util = new CalendarUtil();
			switch (type) {
			case 1:
				year = getInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2:
				year = getInt("년도를 입력하세요 : ");
				month = getInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				System.exit(0); // 정상적으로 종료 
			}
		}
	}
}





