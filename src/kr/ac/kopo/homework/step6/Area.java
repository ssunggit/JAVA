package kr.ac.kopo.homework.step6;

public class Area {
	int number1;
	int number2;
	
	Area(){	
	}
	
	Area(int number1, int number2){	
		this.number1 = number1;
		this.number2 = number2;
	}
	
	int square(int number1) {
		return number1*number1;
	}
	
	int rectangle(int number1, int number2) {
		return number1*number2;
	}
	
	double triangle(int number1, int number2) {
		return 0.5*number1*number2;
	}
	
	double circle(int number1) {
		return Math.PI*number1*number1;
	}
	
	

}

