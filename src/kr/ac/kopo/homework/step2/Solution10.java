package kr.ac.kopo.homework.step2;

/* 10

다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
*-------*
**-----**
***---***
****-****
*********
****-****
***---***
**-----**
*-------*

 */
public class Solution10 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i < 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= 4 - i; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else if(i == 5) {
				for(int j=1; j<=9; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j = 1; j <= 10-i; j++) {
					System.out.print("*");
				}
				for(int j = 1; j <= i-5; j++) {
					System.out.print("-");
				}
				for(int j = 1; j <= i-6; j++) {
					System.out.print("-");
				}
				for(int j = 1; j <= 10-i; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}

		}

	}
}
