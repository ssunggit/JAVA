package kr.ac.kopo.day08.extend;

public class Employee {
	// public 모든 클래스에서 접근 가능하다 -> 보안에 취약
	// private 오로지 내 클래스내에서만 사용한다 -> 상속에서도 사용 불가능 => 자신의 멤버변수 값은 private 로 작성
	String name;
	int salary;
	String grade;
	
	Employee(){
		
	}
	
	Employee(String name, int salary, String grade){
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}  
	
	void info() {
		System.out.println("사원명 : " + name 
				+ ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}
}
