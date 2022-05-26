package kr.ac.kopo.day09;

public class mainproject{
	public static void main(String args[]) {
		car car = null;
		fireengine fe = new fireengine();//fireengine 클래스 생성
		fireengine fe2= null;
		
		fe.water();//fireengine 클래스의 water 메서드 호출
		car = fe; //참조변수의 형 변환을 나타냄((car)생략)
		fe2= (fireengine)car;//조상타입에서 자손타입으로 형 변환, 이 경우에는 형 변환 생략이 불가능 함.
		fe2.water();//fireengine 클래스의 water 메서드를 호출함
		
	}
}

class car{
	String color;
	int door;
	
	void drive() {//운전하는 기능을 호출하는 메서드
		System.out.println("drive,Brrrrr~");
	}
	
	void stop() {//멈추는 기능을 호출하는 메서드
		System.out.println("stop!!!!");
	}
}

class fireengine extends car{//fireengine 클래스는 car 클래스의 자손 클래스
	void water() {
		System.out.println("water!!!");
	}
	
}