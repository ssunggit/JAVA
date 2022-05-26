package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {
	
	public static void main(String[] args) {
		
//		String[] strArr = {"데이터분석", "자바", "교육"};
		
		//new 키워드에서 참조변수의 경우 초기값 null
		String[] strArr = new String[5]; 
		int loc = 0;
		strArr[loc++] = "폴리텍";
		strArr[loc++] = "데이터분석";
		strArr[loc++] = "자바";
		strArr[loc++] = "교육";
		
//		System.out.println("문자열의 총 개수 : " + strArr.length + "개");
//		System.out.println("첫번째 문자열 : " + strArr[0]);
//		System.out.println("두번째 문자열 : " + strArr[1]);
//		System.out.println("세번째 문자열 : " + strArr[2]);
		
		/*
		 * 배열의 전체원소를 이용한 출력 방식
		 * [1] index를 이용한 출력(원소접근 : 0 ~ length-1)
		 * [2] jdk 1.5 버전의 for문을 이용한 출력 (for each문)
		 * [3] Arrays.toString() 메소드를 이용한 출력
		 */
		System.out.println("<[1] index를 이용한 출력 >");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("[2] 1.5버전의 for문 이용 출력 >");
		// strArr배열의 모든 원소를 s라는 변수로 접근한다.
		// 1.5버전의 경우 입력에서는 사용x
		for(String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println("[3] Arrays.toString() 메소드를 이용한 출력");
		// Arrays.toString() : 배열의 모든 요소를 하나의 문자열로 만들어줌
		// "[원소, 원소, 원소, ...]"
		String result = Arrays.toString(strArr); 
		System.out.println(result);
		
		
		
		
	}
}
