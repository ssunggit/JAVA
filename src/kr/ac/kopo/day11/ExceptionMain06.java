package kr.ac.kopo.day11;

import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {
		/*
		System.out.println("main start...");
		 
		try { FileReader fr = new FileReader("a.txt"); // checked Exception -> 컴파일시점의 예외처리 
		} catch(FileNotFoundException fnfe) { 
			fnfe.printStackTrace(); }
		}
		 
		 System.out.println("main end...");
		 
		 */
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("loop...");
				if (i == 3) {
					FileReader fr = new FileReader("a.txt"); // checked Exception
				}
			} catch (Exception fnfe) {
				fnfe.printStackTrace();
				break;
			
			}finally {				
			System.out.println("end loop...");
			}
		}
		System.out.println("main end...");

	}
}

// 외부에 의해 에러가 일어나는 경우는 컴파일 시점에서 무조건 컴파일 시점에서 예외처리를 해주어야한다!


// finally 자원을 관리하는 목적으로 사용