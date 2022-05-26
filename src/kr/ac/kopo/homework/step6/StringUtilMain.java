package kr.ac.kopo.homework.step6;

import java.util.Scanner;

public class StringUtilMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inputString = sc.nextLine();
		char inputChar = sc.nextLine().charAt(0);
		
		StringUtil u  = new StringUtil();
		int cnt = u.checkChar(inputString, inputChar);
		System.out.println(cnt);
		
	
		System.out.println(u.removeChar(inputString, inputChar));
		
		
	}

}
