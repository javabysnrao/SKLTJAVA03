package com.methodoverloading.shopping;

import java.util.Arrays;

import com.methodoverloading.payment.Payment;

public class ShoopingCart {
	public String doShooping(String items[],double prices[]) {
		System.out.println("ShoopingCart.doShooping()");
		String itemsPurchased = Arrays.toString(items);
		double totalAmt = 0.0;
		for (double d : prices) {
			 totalAmt = totalAmt+d;
		}
		//Creating Payment class object
		Payment payment = new Payment();
		String message = payment.payment("abc","abc", totalAmt);
		String finalResult ="Purchaged items "+itemsPurchased+"      "+message+" Total Bill ::"+totalAmt;
		return finalResult;
	}
}
