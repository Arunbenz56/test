package com.testing;

public class LastDigit {
	
	
	public void lastdigit(int number) {
		
		int lastDigit;
		lastDigit=number%10;
		System.out.println("Last digit is " + lastDigit);

	}
	
	public static void main(String[] args) {
		LastDigit digit=new LastDigit();
		digit.lastdigit(565455);
	}
}
