package com.skilllogic.exceptionhandling.throwkey;

public class CalcucateDiv {
	public void calculateDivision(int a,int b) {
		if(b==0)
			throw new ArithmeticException("Don't provide value 0");
		int c = a/b;
		System.out.println("Result "+c);
	}
	public static void main(String[] args) {
		 CalcucateDiv cd = new CalcucateDiv();
		 cd.calculateDivision(10, 0);
	}
}
