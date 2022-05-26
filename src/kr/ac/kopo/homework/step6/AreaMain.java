package kr.ac.kopo.homework.step6;

import java.util.Random;

// 4. 
/*
메인 메소드를 구현합니다. 메인 메소드의 역할은 아래와 같습니다. 

면적을 구할 도형의 종류를 표현할 랜덤한 숫자를 생성합니다.(1 ~ 4) 

예> 1-정사각형, 2-직사각형, 3-삼각형, 4-원 

생성된 숫자에 따라서  

1, 4번일 경우는 도형의 면적을 구할 랜덤 숫자를 1개 합니다. 

2, 3번일 경우는 도형의 면적을 구할 랜덤 숫자를 2개 생성합니다. 

면적을 구할 랜덤 숫자까지 생성되었다면 각각의 도형의 면적을 구하는 클래스를 호출합니다. 

출력결과는 아래와 같이 출력됩니다. 

정사각형일 경우 : 정사각형의 면적은 9 입니다 

직사각형일 경우 : 직사각형의 면적은 12 입니다 

삼각형일 경우   : 삼각형의 면적은 6 입니다 

원일 경우       : 원의 면적은 6 입니다 
*/
public class AreaMain {
	public static void main(String[] args) {
		int ramdom = (int)(Math.random()*4)+1;
		
		int number1 = 0;
		int number2 = 0;
		
		Area a = new Area();

		if (ramdom == 1 || ramdom == 4) {
			number1 = (int)(Math.random()*10)+1;
			if(ramdom == 1) {
				// 정사각형
				System.out.println("정사각형일 경우 : 정사각형의 면적은 "+ a.square(number1)+" 입니다 ");
			}else {
				// 원
				System.out.println("원일 경우 : 원의 면적은 "+ a.circle(number1) +" 입니다 ");
			}
		}else if(ramdom == 2 || ramdom == 3) {
			number1 = (int)(Math.random()*10)+1;
			number2 = (int)(Math.random()*10)+1;
			if(ramdom == 2) {
				a.rectangle(number1, number2);
				System.out.println("직사각형일 경우 : 직사각형의 면적은 "+ a.rectangle(number1, number2) +" 입니다 ");
			}else {
				System.out.println("삼각형일 경우 : 삼각형의 면적은 "+ a.triangle(number1, number2) +" 입니다 ");
				
			}
		}
		
		
		
		
	}

}
