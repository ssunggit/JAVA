package kr.ac.kopo.homework.step6;

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
	
//	- 문자열의 각 내용들을 비교하여 입력 받는 char c 의 값과 동일한 char 의
//	개수를 리턴 한다
//	- 대소문자 구별하여 비교한다
	public static int checkChar(String strData , char ch) {
		int cnt = 0 ;
		for(int i=0; i<strData.length(); i++) {
			if(strData.charAt(i)==ch) {
				cnt++;
			}
		}
		return cnt;
	}

//	- 문자열 (oriStr)의 내용 중 주어진 문자(delChar)를 삭제한다
//	- 삭제된 내용으로 문자열의 내용을 변경한다	
	public static String removeChar(String oriStr , char delChar) {
		String subStr="";
		String subStr2="";
		
		for(int i=0; i<oriStr.length(); i++) {
			if(oriStr.charAt(i) == delChar) {
				subStr = oriStr.substring(0, i);	
				subStr2 = oriStr.substring(i+1);	
				oriStr = subStr+subStr2;
				i--;
			}
		}
		
		return oriStr;
	}
	
	
	
}
