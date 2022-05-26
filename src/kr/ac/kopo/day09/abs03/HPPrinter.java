package kr.ac.kopo.day09.abs03;
// 추상클래스로 표준화시키기
// 추상클래스를 상속받은 클래스는 반드시 추상메소드를 오버라이딩하여야한다.
public class HPPrinter extends Printer {

	public void hpPrint() {
		System.out.println("HP프린터에서 출력중...");
	}
	// 추상메소드를 오버라이딩 하게 강제성 부여
	@Override
	public void print() {
		System.out.println("HP프린터에서 출력중...");
	}
}
