package kr.ac.kopo.day08.extend;
// 관리자(Manager02)는 사원(Employee)의 한 형태이다. 조건부합 => 상속관계 표현
public class Maneger02 extends Employee {
	
	Employee[] empList; // 관리사원목록
	
	// 기본생성자
	Maneger02(){};
	
	// 상위 클래스의 멤버변수가 private 로 작성되어 있는 경우 접근하지 못하기 때문에 아래 코드는 에러난다
	Maneger02(String name, int salary, String grade, Employee[] empList){
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	// 메소드 오버라이딩을 알려주는 어노테이션 (코드주석)
	// 부모클래스에 있는 메소드를 오버라이드함
	// @Override 어노테이션을 붙이는 순간 컴파일 시점의 에러까지 확인
	// 오버라이딩 된 경우 반드시 붙여주는 것이 좋다. 
	@Override
	void info() {
		// 부모클래싀의 메소드와 같은부분
//		System.out.println("사원명 : " + name 
//				+ ", 연봉 : " + salary + "만원, 직급 : " + grade + "");

//		info(); -> this.info();
		
		super.info();
		
		System.out.println("-------------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("-------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("-------------------------------------------");
		
		
	}

}
