package com.testing;

public class SwappingNumber {
	public static void main(String[] args) {
		int a=5;
		int b=10;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);

	}
}
