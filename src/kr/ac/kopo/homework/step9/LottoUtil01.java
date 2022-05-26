package kr.ac.kopo.homework.step9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 1. Arrays + Random
 *
 */

public class LottoUtil01 {
	public static void main(String[] args) {
		System.out.println("로또게임");
		LottoUtil01 l = new LottoUtil01();
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
		int[] arr = new int[6];
		// 1 ~ 45 사이의 로또번호 6개 추출(중복허용하지 않는)
		Random r = new Random();
		arr[0] = r.nextInt(45) + 1;

		for (int i = 1; i < 6; i++) {
			arr[i] = r.nextInt(45) + 1;
			for (int j  = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = r.nextInt(45) + 1;
					i--;
				}
			}
		}
		return arr;

	}

}
