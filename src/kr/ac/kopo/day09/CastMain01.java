package kr.ac.kopo.day09;
// 묵시적 형변환
public class CastMain01 {
	/*
	public static void print(Child01 c) {
		c.print();
	}
	
	public static void print(Child02 c) {
		c.print();
	}
	*/
	
	
							// 묵시적 형변환
	// 부모클래스의 참조변수로 자식클래스의 메소드를 호출
	public static void print(Parent p) {
		p.print();
		
//		Child01 c = (Child01)p;
//		c.study();
//		c.sleep();
		
		// instanceof 상속관계에서만 사용
		// p가 가르키는 객체가 Child01 형인지 판단
//		System.out.println("Child01 : " + (p instanceof Child01));
//		System.out.println("Child02 : " + (p instanceof Child02));
//		System.out.println("Parent : " + (p instanceof Parent));
			if (p instanceof Child01) {
				// 명시적 형변환
				Child01 c = (Child01)p;
				c.study();
				c.sleep();
			}else if(p instanceof Child02) {
				Child02 c = (Child02)p;
				c.sing();
				c.play();
				
			}
	
	}
	
	
	
	public static void main(String[] args) {
		
		print(new Child01());
		System.out.println("-------------------------------------");
		print(new Child02());
		System.out.println("-------------------------------------");
		print(new Parent());
		
		/*
		Child01 c01 = new Child01();
		print(c01);
		
//		Child01 c01 = new Child01();
//		c01.print();
		
		Child02 c02 = new Child02();
		print(c02);
//		c02.print();
		
		Parent p = new Parent();
		print(p);
//		p.print();
		
		Parent p2 = new Child01();
		*/
		
	}
}
