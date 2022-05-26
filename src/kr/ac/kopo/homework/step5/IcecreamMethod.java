package kr.ac.kopo.homework.step5;

import java.util.Scanner;

public class IcecreamMethod {
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇개 구입할꺼야? => ");
		int count = Integer.parseInt(sc.nextLine());
		IceCream[] icArr = new IceCream[count];

		int sum = 0;

		for (int i = 0; i < count; i++) {
			System.out.printf("%d번째 아이스크림 구매정보\n", i + 1);
			IceCream ic = new IceCream();

			System.out.print("아이스크림명 : ");
			ic.name = sc.nextLine();

			System.out.print("아이스크림가격 : ");
			ic.price = Integer.parseInt(sc.nextLine());

			sum += ic.price;
			
			icArr[i] = ic;
			
		}
		print(count, icArr, sum);
	}

	static void print(int count, IceCream[] icArr, int sum) {
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", count);
		System.out.println("번호\t아이스크림명\t가격");

		for (int i = 0; i < count; i++) {
			System.out.printf("%d\t%s\t\t%d\n", i + 1, icArr[i].name, icArr[i].price);

		}
		System.out.println("\t총 판매액 : " + sum + "원");
	}
}
