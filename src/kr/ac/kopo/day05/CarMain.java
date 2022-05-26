package kr.ac.kopo.day05;

// 실행클래스
// 프로그램 만들기위햐서는 하나의 실행클래스와 여러개의 참조클래스를 가진다.
public class CarMain {
	// 프로그램의 시작과 끝은 메인메소드에서 알려준다.
	public static void main(String[] args) {
		// 인스턴스 객체 : new 클래스명();
		// heap 영역에 할당된다
		
		// heap영역에서는 이름을 기억하지 못하기때문에 참조변수를 만들어준다.
		Car c = new Car();
		c.name = "소나타";
		c.company = "현대";
		
		Car c2 = new Car();
		c2.name = "K9";
		c2.company="기아";
		
		System.out.println("첫번째 자동차먕 : " + c.name);
		System.out.println("두번째 자동차명 : " + c2.name);
	}
}
