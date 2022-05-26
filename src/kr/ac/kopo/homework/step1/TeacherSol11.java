package kr.ac.kopo.homework.step1;

/*
 * Sol_11
 */
public class TeacherSol11 {
	public static void main(String[] args) {
	
		// Math.random()
		// 0부터 1미만의 숫자가 생성
		
		// 0부터 30까지의 난수
		int num1 = (int)(Math.random() * 30) + 1;
		int num2 = (int)(Math.random() * 30) + 1;
		int num3 = (int)(Math.random() * 30) + 1;
		int num4 = (int)(Math.random() * 30) + 1;
		
		System.out.println(num1 + " : " + num2 + " : " + num3 + " : " + num4);
		
		// 첫번째 방법
		int max = num1> num2 ? num1 : num2;
		if(max < num3) {
			max = num3;
		}
		
		if(max < num4) {
			max = num4;
		}
		
		System.out.println("가장 큰 수 : " + max);
		
		// 두번째 방법
		int max01 = num1 > num2 ? num1 : num2;
		int max02 = num3 > num4 ? num3 : num4;
		int max2 = max01 > max02 ? max01 : max02;
		
		System.out.println("가장 큰 수 : " + max2);
	}
}
