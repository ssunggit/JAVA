package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
	Set : 순서(X), 중복(X)
	 - HashSet
	 - TreeSet
*/


public class SetMain {
	
	public static void main(String[] args) {
	
		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
		System.out.print("\"one\"입력성공여부 : " + set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one");
		System.out.print("\"one\"입력성공여부 : " + set.add("one"));
		
		System.out.println("전체 원소의 갯수 : " + set.size() + "개");
		
		/*
		 * 전체 데이터 접근방법 3가지
		 * 1. 1.5 버전의 for문 이용
		 * 2. toArray() 메소드 이용
		 * 3. Iterator 객체 이용
		 * 
		 */
		
		// 1.
		System.out.println("< 1.5버전의 for문 이용한 출력 >");
		for(String str : set) {
			System.out.println(str);
		}
		/*
		 	four
			one
			two
			three
			five
            출력값 -> 입력한 순서와 다른 순서로 출력된다 (해시코드로 형태로 저장하기 때문)		 
		 */
		// TreeSet의 경우 문자열을 저장할 때 오름차순으로 정리한다.
		
		
		// toArray 의 리턴타입은 object
		System.out.println("< toArray() 이용한 출력 >");
		Object[] arr = set.toArray(); //object배열 형태
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
//			System.out.println(arr[i].toString());
		}
		
//		각각이 object 형이기 때문에 for문으로 접근해서 object형으로 바꾸어줘야한다.
//		String[] arr1 = (String[])(set.toArray()); //object배열 형태
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
////			System.out.println(arr[i].toString());
//		}
		
	
		/*
		 * Iterator(순환객체) 주요메소드
		 *    - hasNext() : 데이터 존재여부판단
		 *    - next()	  : 데이터 접근
		 */
		// Iterator 제네릭 형태 
		System.out.println("< Iterator 이용한 출력 >");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
		
	}
}
