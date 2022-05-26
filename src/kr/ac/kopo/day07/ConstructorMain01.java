package kr.ac.kopo.day07;
/*
 * 생성자의 특징
 * 1. 클래스명과 동일
 * 2. 반환형이 없다
 * 3. 디폴트 생성자를 지원한다 : 클래스 내에 생성자가 존재하지 않는 경우 JVM 이 자동으로 생성
 * 4. 생성자 오버로딩을 지원
 * 5. 멤버변수의 초기화를 목적으로 사용한다. ★
 * 
 */


// 메소드 오버로딩
class Car {
	// 클래스명과 같은 생성자
	Car(){
		System.out.println("Car() 생성자 호출..." );
	}
	Car(int i){
		System.out.println("Car(int) 생성자 호출...");
	}
	Car(int i, String s ){
		System.out.println("Car(int, String) 생성자 호출...");
	}
	// 반환형을 적어준 경우 일반 메소드로 인식
	void Car(){
		System.out.println("Car() 생성자 호출..." );
	}
	
}

public class ConstructorMain01 {
	
	public static void main(String[] args) {
		// jvm 이 디폴트 생성자를 만들기때문에 에러나지 않는다.
		Car c  = new Car();
		Car c2 = new Car(10);
		Car c3 = new Car(10, "aaa");
				
	}
}
