package kr.ac.kopo.day06;

class 고양이{
	void 잠을잔다() {
		System.out.println("고양이를 잠을 잡니다");
	}
	
	void 냐옹거린다() {
		System.out.println("고양이는 냐옹합니다");
	}
}

class Method{
	// 메소드 오버로딩
	// 같은 클래스 내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른것.
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	// 자바는 메소드와 메소드를 구분하는 구분자는 메소드이름 + 매개변수의 타입과 갯수로 구분한다.
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(boolean b) {
		System.out.println("call(boolean) 메소드 호출...");
	}
	void call(String str, int n) {
		System.out.println("call(String, int) 메소드 호출...");
	}
	
	
}


public class MethodMain02 {
	public static void main(String[] args) {
		고양이 나비 = new 고양이();
		나비.냐옹거린다();
		
		Method m = new Method();
		m.call();
		// 피호출자 메소드 타입이 double만 있는 경우 int 타입이 doubl타입으로 묵시적 형변환이 일아남
		m.call(15);
		m.call(15.0);
		m.call(true);
		m.call("Hello", 5);
		// 매개변수의 순서를 지켜줘야한다
//		m.call(5, "Hello");
		
		
	}

}
