package kr.ac.kopo.homework.step5;

public class Calculator {
	
	int plus(int num1, int num2) {
		return num1 + num2;
	}

	int minus(int num1, int num2) {
		return num1 - num2;
	}

	int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	double division(int num1, int num2) {
		return (double)num1 / num2;
	}
	
	boolean primeNumber(int num1) {
		for(int i = 2; i < num1 ; i++) {
			if(num1%i==0) {
				return false;
			}
		}
		return true;
	}

}
