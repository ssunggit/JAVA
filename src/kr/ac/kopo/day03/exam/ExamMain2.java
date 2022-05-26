package kr.ac.kopo.day03.exam;
/*1

11111
22222
33333
44444
55555

 */

/*2

12345
12345
12345
12345
12345 

*/

/*3
 
12345
23456
34567
45678
56789

*/

/*4

56789
45678
34567
23456
12345

*/

public class ExamMain2 {

	public static void main(String[] args) {
		/*
		 * 1
		 * 
		 * 11111 22222 33333 44444 55555
		 * 
		 */
		System.out.println("--------1--------");
		int num1 = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(num1);
			}
			num1++;
			System.out.println();
		}

		/*
		 * 2
		 * 
		 * 12345 12345 12345 12345 12345
		 * 
		 */
		System.out.println("--------2--------");
		for (int i = 1; i <= 5; i++) {
			int num2 = 1;
			for (int j = 1; j <= 5; j++) {
				System.out.print(num2);
				num2++;
			}
			System.out.println();
		}

		/*
		 * 3
		 * 
		 * 12345 23456 34567 45678 56789
		 * 
		 */
		System.out.println("--------3--------");
		for (int i = 1; i <= 5; i++) {
			int num3 = 0;
			num3 = num3 + i;
			for (int j = 1; j <= 5; j++) {
				System.out.print(num3);
				num3++;
			}
			System.out.println();
		}

		/*
		 * 4
		 * 
		 * 
		 * 56789 45678 34567 23456 12345
		 * 
		 */
		System.out.println("--------4--------");
		for (int i = 1; i <= 5; i++) {
			int num3 = 6;
			num3 = num3 - i;
			for (int j = 1; j <= 5; j++) {
				System.out.print(num3);
				num3++;
			}
			System.out.println();
		}

		/*
		 * 5
		 *
		 **
		 ***
		 ****
		 *****
		 * 
		 * 
		 */
		System.out.println("--------5--------");
		for (int i = 4; i >= 0; i--) {
			for (int j = 1; j <= 5 - i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

		/*
		 * 6
		 *****
		 ****
		 ***
		 **
		 *
		 * 
		 * 
		 */
		System.out.println("--------6--------");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

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
		System.out.println("--------7--------");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * 8
		 *
		 **
		 ***
		 ****
		 *****
		 * 
		 * 
		 */
		System.out.println("--------8--------");
		for (int i = 5; i > 0; i--) {
			for (int j = 4; j > 5 - i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * 9
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 * 
		 * 
		 */
		System.out.println("--------9--------");
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1; j <= 9-i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		/*
		 * 10
		 
		 *****
		 ****
		 ***
		 **
		 *
		 **
		 ***
		 ****
		 ***** 
		 
		 */
		System.out.println("--------10--------");
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5-i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1; j <= i-4; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		/*11
		 
		 *****
		  ****
		   ***
		    **
		     *
		    **
		   ***
		  ****
		 *****
		 	 
		 */

		System.out.println("--------11--------");
		for(int i = 1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; j<=i-1; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=5-i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j=1; j<= i-j-4; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i-4; j++)  {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		
		
	}

}
