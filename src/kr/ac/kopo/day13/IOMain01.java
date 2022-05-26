package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;

public class IOMain01 {

	public static void main(String[] args) {

		InputStream is = System.in;
		// checked Exception -> try catch 처리
		System.out.println("키보드 입력을 하세요. ctrl+z 입력시 종료됩니다");
		
		while(true) {
			try {
				// 입력 스트림으로 부터 한 바이트 씩 읽어 int형으로 반환한다
				int c = is.read();
				// line feed = 13, carriage return = 10
				//System.out.print(c);
				
				// ctrl z : 중단의 의미
				// 아스키코드와 유니코드의 경우 0보다 큰 정수값을 가지기 때문에 
				// -1을 반환하게 한다.
				if(c == -1) break;
				System.out.print((char)c);
				
				// 키보드가 버퍼를 사용하기 때문에 한번에 출력된다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
// 엔터의 경우 라인만 바꿔줌
//-> 라인 다음줄로 바꿔줌(line feed), 커서도 1열로 수행해야함(carriage return)

