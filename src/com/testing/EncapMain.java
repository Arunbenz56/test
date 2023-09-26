package com.testing;

public class EncapMain{
	public static void main(String[] args) {
		EncapPrivate private1=new EncapPrivate();
		int age = private1.getAge();
		String name = private1.getName();
		System.out.println(age);
		System.out.println(name);
	}

}
