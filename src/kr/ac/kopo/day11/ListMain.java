package kr.ac.kopo.day11;

import java.util.LinkedList;
import java.util.List;
/*
	List : 순서 O, 중복 O
	 - ArrayList
	 - LinkedList
	 
	 add()
	 get()
	 size()
	 remove()
	 isEmpty()
	 contains()
	 clear()
*/
public class ListMain {
	public static void main(String[] args) {
		// 제네릭은 참조자료형만 가능하다.
//		List<int> list = new ArrayList<int>();
		
		//mapper 클래스
//		List<Integer> list = new ArrayList<Integer>();
		
		// 객체에 String을 적어주지 않아도 String인것을 안다
//		List<String> list = new ArrayList<String>();
		
		// ArrayList객체를 LinkedList 바꿔도 아무변화가 없다
		// ArrayList는 데이터가 많아질수록 무겁게 느껴지고 속도가 느려진다 그럴때는 LinkedList객체로 바꿔준다.
		// ArrayList를 묵시적 형변환으로 List로 받는 이유
//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		// String 만 가능
//		list.add(10);
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("one");
	
		System.out.println("전체 원소의 갯수 : " + list.size() + "개");
		
		System.out.println("< PRINT >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
													//boolean remove(String) : 삭제가 성공하면 true
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		
		System.out.println();
		System.out.println("< 1.5버전 >");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("0번지 문자열 : " + list.get(0));
													// String remove(int) : 삭제를 성공하면 삭제한 문자열이 리턴된다.
		System.out.println("0번지 위치한 문자열 삭제 : " + list.remove(0));
		System.out.println("0번지 문자열 : " + list.get(0));
		System.out.println("-------------------------------");
		List<Integer> listInt = new LinkedList<>();
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		System.out.println("0번지 : " + listInt.get(0));
		System.out.println("0번지 위치한 0 삭제 : " + listInt.remove(0));
		System.out.println("0번지 위치한 \"0\" 삭제 : " + listInt.remove("0"));
		
	}
}
