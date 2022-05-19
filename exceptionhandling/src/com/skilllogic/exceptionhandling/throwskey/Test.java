package com.skilllogic.exceptionhandling.throwskey;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		ReadFileData rd = new ReadFileData();
		try {
		rd.readFile();
		}catch(IOException io) {
			System.out.println("Read data failed from file");
		}catch(ArithmeticException ae) {
			System.out.println("Division by 0 is not possible");
		}
	}
}
