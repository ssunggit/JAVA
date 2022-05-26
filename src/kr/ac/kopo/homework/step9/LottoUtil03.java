package kr.ac.kopo.homework.step9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * 3. Arrays + Random + Set
 *
 */

public class LottoUtil03 {
	public static void main(String[] args) {
		LottoUtil03 l = new LottoUtil03();
		l.start();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임수를 입력하세요 : ");
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			System.out.print("게임 " + (i + 1) + " : ");
			System.out.println(Arrays.toString(getNumbers()));
		}

	}

	private int[] getNumbers() {
		Random r = new Random();
		
		Set<Integer> set = new HashSet<>();
		while(set.size() < 6) {			
			set.add(r.nextInt(45) + 1);
		}
		
		Object[] arr= set.toArray();
		
		int[] arr1 = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = (int)arr[i];
		}
		return arr1;
	}

}
