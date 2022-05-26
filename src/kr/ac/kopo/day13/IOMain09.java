package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain09 {

	public static void write() {
		// 이 객체를 파일에 저장하고 싶다.
		Icecream ice = new Icecream("월드콘", 2000, "해태");
		
		FileOutputStream fos = null;

		// 객체 필터클래스
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/object.txt");
			oos = new ObjectOutputStream(fos);
			
			// writeObject(object) -> 묵시적 형변환
			oos.writeObject(ice);
			
			System.out.println("object.txt 저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos, fos);
		}
		
	}
	
	
	public static void read() {

		Icecream ice = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object.txt");
			ois = new ObjectInputStream(fis);
			
			ice = (Icecream)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(ois, fis);
		}
		
		
		System.out.println(ice);
	}
	
	public static void main(String[] args) {
		read();
//		write();
		
	}
}
// company는 객체직렬화에서 빼고 싶은 경우

/*
 DB에 저장하지 않는 가벼운 정보들은  file.io에 저장
 */

// 짝을 이루는 읽기 - 쓰기 스트림 사용