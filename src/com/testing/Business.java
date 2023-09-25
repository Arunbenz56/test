package com.testing;

public abstract class Business {
	//abstract method
	public abstract void login();
	public abstract void flightSearch();
	
	//non abstract method
	public void signup() {
		System.out.println("account creation");

	}

}
