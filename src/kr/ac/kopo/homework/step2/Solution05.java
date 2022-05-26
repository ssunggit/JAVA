package kr.ac.kopo.homework.step2;

/* 5
 
구구단을 출력하세요
*** 2단 ***
2 * 1 = 2
...
2 * 9 = 18
*** 3단 ***
...
9 * 9 = 81


 */
public class Solution05 {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			System.out.printf("*** %d단 ***\n", i);

			for (int j = 1; j <= 9; j++) {
				System.out.printf("%2d *%2d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}

	}
}
