package kr.ac.kopo.day02;
import java.util.Random;

/**
 * 로또와 관련된 여러가지 기능 클래스
 * @author 박현성
 * 
 */
public class LottoUtil {
	  /**
	    * 오늘의 로또 확률을 알려주는 메소드
	    */
	   public void todayProbability() {
	      
	      //임의의 난수를 표현하는 메소드
	      //Math.random()
	      //java.util.Random
	      
	      Random r = new Random();
	      // 0~100사이의 정수만 추출한다 101로 나눈 나머지
	      int q = r.nextInt(101);
	      
	      System.out.println("오늘의 로또 확률은 "+"%입니다");
	   }
}
