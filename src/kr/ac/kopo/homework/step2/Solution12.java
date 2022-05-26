package kr.ac.kopo.homework.step2;

import java.util.Scanner;

/* 12

****-****
***---***
**-----**
*-------*
---------
*-------*
**-----**
***---***
****-**** 

 */

// 해당 모양에서 행렬의 수는 입력받아 구현
public class Solution12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3~40 안의 라인 수를 입력하세요 : ");
		int line = sc.nextInt();
		
		if ((line % 2) == 0) {
			line --;
			
		}
		
		int star =  line/2;
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line ; j++) {
				if(j <= star || j >= (line+1)-star) {
					System.out.print('*');
				}
				else {
					System.out.print('-');
				}
			}
			System.out.println();
			if(i < (line/2)+1)
				star--;
			else
				star++;

		}
		
		
		

	}
}
