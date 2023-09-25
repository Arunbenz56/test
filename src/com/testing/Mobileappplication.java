package com.testing;


public class Mobileappplication extends Business {

	@Override
	public void login() {
		System.out.println("Login id is created");
		
	}

	@Override
	public void flightSearch() {
		System.out.println("all searched flights are displayed");
		
	}
	public static void main(String[] args) {
		Mobileappplication app = new Mobileappplication();
		app.signup();
		app.login();
		app.flightSearch();
	}

}
