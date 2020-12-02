package com.khunaungpaing.ass8;

public class InterestRate {
	
	double getRate (int month, double deposit, double interest) {
		return ((interest/100)*deposit)*month;
	}

	
}
