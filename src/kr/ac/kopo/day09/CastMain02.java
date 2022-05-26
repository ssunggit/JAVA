package kr.ac.kopo.day09;
// 묵시적 형변환
public class CastMain02 {	
	
	public static void main(String[] args) {
		// 부모의 공간보다 자식의 공간이 광범위 하기때문에 컴파일 오류
//		Child01 c = new Parent();

		// 런타임시 오류(실행시 오류)
//		Child01 c = (Child01)new Parent();
		
		Parent p = new Child01();
		Child01 c2 = (Child01)p;
		
		c2.sleep();
		c2.study();
		
	}
}
