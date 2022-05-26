package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String("hello");
		char[] chars = {'h', 'e', 'l', 'l', 'o'};
		String str2 = new String(chars);
		
		// 서버와 클라이언트의 사용언어가 다를 경우 byte단위의 데이터를 더 많이 사용한다
		byte[] bytes = {65, 67, 98, 120};
		String str3 = new String(bytes);
		
		System.out.println("str  : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		
		str = new String("Hello World");
		
		System.out.println("str : " + str + ", 길이 : " + str.length());
		
		char[] words = new char[5];
		int loc = 0;
//		for(int i = 6;i<=10; i++) {
//			words[loc++] = str.charAt(i);
//		}
		
//		str.getChars(6, 11, words, 0);
//		
		words = new char[str.length()];
		str.getChars(0, str.length(), words, 0);
		
		System.out.println("words : "+ Arrays.toString(words));
	}
}
