package com.skilllogic.methodoverriding;

public class HDFC implements RBI{
	@Override
	public double getRateOfInterest() {
		return 15.5;
	}
}
