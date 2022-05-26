package kr.ac.kopo.homework.step2;

import java.util.Scanner;

/* 2
다음의 결과를 보이는 프로그램 작성하시오.
1 - 100 사이의 정수를 입력 : 40
2 - 10사이의 정수를 입력 : 5
< 1 ~ 40사이의 5의 배수를 제외한 정수 출력>
1 2 3 4 6 7 8 9 11 ... 39
< 1 ~ 40사이의 5의 배수를 제외한 정수 5개씩 출력>
1 2 3 4 6
7 8 9 11 12
 */
public class Solution02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 - 100사이의 정수를 입력 : ");
		int number1 = sc.nextInt();

		System.out.print("2 - 10사이의 정수를 입력 : ");
		int number2 = sc.nextInt();

		System.out.println("-----------------[문제 1]-------------------");
		System.out.printf("< 1 ~ 40사이의 %d의 배수를 제외한 정수 출력>\n",number2);
		for (int i = 1; i <= number1; i++) {
			if (!(i % number2 == 0)) {
				System.out.print(i + " ");

			}
		}
		System.out.println();
		System.out.println();
		System.out.println("------------------[문제 2]-------------------");
		System.out.printf("< 1 ~ 40사이의 %d의 배수를 제외한 정수 5개씩 출력>\n", number2);
		int cnt = 0;
		for (int i = 1; i <= number1; i++) {
			if (!(i % number2 == 0)) {
				System.out.print(i + " ");
				cnt++;
				if(cnt%5==0) {
					System.out.println();
				}
			}
		}

	}

}
