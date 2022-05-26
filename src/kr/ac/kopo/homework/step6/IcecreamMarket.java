package kr.ac.kopo.homework.step6;

import java.util.Scanner;

public class IcecreamMarket {
	private int sum;
	private int count;
	private Scanner sc = new Scanner(System.in);

	public void count() {
		System.out.print("아이스크림 몇개 입력? ");
		int cnt = Integer.parseInt(sc.nextLine());
		Icecream[] ice = new Icecream[cnt];
		count += cnt;
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d번째 아이스크림 구매정보\n", i + 1);
			Icecream ic = new Icecream();

			System.out.print("아이스크림명 : ");
			ic.setName(sc.nextLine());

			System.out.print("아이스크림가격 : ");
			ic.setPrice(Integer.parseInt(sc.nextLine()));

			sum += ic.getPrice();

			ice[i] = ic;
		}

		print(cnt, ice);
	}

	private void print(int cnt, Icecream[] ice) {
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", cnt);
		System.out.println("번호\t아이스크림명\t가격");

		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d\t%s\t\t%d\n", i + 1, ice[i].getName(), ice[i].getPrice());

		}
		re();
	}

	private void re() {
		System.out.print("계속 주문하시겠습니까(yes:Y/y, no:N/n) => ");
		String order = sc.nextLine();

		if (order.equals("y") || order.equals("Y")) {
			count();
		} else if (order.equals("n") || order.equals("N") ) {
			System.out.println("\t총 판매개수 : " + count);
			System.out.println("\t총 판매액 : " + sum + "원");
		}

	}

}
