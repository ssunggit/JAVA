package kr.ac.kopo.day03;

public class LoopMain03 {

	public static void main(String[] args) {
		
		// continue는 정해진 루프를 다 돈다
		for(int i=0; i<10; i++) {
			if(i%2==0) continue;
			System.out.println(i + "자바");
			
		}
		
		System.out.println("------------------------------");
		
		// if문으로도 continue 처럼 사용 가능
		for(int i=0; i<10; i++) {
			if(i%2==1) {
				System.out.println(i + "자바");
			}
		}
		
		
	}
}
