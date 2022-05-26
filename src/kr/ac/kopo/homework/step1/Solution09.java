package kr.ac.kopo.homework.step1;

import java.util.Scanner;

/*
 * 9
 다음의 결과를 보이는 프로그램을 작성
보유하고
있는 책권수 : 34
잘못입력했습니다
보유하고
있는 책권수 0
보유하고
있는 책 없음
보유하고
있는 책권수 : 1
1
b ook
보유하고
있는 책권수 : 12
1
2 books


 */
public class Solution09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("보유하고 있는 책권수 : ");
		int books = sc.nextInt( );
		
		if(books >=1) {
			System.out.printf("%d book\n", books);
			
		}else if (books == 0) {
			System.out.println("보유하고 있는 책 없음");
		}else if (books < 0) {
			System.out.println("잘못입력했습니다");
		}
		
	}
}
