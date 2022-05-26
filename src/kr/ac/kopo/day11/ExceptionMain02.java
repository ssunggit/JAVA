package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {
	
	public static void main(String[] args) {
		System.out.println("---main start---");
		try {
			Random r = new Random();
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num);
		}catch(ArithmeticException ae) {
			System.out.println("예외발생  : " + ae.getMessage()); // 어떤 에러인지 알려줌
			ae.printStackTrace(); // 어디서 에러가 나오는지 알랴줌
		}
		System.out.println("---main end---");
	}
	
}

