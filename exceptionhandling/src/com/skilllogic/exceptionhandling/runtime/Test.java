package com.skilllogic.exceptionhandling.runtime;

public class Test {
	
	public void division(int a,int b) {
		System.out.println("Test.division() started....");
		 int c=0 ;
		try {
		  c = a/b;
		  String s= "Raja";
		  System.out.println("Lenth "+s.length());
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch(NullPointerException ne) {
			ne.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		 System.out.println("Result "+c);
		 System.out.println("Some important code..");
		 System.out.println("End of division() method...");
	}
	public static void main(String[] args) {
		System.out.println("Test.main() started....");
		 Test t = new Test();
		 t.division(10, 2);
		 System.out.println("End of main() method....");
	}
}
