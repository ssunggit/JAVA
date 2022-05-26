package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain01 {
	
	public static void main(String[] args) {
		System.out.println("---main start---");
		Random r = new Random();
		int num = r.nextInt(3);	// 0, 1, 2
		System.out.println("num : " + num);
		System.out.println(10 / num);
		// 예외 발생시 프로그램이 종료되며  System.out.println("---main end---");이 실행되지 않는다
		System.out.println("---main end---");
		
	}
	
}
