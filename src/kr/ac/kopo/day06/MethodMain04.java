package kr.ac.kopo.day06;


public class MethodMain04 {
	
	public static void main(String[] args) {
		GuGudan gu = new GuGudan();

		System.out.print("2 - 9 단을 입력하세요 : ");
		int dan = gu.getDan();
		
		gu.print(dan);	
		gu.print();
		
		System.out.print("시작 단을 입력하세요 : ");
		int startDan = gu.getDan();

		System.out.print("종료 단을 입력하세요 : ");
		int endDan = gu.getDan();
		
	}



}

// 클래스에 정의된 멤버변수는 매개변수나 리턴타입을 거치지 않더라도 사용가능하다.