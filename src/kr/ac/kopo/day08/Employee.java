package kr.ac.kopo.day08;
// 필드(멤버변수)값은 외부에 공개하지 않는다.
public class Employee {

	String 	name;
	int 	salary;
	String 	grade;
	static int employeeCnt = 0; // 총 사원수
	
	// static을 구분하기 위해 자신의 클래스 내부에서도 클래스 이름으로 접근하는 것이 좋다.
	Employee() {
		Employee.employeeCnt++;		
	}
	
	// 매개변수가 있는 생성자를 만들어 줄때에는 매개변수가 아예없는 기본 생성자를 만들어 주는 것이 좋다.
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		// 겍체가 생성될 때 마다 사원수 증가
		Employee.employeeCnt++;
		
	}
	
	void info() {
		System.out.println("사원명 : " + name 
				+ ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}
	// non-static의 경우 객체를 생성할때만 사용가능하기때문에 
	// static 변수를 실행시키는 메소드도 static메소드로 만들어 준다.
	static void employeeCntInfo() {
		System.out.println("총 사원수  : " + Employee.employeeCnt + "명");
		// out은 System 클래스로 접근하는 static 변수 
	}
	
	
}




