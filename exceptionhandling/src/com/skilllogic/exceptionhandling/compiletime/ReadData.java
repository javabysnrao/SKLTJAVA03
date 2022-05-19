package com.skilllogic.exceptionhandling.compiletime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReadData {
	public void readDataFile() {
		FileInputStream fis = null ;
		try {
		System.out.println("try block...");
		 fis = new FileInputStream("D:/a.txt");
		int i;
		//it will execute untill end of the fill
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		}catch(FileNotFoundException fne) {
			System.out.println("catch block...");
			System.out.println("File is not exist");
		}catch(IOException io) {
			System.out.println("catch block...");
			System.out.println("Unable to open the file");
		}catch(Exception e) {
			System.out.println("catch block...");
			System.out.println("Internal Problem");
		}finally {
			System.out.println("finally block..");
			try {
				if(fis!=null)
			  fis.close();
			}catch(IOException io) {
			}
		}
	}
	public static void main(String[] args) {
		ReadData rd = new ReadData();//object creation
		rd.readDataFile();//calling the method
	}
}
