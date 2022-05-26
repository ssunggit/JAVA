package kr.ac.kopo.day03.exam;

public class ExamMain2Teacher {

	public static void main(String[] args) {

		/*
		 * 7
		 *****
		 ****
		 ***
		 **
		 *
		 * 
		 * 
		 */
		System.out.println("--------7(1)--------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print('-');
			}
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println("--------7(2)--------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j < i) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		/* 9
		 
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		System.out.println("--------9--------");
		int star = 1;
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i < 5)
				star++;
			else
				star--;
		}
		
		
		

	}

}
