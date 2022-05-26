package kr.ac.kopo.homework.step5;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			StringUtil su = new StringUtil();
			System.out.print("1-2. 문자를 입력하세요 : ");
			char c = sc.nextLine().charAt(0);
			System.out.println("대문자 인가요? "+su.isUpperChar(c));
			System.out.println("소문자 인가요? "+su.isLowerChar(c));
			
			System.out.print("3-4. 숫자를 입력하세요 : ");
			int i = Integer.parseInt(sc.nextLine());
			System.out.print("3-4. 숫자를 입력하세요 : ");
			int j = Integer.parseInt(sc.nextLine());
			System.out.println("큰 수 : "+su.max(i,j));
			System.out.println("작은 수 : "+su.min(i,j));
			
			System.out.print("5-7. 문자열를 입력하세요 : ");
			String str = sc.nextLine();
			System.out.println("reverseString : " + su.reverseString(str));
			System.out.println("toUpperString : " + su.toUpperString(str));
			System.out.println("toLowerString : " + su.toLowerString(str));	
			
			System.out.println("8. Calculator");
			Calculator cal = new Calculator();
			System.out.print("정수를 입력하세요 : " );		
			int num1 = sc.nextInt();
			System.out.print("정수를 입력하세요 : " );
			int num2 = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n", num1, num2, cal.plus(num1, num2));
			System.out.printf("%d - %d = %d\n", num1, num2, cal.minus(num1, num2));
			System.out.printf("%d * %d = %d\n", num1, num2, cal.multiplication(num1, num2));
			System.out.printf("%d / %d = %.1f\n", num1, num2, cal.division(num1, num2));
			
			System.out.println(num1+" 소수 : "+ cal.primeNumber(num1));
			System.out.println(num2+" 소수 : "+ cal.primeNumber(num2));
			
			
			System.out.println("9. Icecream");
			
			IcecreamMethod.input();
			
			
		}
}
