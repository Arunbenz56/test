package com.testing;

public class SuperKeyMain extends SuperKey{
	
	@Override
	public void addFunctions() {
		System.out.println("Addition of number is 100000");
		super.addFunctions();
	}
	public static void main(String[] args) {
		SuperKeyMain main=new SuperKeyMain();
		main.addFunctions();
		
	}
}
