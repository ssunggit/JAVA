package kr.ac.kopo.homework.step2;

import java.util.Scanner;

/* 6
 시작단과 종료단을 입력받아 구구단을 출력하시오.
시작단을 입력 : 5
종료단을 입력 : 8
*** 5단 ***
5 * 1 = 5
...
8 * 9 = 72
이 때, 시작단을 8, 종료단을 5을 입력해도 같은 결과가 나와야 합니다

 */
public class Solution06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단을 입력 : ");
		int n1 = sc.nextInt();

		System.out.print("종료단을 입력 : ");
		int n2 = sc.nextInt();

		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				System.out.printf("*** %d단 ***\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%2d *%2d = %2d\n", i, j, i * j);
				}
				System.out.println();
			}
		}else if(n1 > n2) {
			for (int i = n2; i <= n1; i++) {
				System.out.printf("*** %d단 ***\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%2d *%2d = %2d\n", i, j, i * j);
				}
				System.out.println();
			}	
		}else {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("*** %d단 ***\n", n1);
				System.out.printf("%2d *%2d = %2d\n", n1, j, n1 * j);
			}
			
		}

	}
}

/*
현성씨....
n1 == n2 인경우를 따로 else로 뽑지 않아도 if문에 n1 <= n2 조건을 사용하시면 같은 결과가 나올거 같아요
다시한번 생각해주세요...
*/

