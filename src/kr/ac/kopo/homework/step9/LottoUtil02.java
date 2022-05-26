package kr.ac.kopo.homework.step9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * 2. Arrays + ArrayList + Random
 *
 */
public class LottoUtil02 {
	public static void main(String[] args) {
		LottoUtil02 l = new LottoUtil02();
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
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		int num = r.nextInt(45) + 1;
		
		list.add(num);
		
		for (int i = 1; i < 6; i++) {
			list.add(r.nextInt(45) + 1);
			for (int j = 0; j < i; j++) {
				if (list.get(i) == list.get(j)) {
					list.add(r.nextInt(45) + 1);
					i--;
				}
			}
		}
		
		Object[] arr= list.toArray();
		
		int[] arr1 = new int[6];
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = (int)arr[i];
		}

		return arr1;

	}

}
