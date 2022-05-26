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

// 전체 아홉개의 열에서 앞의 별의 갯수와 뒤의 별의 갯수를 제외한 나머지는 스페이스로 채움
public class TeacherSol10 {
	public static void main(String[] args) {
		int star = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(j <= star || j >= 10-star) {
					System.out.print('*');
				}
				else {
					System.out.print('-');
				}
			}
			System.out.println();
			if(i < 5)
				star++;
			else
				star--;

		}
		
		
		

	}
}
