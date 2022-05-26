package kr.ac.kopo.homework.step6;
/*
 다음의 결과를 보이는 코드를 작성

   아이스크림 몇개입력 ? 2
    2개입력

    아이스크림 구매정보 출력

    계속 주문하시겠습니까(yes:Y/y, no:N/n) => y

   아이스크림 몇개입력 ? 3
    3개입력

    아이스크림 구매정보 출력

    계속 주문하시겠습니까(yes:Y/y, no:N/n) => y

   아이스크림 몇개입력 ? 5
    5개입력

    아이스크림 구매정보 출력

    계속 주문하시겠습니까(yes:Y/y, no:N/n) => n

    총 판매개수 : 10
    총 판매액 :  XXXX원\
 
 */
public class Icecream {
	private String name;
	private int price;
	
	public Icecream() {
		
	}
	
	public Icecream(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
