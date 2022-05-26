package kr.ac.kopo.day12;

public class MapMain03 {
	
	public static void main(String[] args) {
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		// object의 equals 메소드는 주소값을 비교한다.
		if(m.equals(m2)) {
			System.out.println("m == m2");
		} else {
			System.out.println("m != m2");
		}
		
			
		String s01 = new String("hello");
		String s02 = new String("hello");
		// 객체와 객체가 같은지 비교하려면 .equals 
		// string 클래스의 .equals 
		if(s01.equals(s02)) {
			System.out.println("s01 == s02");
		} else {
			System.out.println("s01 != s02");
		}
		
	}
}
