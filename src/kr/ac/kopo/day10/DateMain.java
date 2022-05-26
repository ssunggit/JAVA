package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateMain {

	public static void main(String[] args) {
		
//		String pattern = "yyyy-MM-dd hh:mm:ss(E)";
		String pattern = "yyyy년도 MM월 dd일 HH시 mm분 ss초(E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
//		int year = c.get(1);
		int year = c.get(Calendar.YEAR);
		
//		int month = c.get(2);
		int month = c.get(Calendar.MONTH) + 1;
		
		int date = c.get(Calendar.DAY_OF_MONTH);
		
		int day = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토) 
		
		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("오늘은 " + year + "년 " + month + "월 "
				+ date + "일(" + week[day] + ")입니다");
		
		
		
		
		// 2020년 5월 20일 무슨 요일인지?
		c.set(2020, 5-1, 20);
		
		day = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("2020/5/20 " + week[day] + "요일");
		
		int lastday = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastday);
		
		Date d = c.getTime();
		System.out.println(d);
				
		/*
		IceCream i = new IceCream();
		System.out.println(i.toString());
		*/
		/*
		Date d = new Date();
		// 출력할때 주소값이 아닌 d.toString()
		// toString이 object 의 toString을 오버라이딩 함
		System.out.println(d.toString());
		
		//         deprecated
		int year = d.getYear() + 1900; // 1900년부터
		int month = d.getMonth() + 1;
		int date = d.getDate();
		int day = d.getDay(); // 요일 
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + year + "년 " + month 
					+ "월 " + date + "일(" + week[day] + ")입니다" );
		*/			
	}
}
