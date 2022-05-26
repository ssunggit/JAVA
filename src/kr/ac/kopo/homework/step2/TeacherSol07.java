package kr.ac.kopo.homework.step2;

/* 7
 
구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 10단은 나오면 안됩니다.
반복문은 최대 3개만 사용합니다.
2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
...
5 * 1 = 5 6 7
...
8 9
for(int dan = 2; dan <= 9; ) {
}

 */

public class TeacherSol07 {
	public static void main(String[] args) {
		int step = 3;

		for (int dan = 2; dan <= 9; dan += step) {
			for (int i = 1; i <= 9; i++) {
				for (int j = dan; j <= 9 && j < dan + step; j++) {
					System.out.printf("%d * %d = %d\t", j, i, j * i);
				}
				System.out.println();
			}
			System.out.println();
		}

		// *** 단 ***
		for (int dan = 2; dan <= 9; dan += step) {
			for (int i = 0; i <= 9; i++) {
				for (int j = dan; j <= 9 && j < dan + step; j++) {
					if (i == 0) {
						System.out.printf("*** %d단 ***\t", j );
					}else {
						System.out.printf("%d * %d = %d\t", j, i, j * i);						
					}
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
