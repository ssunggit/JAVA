package kr.ac.kopo.day01;
// 외부의 다른 패키지, 클래스을 가지고 오고싶을 때 import 
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char ch =sc.nextLine().charAt(0);	
		System.out.println("ch : "+ ch);
		
		System.out.print("문자열을 입력하세요 : ");
		// 단어를 입력받을때 (띄어쓰기 안댐)
		//String str =sc.next();
		// 문장을 입력받을때
		String str2 =sc.nextLine();		
		//System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		
		System.out.print("정수를 하나 입력하세요 : ");
		// 키보드로 입력받은 정수
		int a = sc.nextInt();
		System.out.println("a : " + a);
		
		// 입력을 논리값, 정수, 실수 가능
	
	}

}
