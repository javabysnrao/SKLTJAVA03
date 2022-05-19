package com.skilllogic.exceptionhandling.custom;

public class InvalidVoter extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public InvalidVoter(String message) {
		super(message);
	}
}
