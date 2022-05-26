package kr.ac.kopo.day03;

/*
 
 while(expr){
 	statement;
 }
 
 for(init; expr; incre){
 	statement;
 }
 
 for문과 while문의 경우 처음부터 조건이 만족하지않은 경우 반목문 안의 명령문이 한번도 실행되지 않을 수 있다.
 -> for문의 경우 조건식의 위치를 명령문 밑으로 내릴 수 없다.
 -> do~ while문 등장
 
 init;
 do{
 	statement;
 }while(expr);
 첫번째 statement은 무조건 한번 실행하고 그 다음부터 조건확인
 -> while문과 for문의 경우 ; 을 붙여도 오류가 나지 않지만 반복문이 실행되지 않기때문에 반드시 ;을 붙이면 안된다
 -> do while문의 경우 ;을 반드시 붙여야 한다!
 -> while문에 비해 루프가 한번 덜 돈다
 => do while문은 에러 체크할때 사용
 */
public class LoopMain02 {

	public static void main(String[] args) {
		int cnt = 1;
		do {
		System.out.println("Hello");
		cnt++;
		} while(cnt <=5);
		
		System.out.println("=======================================");
		
		// break사용 구문 
		cnt = 1;
		while(true){
			System.out.println("Hi");
			++cnt;
			if(cnt > 5) {
				// 가장 가까운 반복문이나 switch문에서 빠져나온다.
				break;
			}
		}
		
		
	}
}
