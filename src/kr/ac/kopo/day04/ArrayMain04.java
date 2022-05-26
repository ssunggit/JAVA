package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {

//		int[] arr = {10, 20, 30, 40, 50};
		int[] arr = new int[] {10, 20, 30, 40, 50};
		
		// 이 방식은 반드시 배열의 선언부와 같이 사용
//		arr = {5, 4, 3}; // 컴파일 시 에러 발생
		arr = new int[] {5, 4, 3};
		
		System.out.println("arr : " + Arrays.toString(arr));
		
	}
}
