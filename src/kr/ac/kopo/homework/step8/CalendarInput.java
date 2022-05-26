package kr.ac.kopo.homework.step8;

import java.util.Scanner;

public class CalendarInput {
	Scanner sc = new Scanner(System.in);

	void input() {
		while (true) {
			System.out.print("원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) => ");
			int choice = sc.nextInt();
			int year = 0;
			int month = 0;
			CalendarUtil c = new CalendarUtil();

			if (choice == 1) {
				System.out.print("년도를 선택하세요 : ");
				year = sc.nextInt();
				c.makeCalendar(year);

			} else if (choice == 2) {
				System.out.print("년도를 선택하세요 : ");
				year = sc.nextInt();
				System.out.print("월을 선택하세요 : ");
				month = sc.nextInt();
				c.makeCalendar(year, month);
			} else if (choice == 3) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
