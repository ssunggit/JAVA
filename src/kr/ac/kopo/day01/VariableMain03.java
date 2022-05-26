package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String[] args) {
		
		int a;
		byte b = 10;
		// 오른쪽에 있는 b값이 변수 a에 저장
		// = : 대입연산다 기본적으로는 대입연산자의 왼쪽과 오른쪽이 자료형이 같아야한다.
		// 연산자를 기준으로 좌측과 우측의 자료형이 같지않을 경우 형변환이 일어난다. -> 기본자료형
		
		
		// 묵시적 형변환: 큰 자료형 타입에 작은 자료형을 대입
		//			: 형변환 코드를 생략할 수 있다.
		// 형변환 코드 없이도 컴파일 시점에 오류가 나지 않는다.
		a = b; // int = byte
		a = (int)b; // int = (int)byte
		
		// 명시적 형변환: 작은 자료형 타입에 큰 자료형을 대입
		//			: 형변환 코드를 생략할 수없다.
		// 형변환 코드를 명시하지 않으면 컴파일 시점에 오류가 난다.
		b = (byte)a;
		
		System.out.println(10 + 20); // int + int 
		// 큰수의 데이터 타입을 따라간다 
		System.out.println((double)10 + 20.0);
		System.out.println(10 + 20.0);
		
		System.out.println(10 + (int)20.0);
		
		// 더하기연산에서 형변환이 일어남
		double d = 10 + 20.2;
		System.out.println(d);
		
		// 더하기 연산이 대입연산자보다 우선순위가 높아서 먼저 계산된다.
		// 그렇기때문에 명시적 형변환이 필요
		int c = (int)(10 + 20.2); 
		System.out.println(c);
		
		// 상수 변경될 수 없는 데이터를 담는다.
		// 상수는 반드시 모든 글자를 대문자로 쓴다.
		final int NUM = 100;
		System.out.println("num: " + NUM);
		// NUM = 20;
		// 값 수정이 불가하다.
		System.out.println("num: " + NUM);
		
		char ch = '!';
		// 문자의 작은 따옴표를 나타내는 것이 아닌 그냥 문자라고 표기할때 \를 붙인다
		ch = '\'';
		ch = '\n';
		// 자바는 \가 나오면 그 다음을 문자로 인식한다-> \를 두번 쓴다.
		ch = '\\';
		String path = "D:\\Lecture\\java-workspace";
		System.out.println(path);
		
		String str = "\"ab\"";
		System.out.println(str);
	}

}
