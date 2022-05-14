package com.methodoverloading.payment;

public class Payment {
       public String payment(String username,String password,double totalAmt) {
    	   System.out.println("Payment.payment(): NetBanking");
    	   String message ="Payment done through net banking";
    	   return message;
       }
       public String payment(String cardno,int cvv,String expiraydate,double totalAmt) {
    	   System.out.println("Payment.payment():Credit/Debit");
    	   String message ="Payment done through credit/debit";
    	   return message;
       }
       public String payment(String upiNo,double totalAmt) {
    	   System.out.println("Payment.payment(): UPI");
    	   String message ="Payment done through UPI";
    	   return message;
       }
}
