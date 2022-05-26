package kr.ac.kopo.homework.step5;

public class StringUtil {
	 // 1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c ) 메소드를 작성하시오. 
	boolean isUpperChar(char c) {
		if (c>='A' && c <= 'Z') {
			return true;			
		}else {
			return false;

		} 
		
	}
	
	
	// 2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메소드를 작성하시오.
	boolean isLowerChar(char c) {
		if (c>='a' && c <= 'z') {
			return true;			
		}else {
			return false;

		}
	}
	
	// 3. 두개의 숫자를 입력받아 큰수를 반환하는 max(int i, int j) 메소드를 작성하시오. 
	int max(int i, int j) {
		if(i>j) {
			return i;
		}else if(i<j) {
			return j;
		}else {
			return 0;
		}
		
	}
	
	// 4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오.
	int min(int i, int j) {
		if(i<j) {
			return i;
		}else if(i>j) {
			return j;
		}else {
			return 0;
		}
		
	}
	
	// 5. 문자열을 입력받아 거꾸로 변경하는 reverseString(String str) 메소드를 작성하시오.
	String reverseString(String str) {
		int len = str.length();
		String reverseString="";
		for(int i=len-1; i>=0; i--) {
			reverseString+=str.charAt(i);
		}
		return reverseString;
	}
	
	// 6. 문자열을 입력받아 대문자로 변경하는 toUpperString(String str) 메소드를 작성하시오.
	String toUpperString(String str) {
		String toUpperString="";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='a' && str.charAt(i) <='z') {
				toUpperString+=(char)(str.charAt(i)+('A'-'a'));	
			}else if(str.charAt(i)>='A' && str.charAt(i) <='Z') {
				toUpperString+=str.charAt(i);								
			}
		}
		return toUpperString;
	}
	
	// 7. 문자열을 입력받아 소문자로 변경하는 toLowerString(String str) 메소드를 작성하시오.
	String toLowerString(String str) {
		String toLowerString="";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='a' && str.charAt(i) <='z') {
				toLowerString+=str.charAt(i);								
			}else if(str.charAt(i)>='A' && str.charAt(i) <='Z') {
				toLowerString+=(char)(str.charAt(i)-('A'-'a'));	
			}
		}
		return toLowerString;
	}
	
}
