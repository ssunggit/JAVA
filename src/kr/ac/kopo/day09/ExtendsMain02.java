package kr.ac.kopo.day09;
// 자바의 경우 Object 는 무조건 상속받는다
class A {
	A() {
		System.out.println("A() 호출...");
	}
}

class B extends A {
	B() {
		//super(); 숨어있음 --> A
		System.out.println("B() 호출...");
	}
}

class C extends B {
	C() {
		//super(); 숨어있음 --> B
		System.out.println("C() 호출...");
	}
}

public class ExtendsMain02 {

	public static void main(String[] args) {
	
//		new A();
//		new B();
		new C();
	}
}
