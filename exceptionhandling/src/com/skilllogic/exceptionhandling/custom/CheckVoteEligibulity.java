package com.skilllogic.exceptionhandling.custom;

public class CheckVoteEligibulity {
	public void checkEligible(int age,String name) {
		if(age<0)
			throw new InvalidVoter("You are Invalid Voter");
		if(age>=18)
			System.out.println("Mr/Miss "+name+"  You are eligible for voting");
		else
			System.out.println("Mr/Miss "+name+"  You not are eligible voting");
	}
	public static void main(String[] args) {
		CheckVoteEligibulity cv = new CheckVoteEligibulity();
		cv.checkEligible(-10, "Raja");
	}
}
