package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// 파일 입력 장치 // 파일 출력 장치 
/*
	Koala.jpg  -> Koala2.jpg 복사 
*/
public class IOMain03 {

	public static void main(String[] args) {
		// finally에서 사용하기 위해 try문 위에 선언해주어야한다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 예외처리를 하지 않아 오류 => try-catch
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			long start = System.currentTimeMillis();
			
			
			// 외부장치 -> 외부장치로 저장할 수 없음
			// 외부장치 -> RAM 으로 읽어드린 후 RAM -> 외부장치로 저장해야한다
			// 파일의 경우 이진수로 되어있기 때문에 while문으로 파일을 다 읽는다
			while(true) {
				int c = fis.read();
				// 파일의 끝에는 -1로 되어 있다
				// -1이 나올때까지 입력받는다.
				if(c == -1) break;
				fos.write(c);
			}
			fos.flush();
			

			long end = System.currentTimeMillis();
								// byte단위로 움직이기 때문에 시간이 오래걸린다.
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
			
//		읽어드릴 때	FileNotFoundException	
//		저장할 때 	IOException
		// Exception 으로 묵시적 형변환
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 하나의 파일에 동시에 접근하지 못한다. 
			// 연결을 끝내줘야한다.
			// (시스템을 종료하는 경우 연결통로가 끊어진다.)
			// 연결을 해제하는 close()의 경우 반드시 finally 에 있어야 한다.
			try {
				fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일복사가 완료되었습니다");
	}
	
}
