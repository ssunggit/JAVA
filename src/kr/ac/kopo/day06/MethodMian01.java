package kr.ac.kopo.day06;
/*
 
  **********
  Hello
  **********
  Hi
  **********
  Bye
  **********
  
 */
/* 메소드 정의
 	반환형 메소드명([파라미터]){
 		문장;
 	}
 */
// 수정의 용이성을 위해 메소드가 등장
// 모든 메소드는 클래스 안에 정의되어야한다.
public class MethodMian01 {
	
	// 메소드 정의의 경우 반환형 메소드명()
	// 메인함수(static)에서 사용하기위해 static을 붙여줌
	
	// 리턴타입에 맞게 반환형을 정해준다
	static int printStar(char ch, int cnt) {
		for(int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
		
		// return 값; : 피호출자가 호출자에게 전달하는 부분
		// 피호출자가 전달할 수 있는 값은 반드시 0, 1개이다
		return ch + cnt;
	}
	
	static void aaa() {
		boolean bool = true;
		System.out.println("A");
		System.out.println("B");
		if(bool) {
			return;
		}
		System.out.println("C");
		System.out.println("D");
		return;
	}
	
	
	public static void main(String[] args) {
//		aaa();
		// 메소드 호출부의 경우 반환형을 쓰지않고 메소드명()
			
		// 피호출자가 retuen으로 전달한 값이 code에 저장
		int code = printStar('*', 10);
		System.out.println("Hello");
		printStar('!', 20);
		System.out.println("Hi");
		printStar('-', 5);
		System.out.println("Bye");
		printStar('#', 8);
		
	}
}

// 메소드의 경우 코드의 횟수를 줄인것이 아니라 코드의 수정이 용이해짐