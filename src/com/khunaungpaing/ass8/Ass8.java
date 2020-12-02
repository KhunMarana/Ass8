package com.khunaungpaing.ass8;

public class Ass8 {

	public static void main(String[] args) {
		
		double interest = 5;
		double deposit_per_month = 50.0;
		int oneYear = 12;

		InterestRate obj = new InterestRate();
		
		double rate = obj.getRate(oneYear,deposit_per_month,interest);
		System.out.println("Interest Rate -> "+rate);
		
	}
}
