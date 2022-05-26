package kr.ac.kopo.day02;
/*
 * 반복문을 위한 기본요소 4가지
 * 1. 반복할 문장(statement)
 * 2. 시작값(init)
 * 3. 증가/감소(incre/decre)
 * 4. 종료조건(expr)
 * 
 * 
 * 조건이 거짓이 될때까지 반복이 진행된다.
--------------------------------------------------  	

  	 한바퀴 뛸 차례다;
  	 while(!열바퀴 다 뛰었니?) {
  		운동장을 한바뀌 뛴다.
  		바퀴수 증가;
  	}
	1.init
	while(2.expr){
  		3. statement
  		4. incre/decre
 	}
 	5.
 	
 	1 -> 2 조건 참 -> 3 -> 4
 	  -> 2 조건 참 -> 3 -> 4
 	  -> 2 조건 참 -> 3 -> 4
 	  -> 2 조건 거짓 -> 5
 	  
------------------------------------------------------

 	  for(1.init; 2.expr; 3.incre/decre){
 	  	4.statment;
 	  }
 	  5.
 	  
 	  
 	  1 -> 2 조건 참 -> 4 -> 3
 	  	-> 2 조건 참 -> 4 -> 3
 	  	-> 2 조건 참 -> 4 -> 3
 	  	-> 2 조건 거짓 -> 5
 	  
 	
 */
public class LoopMain01 {
	public static void main(String[] args) {
		
		System.out.println("-----------for 반복문 시작-----------");
			// 변수의 라이프사이클이 {}를 따라서 for문이 끝나서 라이프사이클도 끝.-> for문에서 만들어진 변수는 for문안에서만 살아있음.					  
		for(int cnt = 1; cnt <= 5; cnt++) { // 후행 전행 상관없음.
			System.out.println("Hello");
		}
		System.out.println("-----------for 반복문 종료-----------");
		
		// 무한루프
		/*
		boolean bool = true;
		System.out.println("-----------반복문 시작-----------");
		while(bool) {
			System.out.println("Hello");
		}
		System.out.println("-----------반복문 종료-----------");
		*/
		
		int cnt = 1;
		System.out.println("-----------while 반복문 시작-----------");
		while( cnt <= 5 ) {
			System.out.println("Hello");
			// 혼자쓰일때는 전위증가 후위증가 같은 말!
			++cnt;
		}
		System.out.println("-----------while 반복문 종료-----------");

		
		
	// 디버깅 : 코드가 움직이는 단위를 체크할 수 있다.
	}
}

// while vs for
// while문은 루프가 몇번도는지 모르지만 끝나는 조건만 아는 경우 사용
// for문은 루프가 몇번 도는지 아는경우(시작과 끝을 아는 경우)
