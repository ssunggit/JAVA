package kr.ac.kopo.day01;

public class VariableMain02 {

	public static void main(String[] args) {
		// "Hello" 문자열을 저장하기 위한 변수 str 선언
//		String str;
//		str="Hello";
		
//		String str = "Hello";
		// String 클래스는 new라는 키워드를 사용하지 않고 이용가능하지만 변수값에는 주소가 저장이되기때문에
		// new 키워드를 사용해서 선언하자

		String str= new String("Hello");
		// 참조형 변수: 실제 값으로 가지고 있지않고 주소를 가지고 있는 변수
		System.out.println(str);
			
	}

}
