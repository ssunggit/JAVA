package kr.ac.kopo.day02;

public class SwitchMain02 {

	public static void main(String[] args) {
		String a = new String("Hello");

		System.out.println(a=="Hello");
		// false 
		// "Hello"는 힙영역에 있다.
		// 참조형 변수인 a는 "Hello"를 담고있는 주소를 저장하고 있다.
		// 문자열을 비교할때는 동등비교 사용 불가능
		
		System.out.println(a.equals("Hello"));
		// true
		
		String str = new String("Hello");
		
		// switch문은 문자열 비교가 가능하다
		// if문은 문자열을 비교할 때 .equals()을 사용해야한다.
		switch (str) {
		case "Hello":
			System.out.println("TRUE");
			break;
		default:
			System.out.println("FALSE");
		}
		
		
	}
	
}
