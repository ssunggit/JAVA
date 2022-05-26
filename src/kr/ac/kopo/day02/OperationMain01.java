package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {
		int a = 1, b = 0, c=-1;
		// 관계연산자의 우선순위가 논리연산자 보다 높다
		//  ++a > 1 가 참이라서 뒤에 연산을 하지 않는다.
		//boolean bool = ++a > 1 || ++b > 1;
		
		// &&가 ||보다 우선순위가 높다
//		boolean bool = (--a > 1 && ++b > 1);
//		boolean bool = --a > 1 && ++b > 1 || ++c > 0;
		
//		boolean bool = a++ > 0 || (b-- >= 0 && ++c > 0);
		boolean bool = a++ > 0 || b-- >= 0 && ++c > 0;
		
		System.out.println("bool : " + bool);
		
		// a : 2 , b : 0 
		// 논리연산자(||) 앞의 연산이 참이기 때문에 b의 연산은 하지 않는다. 
		//System.out.println("a : "+ a +", b : " + b);
		
		// &&가 ||보다 우선순위가 높다 -> a의 연산이 거짓이기때문에 b의 연산은 하지않고 a와 b의 연산이 거짓이기때문에 c의 연산은 한다.
		
		// a++ > 0와 (b-- >= 0 && ++c > 0)를 || 연산한다.
		System.out.println("a : "+ a +", b : " + b + " c : " + c);
		
	
	}

}
