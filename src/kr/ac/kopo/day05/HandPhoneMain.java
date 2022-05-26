package kr.ac.kopo.day05;

// 같은 자바파일 안에 클래스를 만들 수 있다.
// 단, 같은 자바 파일 내에 클래스를 만들 때는 public 이라는 접근제한자를 붙이면 안된다.
class Handphone {
	
	String name;		// 실사용자명
	String phoneNumber;	// 핸드폰번호
	String company;		// 제조사
	
}


public class HandPhoneMain {
	
	public static void main(String[] args) {
	
		Handphone hp = new Handphone();
		hp.name = "홍길동";
		hp.phoneNumber = "010-1111-2222";
		hp.company = "삼성";
	
		Handphone hp2 = new Handphone();	
		hp2.name = "강길동";
		hp2.phoneNumber = "010-3333-4444";
		hp2.company = "삼성";
		
		Handphone hp3 = new Handphone();
		hp3.name = "윤길동";
		hp3.phoneNumber = "010-5555-6666";
		hp3.company = "화웨이";
		
		Handphone[] hpArr = {hp, hp2, hp3};
		
		for(Handphone phone : hpArr) {
			System.out.println("사용자 : " + phone.name + ", 전화번호 : " + phone.phoneNumber + ", "
					+ "제조사 : " +phone.company);
		}
	}
}
