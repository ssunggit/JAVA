package kr.ac.kopo.day09.abs03;
// 자식클래스에 대해 강제성을 부여하기 위하여 추상 메소드로 만들어준다.
// 또한, 추상메소드가 있는 클래스는 반드시 추상 클래스로 만들어줘야한다.

// 변화에 둔감하게 만들어준다
public abstract class Printer {
	
	private String model; 
	
	public Printer() {
		
	}
	
	public Printer(String model) {
		this.model = model;
	}
	
	public abstract void print();
}
