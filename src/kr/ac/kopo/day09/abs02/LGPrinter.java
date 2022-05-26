package kr.ac.kopo.day09.abs02;

public class LGPrinter extends Printer{
	
	public LGPrinter() {
		
	}
	public LGPrinter(String model) {
		super(model);
	}
	// 오버라이딩
//	@Override 
//	public void print() {
//		 System.out.println("LG프린터에서 출력합니다");
//	}
	@Override
	public void print() {
		
		System.out.println("LG프린터에서 출력 중...");
	}
	
	
//	public void lgPrint() {
//		System.out.println("LG프린터에서 출력합니다");
//	}
}
