package kr.ac.kopo.day07;

// 지역변수 = 갈색
// 멤버변수 = 파란색
public class Member {
	String	name;
	int		age;
	String	bloodType;
	
	// 변수값이 바뀌지 않을때는 이렇게 사용
//	String	name="알수없음";
//	int		age =-1;
//	String	bloodType"알수없음";
	
//	Member(){
//		this("알수없음", -1, "알수없음");
//	}
	// 매개변수가 하나인 Member(String name)생성자를 호출한다.
	// 단, 메소드를 타고 타고 들어갈 경우 속도가 느려지기 때문에 성능이 떨어진다.
	Member(){
		this("알수없음");
	}
	
	// 매개변수가 없는 경우 this가 생략 가능하다.
//	Member(){
//		this.name = "알수없음";
//		age = -1;
//		bloodType = "알수없음";
//	}
	
//	Member(String name){
//		this(name, -1, "알수없음");
//	}
	Member(String name){
		this(name, -1);
	}
//	Member(String name){
//		this.name = name;
//		this.age = -1;
//		this.bloodType ="알수없음";
//	}
	
	// 생성자호출이라고 생각하지 않고 메소드호출이라고 생각한다.
	// 자바에서는 뉴를 썼을때만 생성자 호출이라고 생각한다.
	Member(String name, int age) {
		// 생성자호출이라고 생각하지 않고 메소드호출이라고 생각한다.
		// 자바에서는 뉴를 썼을때만 생성자 호출이라고 생각한다.
//		Member(name, age, "알수없음");
		
		// 생성자에서 다른 오버로딩된 생성자를 호출 경우 this사용
		// 반드시 첫줄에 써야한다.
		this(name, age, "알수없음");
	
	}
//	Member(String name, int age) {
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알수없음";
//	}
//	
	
//	Member(String n, int a, String bt) {
//		name = n;
//		age = a;
//		bloodType = bt;
//	}
	
	
	// 멤버변수와 지역변수이름을 같게 할 경우 멤버변수와 지역변수의 우선순위가 애매하다.
	// 지역변수 우선순위가 멤버변수보다 더 높다.
	// 멤버변수의 경우 this 키워드를 쓴다.
	// 멤버변수만 this 키워드를 사용가능 한다.
	// 메소드 내에서 지역변수와 멤버변수를 구분하기 위해 사용한다.
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	
	void info() {
		// 자신의 인스턴스 객체가 heap에서 살아있을때까지 살아있는다.
		System.out.println("이름 : " + name + ", 나이 : " + age+", 혈액형 : " + bloodType);
		
	}
	
	
}
