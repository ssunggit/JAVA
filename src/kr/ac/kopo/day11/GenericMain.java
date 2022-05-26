package kr.ac.kopo.day11;

import java.util.Random;

class A {
	private Object data;
	
	A(Object data) {
		this.data = data;
	}
	
	Object getData() {
		return data;
	}
	
	void setData(Object data) {
		this.data = data;
	}
}
	   // T : 데이터형
class B<T>{
	private T data;
	B(T data){
		this.data = data;
	}
	T getData() {
		return data;
	}
	
	void setData(T data) {
		this.data = data;
	}
}


public class GenericMain {

	public static void main(String[] args) {
		
		
		B<String> b = new B<String>(new String("Hello"));
		// String 형으로 받아짐 
		System.out.println("길이 : " + b.getData().length());
		
		B<Random> b2 = new B<Random>(new Random());
		System.out.println("추출된 정수 : " + b2.getData().nextInt(10) + 1);
		
		// Generic 을 사용하면 데이터형을 잘못썼을 때 컴파일 오류가 일어남 
//		B<String> b3 = new B<String>(new IceCream());
//		b3.setData(3);
		
		B<String> b3 = new B<String>("abc");
		b3.setData("aa");
		
		
		
		
		
		A a = new A(new String("hello"));
					  // 명시적 형변환
		String data = (String)a.getData();
		System.out.println("길이 : " + data.length());
		
		A a2 = new A(new Random());
					// Object형이기 때문에 모든 데이터형이 가능해서 데이터형을 잘못써도 컴파일 오류가 뜨지 않는다.
		int random = ((Random)a2.getData()).nextInt(10) + 1;
		System.out.println("추출된 정수 : " +  random);
		
	}
}










