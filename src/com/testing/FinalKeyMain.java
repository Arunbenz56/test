package com.testing;

public class FinalKeyMain extends FinalKey {
	@Override
	public void shape() {
		System.out.println("shape is square");
	}
	

	public static void main(String[] args) {
		FinalKeyMain main=new FinalKeyMain();
		main.shape();
		System.out.println(FinalKey.VALUE);

	}
}
