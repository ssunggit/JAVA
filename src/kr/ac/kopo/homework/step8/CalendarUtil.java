package kr.ac.kopo.homework.step8;

/*

원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) => 1
년도를 선택하세요 : 2022
< 2022년 1월 >
일  월  화  수  목  금  토
                    1
2  3  4  5

< 2022년 2월 >
...
< 2022년 12월 >

원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) => 2
년도를 선택하세요 : 2022
월을 선택하세요 : 4
< 2022년 4월 >
일  월  화  수  목  금  토
                1   2
3   4

원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) => 3

 */
import java.util.Calendar;

public class CalendarUtil {
	public int year;
	public int month=1;

	void makeCalendar(int year) {
		Calendar c = Calendar.getInstance();
		
		System.out.println("< " + year + "년 " + month + "월 >");
		this.year = year;
		c.set(year, month - 1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		if (month < 13) {
			this.month++;
		}
		showCalendar(week, lastDay, month);

	}

	void makeCalendar(int year, int month) {
		System.out.println("< " + year + "년 " + month + "월 >");
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		showCalendar(week, lastDay);
	}

	private void showCalendar(int week, int lastDay) {

		System.out.println("일\t월\t화\t수\t목\t금\t토");

		int cnt = 0;
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
			++cnt;
		}

		for (int date = 1; date <= lastDay; date++) {
			System.out.print(date + "\t");
			if (++cnt % 7 == 0) {
				System.out.println();
			}
		}

		if (cnt % 7 != 0) {
			System.out.println();
		}
		System.out.println("----------------------------------------------------");
	}

	private void showCalendar(int week, int lastDay, int month) {

		System.out.println("일\t월\t화\t수\t목\t금\t토");

		int cnt = 0;
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
			++cnt;
		}

		for (int date = 1; date <= lastDay; date++) {
			System.out.print(date + "\t");
			if (++cnt % 7 == 0) {
				System.out.println();
			}
		}

		if (cnt % 7 != 0) {
			System.out.println();
		}
		System.out.println("----------------------------------------------------");

		if(month < 13) {
			makeCalendar(year);
		}
	}

}
