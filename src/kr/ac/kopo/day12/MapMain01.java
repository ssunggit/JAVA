package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 	Map : key, value 쌍의 집합, key에 대한 중복(X)
 	  - HashMap
 	  - TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("< 패스워드 변경 서비스 >");
		System.out.print("아이디를 입력 : ");
		String id = sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 ["+id+"]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			return; // if를 만족하면 종료
		}
		// if에 종료문이 들어있기 때문에 else문을 사용하지 않아도 된다.
		
		System.out.print("기존의 패스워드 입력 : ");
		String password = sc.nextLine();
		// 문자열 문자열의 비교이기때문에 동등비교(==)가 아닌 .equals 사용
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 일치않습니다");
			System.out.println("서비스를 종료합니다.");
			return;
		}
		
		System.out.print("변경할 패스워드 입력 : ");
		String newPassword = sc.nextLine();
		// key 해당하는 값이 새로운 value값으로 변경
		map.put(id, newPassword);
		System.out.println("패스워드 변경이 완료되었습니다");
		
		
		// 1.5 버전의 for문으로도 인덱스나 루프로도 value값을 접근할 수 없음.
		// entrySet : map에 있는 정보를 set형으로 만듬-> return타입
		// 
		System.out.println("< 회원 정보 출력 >");
		System.out.println("---------------------------");
		System.out.println("아이디\t패스워드 ");
		System.out.println("---------------------------");
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}
		
		// Map의 내부클래스인 Entry를 Set형으로 바꿔줌
		/*
		Set<Entry<String, String>> set = map.entrySet();
		for(Entry<String, String> e : set) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		*/
		System.out.println("---------------------------");
	
		
	}
}




