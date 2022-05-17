package com.skilllogic.methodoverriding.test;

import com.skilllogic.methodoverriding.HDFC;
import com.skilllogic.methodoverriding.RBI;
import com.skilllogic.methodoverriding.SBI;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test.main() method....");
		SBI sbi = new SBI();
		double result =sbi.getRateOfInterest();
		System.out.println("SBI rate of interest in % :"+result);
		RBI hdfc = new HDFC();
		double hdfcresult  = hdfc.getRateOfInterest();
		System.out.println("HDFC rate of interest in % : "+hdfcresult);
	}
}
