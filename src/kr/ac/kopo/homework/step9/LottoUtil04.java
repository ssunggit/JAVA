package kr.ac.kopo.homework.step9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * 4. Arrays + Random + Map
 *
 */


public class LottoUtil04 {
	public static void main(String[] args) {
		LottoUtil04 l = new LottoUtil04();
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
		Map<Integer, Integer> map = new HashMap<>();
		Random r = new Random();
		
		for(int i = 0 ; i<6; i++) {
			int num = r.nextInt(45) + 1;
			map.put(num, null);		
		}
		Set<Integer> keys = map.keySet();
		
		Object[] arr= keys.toArray();
		
		int[] arr1 = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = (int)arr[i];
		}
		return arr1;
	}

}
