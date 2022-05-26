package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain04 {
	
	public static void main(String[] args) {
		System.out.println("---main start---");
		try {
			Random r = new Random();
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num);
			
			String str = "Hello";
			System.out.println("str : " + str);
			System.out.println(str.charAt(10));
			
		}catch(ArithmeticException | StringIndexOutOfBoundsException ae) {
			System.out.println("예외처리  : " + ae.getMessage()); // 어떤 에러인지 알려줌
//			ae.printStackTrace(); 
		}
		System.out.println("---main end---");
	}
	
}

// 이러한 에러처럼 처리할 경우 프로그램을 실행시켜야만 알 수 있다.
// 런타임시 에러처리

