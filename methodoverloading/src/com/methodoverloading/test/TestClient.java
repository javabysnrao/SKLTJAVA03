package com.methodoverloading.test;

import com.methodoverloading.shopping.ShoopingCart;

public class TestClient {
	public static void main(String[] args) {
		System.out.println("TestClient.main() method.....");
		//Creating ShoopingCart object
		ShoopingCart sc = new ShoopingCart();
		//Preparing the data
		String items[] = {"TV","Mobile"};
		double prices[] = {50000,10000};
		//Calling the ShoopingCart class method
		String result = sc.doShooping(items, prices);
		System.out.println(result);		
	}
}
