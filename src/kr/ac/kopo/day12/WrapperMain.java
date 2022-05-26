package kr.ac.kopo.day12;

/*
 * 
 * Wrapper Class : 기본자료형의 변수를 참조자료형으로 갖게하는 클래스
 * 
 * 
	기본자료형			Wrapper Class
	boolean			Boolean
	char			Character
	byte			Byte
	short			Short
	int 			Integer
	long			Long
	float			Float
	double			Double
	

class Boolean {
	private boolean value;
	
*/
public class WrapperMain {
	public static void main(String[] args) {
			
			int i = 100;
							// Wrapper Class를 객체화시킬 필요가 없음
			Integer i2 = new Integer(100);
			Integer i5 = Integer.valueOf(100);
			Integer i3 = 100;	// auto boxing
			int i4 = new Integer(100);	// auto unboxing
			
								// 숫자스트링을 정수로 바꿈
			System.out.println(Integer.parseInt("123") + 100);
								// 옛날에는 아래 코드가 정수화가 안됨-> 오토언박싱의 등장으로 가능
			System.out.println(Integer.valueOf("123") + 100);
	}
}
