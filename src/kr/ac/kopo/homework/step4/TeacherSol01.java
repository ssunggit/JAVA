package kr.ac.kopo.homework.step4;
/*
 
아이스크림 몇개 구입할꺼야? => 3 (키보드 입력)

*** 1번째 아이스크림 구매정보 ***
아이스크림명 : 비비빅(키보드)
아이스크림가격 : 700(키보드)

*** 2번째 아이스크림 구매정보 ***
아이스크림명 : 월드콘(키보드)
아이스크림가격 : 1500(키보드)

*** 3번째 아이스크림 구매정보 ***
아이스크림명 : 메로나(키보드)
아이스크림가격 : 1000(키보드)

< 총 3개의 아이스크림 구매정보 출력 >
번호   아이스크림명    가격
1     비비빅         700
2
3

   총 판매액 : XXXX원 
   
   
 */
/*

아이스크림 몇개 구입할꺼야? => 3 (키보드 입력)
*** 1번째 아이스크림 구매정보 ***
아이스크림명 : 비비빅(키보드)
아이스크림가격 : 700(키보드)
*** 2번째 아이스크림 구매정보 ***
아이스크림명 : 월드콘(키보드)
아이스크림가격 : 1500(키보드)
*** 3번째 아이스크림 구매정보 ***
아이스크림명 : 메로나(키보드)
아이스크림가격 : 1000(키보드)
< 총 3개의 아이스크림 구매정보 출력 >
번호   아이스크림명    가격
1     비비빅         700
2
3
   총 판매액 : XXXX원 
     
 */
import java.util.Scanner;

public class TeacherSol01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림 몇개 구입하시겠습니까? => ");
		int count = sc.nextInt();
		sc.nextLine();
		
		// 참조배열
		IceCream[] iceArr = new IceCream[count];
		
		for (int i = 0; i < count; i++) {
			// 실제 인스턴스 객체를 만들어줌
			iceArr[i] = new IceCream();
			
			// 입력버퍼는 성능 향상을 위해 사용
			// 입출력 장치는 문자 단위로 동작
			// RAM 과 입출력장치 사이의 접근속도가 많이 느리다 
			// RAM 과 입출력장치 사이에선 문자의 길이에 따라서 속도차이가 크다.
			// -> 버퍼라는 저장소가 등장하였다
			
			// 매번 입력받는 것이 아니라 한번에 입력받아서 버퍼에 저장
			// 버퍼는 엔터전까지 계속 입력받는다.
			
			// 입력버퍼를 사용하기때문에 .nextLine()와 .nextInt()
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine();
			
			System.out.print("아이스크림 가격 : ");
			// 문자열을 int 타입으로 바꿈
			iceArr[i].price = Integer.parseInt(sc.nextLine());
			
		}
		
		System.out.println("< " + iceArr.length + "개 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		int no = 0;
		for(IceCream ice : iceArr) {
			System.out.println(++no + "\t" + ice.name + "\t" + ice.price);
		}
	}

}