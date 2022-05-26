package kr.ac.kopo.day07;

public class ConstructorMain02 {
	
	public static void main(String[] args) {
		
		Member m = new Member();
		// 은닉성 위반: 다른클래스에서 멤버변수의 값을 수정하도록 하면 안된다.
//		m.name = "홍길동";
		
		// 생성자 형태로 멤버변수의 값을 수정한다.
		Member m2 = new Member("홍길동");
		
		Member m3 = new Member("윤길동", 22);
		
		Member m4 = new Member("한길동", 22, "O");
		
		m.info();
		
		m2.info();
		
		m3.info();
		
		m4.info();
	}
}
