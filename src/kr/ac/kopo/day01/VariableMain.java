package kr.ac.kopo.day01;
/*
	기본자료형 
	논리형: boolean
	문자형: char
	정수형: byte, short, int(기본), long
	실수형: float double(기본)
	
	변수 선언
	자료형 변수명;
	
	변수 대입
	변수명 = 값;
	
	변수 초기화(선언과 동시에 값 대입)
	자료형 변수명 = 값
	
	같은 자료형의 변수 여러개 선언
	자료형 변수명1, 변수병2, 변수병3, ...;

	변수를 선언하면 램이라고 하는 메모리 공간에 잡힘 
	자바에서는 전역변수라는 개념이 없음 오로지 클래스내부에서만 변수 선언가능
	
 */
public class VariableMain {
	char b; // 멤버변수, 자동 초기화가 된다.
	public static void main(String[] args) {
		// 대문자 A를 저장하기 위한 변수 a 선언
		char a; // 지역변수, 초기화가 자동설정X
		a='A';
		// 라이프사이클이 블럭스코프 형태를 가진다. 블럭이 시작되면 만들어지고 블럭이 끝나면 사라진다. 
		// System.out.println(a);
		// 가비지값 : 변수공간안에 값을 지정하지 않고 사용하는 것 
		// 메소드 안에 선언된 변수는 지역변수이다.
		
		// 정수 123를 저장하기 위한 변수 c선언
		int c = 123;
		
		// 실수 3개를 저장하기 위한 변수 d1, d2, d3 선언
		double d1, d2, d3 = 12.34;
		// 여러개의 변수가 선언되었을때 중간에 초기화가 일어난다면 그 뒷변수도 초기화를 해주는 것이 좋다.
		
		System.out.println(a);
		System.out.println(c);
		
		
	}

}
