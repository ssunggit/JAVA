package kr.ac.kopo.day09.abs02;
// 자식 클래스는 오버라이딩 안할 수 있가 때문에
// 상속을 통해서는 자식 클래스를 제어할 수 없다!!
public class HPPrinter extends Printer {

	public void hpPrint() {
		System.out.println("HP프린터에서 출력중...");
	}
}
