package kr.ac.kopo.day02;


/*
 * 조건문
 * 
 * if(조건){
 * 	   문장;
 * }
 * 
 * if(조건){
 * 	   문장1;
 * }else{ //블럭은 항상 키워드 옆에 쓴다.
 * 	   문장2;
 * }
 * 조건? 문장1 : 문장2
 * 
 * 보유하고 있는 책 권수를 입력 : 1
 * 1 book
 * 
 * 보유하고 있는 책 권수를 입력 : 4
 * 4 books
 * 
 * 
 * 
 */


public class IFMain01 {
	
	public static void main(String[] args) {
		int book = 1;
		
		System.out.print(book + "book");
		
		if(book >= 2) {
			System.out.println("s");
		}
		
		if(book == 1) {
			System.out.println(book +"book");
		}else{
			System.out.println(book +"books");
		}
		
		
	}
	
}
