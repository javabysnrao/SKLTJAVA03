package com.skilllogic.exceptionhandling.throwskey;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileData {
	
	public void readFile() throws IOException,ArithmeticException {
		FileInputStream fis = new FileInputStream("D:/a.txt");
	    int i;
	    while((i=fis.read())!=-1) {
	    	System.out.print((char)i);
	    }
	    int a =10,b=0,c;
	    c=a/b;
	    System.out.println("Result "+c);
	}
}
