package kr.ac.kopo.day07;

public class StringMain02 {
	public static void main(String[] args) {
					// 상수문자열 _ RAM 에 상수를 저장하는 메소드영역에저장 
					// 상수를 저장하는 영역에는 한번 생성되면 소프트웨어 종료전까지 사라지지 않는다.
					// 문자열이 바뀌는 경우에는 상수공간에 저장하면 안된다.
//		String str = "Hello";
//		String str2 = "Hello";
		
					// heap영역에 저장	
		String str = new String("Hello");
		String str2 = new String("HELLO");
		System.out.println();
		
			 // 기본자료형의 경우 대입연산자를 통해 저장하는 값이 해당 값이기때문에 그것을 비교하는 것이고,
			 // 참조자료형의 경우 저장하는 값이 주소이기 때문에 문자여르이 경우 주소를 비교하는 것이다.
			 // 동등비교의 경우 주소를 비교하는 것이다.
		if (str == str2) {
			System.out.println("주소 비교 : 같다");
		} else {
			System.out.println("주소 비교 : 다르다");
		}
		
		if (str.equals(str2)== true) {
			System.out.println("문자열 비교 : 같다");
		} else {
			System.out.println("문자열 비교 : 다르다");			
		}
		
		System.out.println("대소문자관계없이 문자열 비교 : " 
				+ str.equalsIgnoreCase(str2));
		
		String[] names = {"홍길동","홍길순", "홍길동", "박길동", "홍가네", "윤길동", "한길홍"};
	
		System.out.println("< 이름이 홍길동인 사람 출력 >");
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 성이 홍씨인 사람 출력 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름이 길동인 사람 출력 >");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름에 홍이 포함된 사람 출력 >");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
		str = "apple";
		str2 = "banana"; 
		                 // 사전순으로 크기를 비교한다
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println(str + " == " + str2);
		} else if(compare > 0) {
			System.out.println(str + " > " + str2);
		} else {// compare < 0
			System.out.println(str + " < " + str2);
		}
		
	}
}
