package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee.employeeCntInfo();

		Employee e = new Employee("홍길동", 3300, "사원");
		Employee e2 = new Employee("강길동", 3800, "대리");
		
		e.info();
		e2.info();
		// 멤버변수로 직접 접근하시는 것은 좋지않다!
		// 멤벼변수의 변화가 있어도 알아채지 못하게 메소드로 접근하는 것이 좋다.
		Employee.employeeCntInfo();
		
	}
}

// 멤버변수는 직접 접근하지 않는 것이 좋다!

// 이클립스ide 의 경우 static 멤버변수는 이태리체로 기울어져 있다.
// static을 구분하기 위해 자신의 클래스 내부에서도 클래스 이름으로 접근하는 것이 좋다.

// static의 경우 인스턴스 객체를 몇개를 만들어 주든 가르키는 공간은 같다.
// static이 여러개인 경우 개별 공간이 생성된다.

