package kr.ac.kopo.day06;

import java.util.Scanner;
// 버퍼 
public class ScannerMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		// nextLine() 의 경우 엔터까지 소비한다.
		String str = sc.nextLine();
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println("str : " + str + ", num : " + num);
		

		System.out.println("=================버퍼해결법 1====================");
		// nextInt() 에서 친 엔터가 버퍼에 남아있다.
		System.out.print("정수 : ");
		
		int num2 = sc.nextInt();
		// 버퍼에 남아있는 엔터를 소비한다.
		sc.nextLine();
		
		System.out.print("문자열 : ");
		String str2 = sc.nextLine();
		
		System.out.println("str : " + str2 + ", num : " + num2);
		
		
		System.out.println("=================버퍼해결법 2====================");
		System.out.print("실수 : ");
		double f = Double.parseDouble(sc.nextLine());
//		double f = sc.nextDouble();
//		sc.nextLine();
		
		System.out.print("정수 : ");

		// nextLine() 입력된 문자열을 정수로 바꿔주는 메소드
		int num3 = Integer.parseInt(sc.nextLine());
		sc.nextLine();
		
		System.out.print("문자열 : ");
		String str3 = sc.nextLine();
		
		System.out.println("str : " + str3 + ", num : " + num3);
		
		
		/*
		 
		// 버퍼를 사용하기 때문에 엔터를 치지 않고 [10 20 30] 으로 입력해도 num1, num2, num3에 입력된다.
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		
		System.out.println("num : " + num 
				+ ", num2 : " + num2 + ", num3 : " + num3);		
		*/
	}
}











