
package kr.ac.kopo.homework.step3;

import java.util.Scanner;
/*

다음의 결과를 보이는 코드를 작성하시오
1번째 정수 : 10
2번째 정수 : 5
10보다 큰수가 와야합니다
2번째 정수 : 12
3번째 정수 : 36
4번째 정수 : 6
10, 12, 36보다 큰수가 와야합니다
4번째 정수 : 22
10, 12, 36보다 큰수가 와야합니다
4번째 정수 : 40
5번째 정수 : 67
< PRINT >
10 12 36 40 67
< REVERSE >
76 4 63 21 1
 
 */

public class Solution04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		int[] arr = new int[5];

		System.out.print("1번째 정수 : ");
		arr[0] = sc.nextInt();

		while (index < arr.length - 1) {
			System.out.printf("%d번째 정수 : ", index + 2);
			int input = sc.nextInt();
			if (arr[index] < input) {
				arr[index + 1] = input;
				index++;
			} else {
				for (int i = 0; i < index + 1; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("보다 큰수가 와야합니다");
			}
		}

		System.out.println("< PRINT >");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("< REVERSE >");
		for (int i = arr.length - 1; i >= 0; i--) {
			int changeNum = arr[i];
			int result = 0;
			while (changeNum > 0) {
				result = result * 10 + changeNum % 10;
				changeNum /= 10;
			}
			arr[i]=result;
			System.out.print(arr[i] + " ");
		}

	}
}
