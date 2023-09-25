package com.testing;

public class RuralBank extends IciciBank {
@Override
public void savings() {
	System.out.println("intrest rate is 50%");
	//super.savings();
}
@Override
	public void deposit() {
		System.out.println("intrest rate is 75%");
		//super.deposit();
	}
public static void main(String[] args) {
	RuralBank bank=new RuralBank();
	bank.savings();
	bank.deposit();
	
}
}
