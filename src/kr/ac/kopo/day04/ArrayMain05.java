package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {

		int[] arr = {10, 20, 50, 70, 30};
		// arr의 시작주소번지가 copy에 복사됨-> 즉 하나의 공간을 두 참조변수가 가르키게 됨
		// -> shallow copy(얕은 복사)
//		int[] copy = arr;
		
		// deep copy(깊은 복사)
		int[] copy = new int[arr.length];
//		for(int i = 0; i < arr.length ; i++) {S
//			copy[i] = arr[i];
//		}
		System.arraycopy(arr, 0, copy, 0, arr.length);

		System.out.println("arr : "+ arr);
		System.out.println("copy : "+ copy);
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
		
		copy[2] = 100;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
		
	}
}
