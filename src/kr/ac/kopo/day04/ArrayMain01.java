package kr.ac.kopo.day04;

public class ArrayMain01 {
	
	public static void main(String[] args) {
		// arr = int 배열의 주소값 저장
		int[] arr;
		// arr의 경우 메인메소드 안에 생성된 지역변수이다. -> 초기화가 이루어지지 않음
		// new라는 키워드를 이용하면 자동 초기화가 된다
		
		//정수 5개를 가지는 베열을 생성
		arr = new int[5];
		
		// 배열의 시작주소
		System.out.println("arr : " + arr); // [I@75a1cd57
		
		// 크기가 변하는 것이 아닌 다른 공간이 할당되어 주소가 변경된다
//		arr= new int[6];
//		System.out.println(arr); // [I@515f550a
		
		System.out.println("배열의 원소 총 갯수 : " + arr.length +"개");
		
		// 자동 초기화가 되기때문에 각각 원소는 0으로 초기화된다.
		System.out.println("첫번째 원소 : " + arr[0]);
		System.out.println("두번째 원소 : " + arr[1]);
		System.out.println("세번째 원소 : " + arr[2]);
		System.out.println("네번째 원소 : " + arr[3]);
		System.out.println("다섯번째 원소 : " + arr[4]);
		System.out.println("----------------------------------");
		// for문은 배열에 접근할 때 많이 사용하기 때문에
		// 인덱스의 약자로 i 사용 
		// 또한 인덱스는 0부터 시작학 때문에 일반적으로 i = 0 으로 선언한다
		// 베열의 크기때문에 i < 5
//		for(int i = 0; i < 5 ; i++){
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 원소 : "+ arr[i]);
		}
		System.out.println("----------------------------------");
		
		// 각 원소 값에 10 20 30 40 50 대입
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 원소 : "+ arr[i]);
		}
		
		
		
	}
}
