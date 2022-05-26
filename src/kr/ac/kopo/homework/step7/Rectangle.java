package kr.ac.kopo.homework.step7;

public class Rectangle extends Area{

	@Override
	public int getNum1() {
	
		return super.getNum1();
	}

	@Override
	public void setNum1(int num1) {
		
		super.setNum1(num1);
	}

	@Override
	public int getNum2() {
		
		return super.getNum2();
	}

	@Override
	public void setNum2(int num2) {
		
		super.setNum2(num2);
	}
	
	public int rectangle() {
		return getNum1() * getNum2();
	}

}
