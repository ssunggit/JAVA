package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain03 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
/*		
		int data = 1;
		// 배열의 값이 바뀌는 것이 아니라 num만 초기화된다.
		// arr의 각각의 요소를 num에 복사된다.
		// 복사하여 사용하기 때문에 배열의 요소는 초기화되지 않는다.
		// 즉, 1.5버전의 for문의 경우 출력, 검색할때만 사용
		for(int num : arr) {
			num = data++;
		}
*/
		System.out.println(" < PRINT > ");
		for (int num : arr) {
			System.out.print(num + "\t");
		}

		/*
		 * for(int i = 0; i<arr.length; i++) { 
		 *System.out.print(arr[i] + "\t"); }
		 * System.out.println();
		 */
	}
}
