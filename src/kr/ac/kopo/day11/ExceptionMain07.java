package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain07 {

	public static void main(String[] args) {
		try {
			c();
			d();
			e();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			b();
		} catch(FileNotFoundException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		a();
		
	}
	
	public static void f() throws Exception {
		
	}
	
	public static void c() throws Exception {
		f();
	}
	
	public static void d() throws Exception {
		
	}
	
	public static void e() throws Exception {
		
	}
	
	
	// 떠넘긴 예외만 처리한다
	public static void b() throws FileNotFoundException, ArrayIndexOutOfBoundsException {
		
		int[] arr = new int[3];
		System.out.println(arr[4]);
		FileReader fr = new FileReader("a.txt");
	}
	
	public static void a() {
		
		try{
			String str = null;
			System.out.println(str.length());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}




// throws 로 떠넘기는, 그것을 호출하는 메소드는 무조건 try-catch 문 필요
// throws 로 떠넘기면 반드시 예외처리 구문이 필요하다

// 메소드의 예외처리가 필요하다면 클래스 설계시 반드시 throws를 붙여준다.



