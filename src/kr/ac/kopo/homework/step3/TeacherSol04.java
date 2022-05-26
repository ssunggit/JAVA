package kr.ac.kopo.homework.step3;

import java.util.Scanner;

public class TeacherSol04 {
	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);

		String msg = "";
		for(int i = 0; i < nums.length;) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(i > 0 && nums[i] < nums[i-1]) {
				System.out.println(msg + "보다 큰수여야합니다");
			} else {
				msg += nums[i++] + " ";
			}
		}
		
		
		/*
		//loopI: 
		for(int i = 0; i < nums.length; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();			
//			for(int j= 0; j<1; j++) {
//				if(nums[i] < nums[j]) {
//					System.out.println("Error");
//					continue loopI;
//				}
//			}
			
			if(i > 0 && nums[i] < nums[i-1]) {
				for( int j = 0; j <1 ;j++) {
					System.out.print(nums[j] + " ");
				}
				System.out.println("보다 큰수여야합니다");
				i--;
			}
		}
		
		*/		
		
		System.out.println(" <PRINT> ");
		for(int num : nums) {
			System.out.print(num+"\t");
		}
		System.out.println();
		
		// 두자리수 입력의 reverse
		System.out.println("< REVERSE >");
		for(int i= nums.length-1; i >= 0; i--) {
			// num[i] = 25 ==> 52
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;
			System.out.print(n1*10 + n10 + "\t");
			
		}
		
		
	}
}
