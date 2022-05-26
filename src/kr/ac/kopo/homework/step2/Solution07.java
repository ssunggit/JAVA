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

// 구현하지 못했습니다.. 
// ㅠ_ㅠ 
public class Solution07 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=2; i <=9; i++) {
			for(int j=1; j <=9; j++) {
				System.out.printf("%2d * %2d = %2d  ", i, j, i*j);
				cnt++;
				if(cnt == 3) {
					System.out.println();
					cnt = 0;
				}
//				for(int k =0; k <= cnt; k++) {
//					
//				}
			}
			
		}
		
			

	}
}
