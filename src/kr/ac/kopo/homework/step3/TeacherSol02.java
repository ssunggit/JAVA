package kr.ac.kopo.homework.step3;

import java.util.Scanner;

public class TeacherSol02 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int[] sum = new int[2]; // [0]: 짝수 총합 , [1]: 홀수 총합
		Scanner sc = new Scanner(System.in);
		//while
		int loc = 0;
		while(loc < nums.length) {
			System.out.print(loc + 1 + "번째 정수 입력 : ");
			nums[loc] = sc.nextInt();
			/*
			 * if(nums[loc] < 0) 
			 * continue;
			 */
			if(nums[loc] >= 0)
			sum[nums[loc] % 2] += nums[loc++];				
		}
		
		/*
		//for
		//  무한루프의 경우 증감값 생략가능
		for (int i = 0; i < nums.length; ) {
			System.out.print(i + 1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(nums[i]>=0) {
				sum[nums[i] % 2] += nums[i];
				i++;
			}
		}
		*/
		/*
		 * for(int i = 0; i < nums.length; i++) { 
		 * do{
		 * System.out.print(i+1+"번째 정수 입력 : "); 
		 * nums[i] = sc.nextInt(); 
		 * }while(nums[i] < 0); 
		 * sum[nums[i] % 2] += nums[i]; }// 이 경우 이중루프가 필요없음.
		 */
		String[] title = { "짝수", "홀수" };
		for (int mod = 0; mod <= 1; mod++) {
			System.out.println("< " + title[mod] + ">");
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] % 2 == mod) {
					System.out.print(nums[i] + "  ");
				}
			}
			System.out.println(title[mod] + "총합 : " + sum[mod]);
		}
	}

}
