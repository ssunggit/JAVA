package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain02 {

	public static void main(String[] args) {
		InputStream is = System.in;
								// 필터클래스
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("키보드 입력을 하세요. ctrl+z 입력시 종료됩니다");
		
		// 한글의 경우 -> 2byte 
		while(true) {
			try {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
// 엔터의 경우 라인만 바꿔줌
//-> 라인 다음줄로 바꿔줌(line feed), 커서도 1열로 수행해야함(carriage return)

