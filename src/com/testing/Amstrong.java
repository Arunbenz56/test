package com.testing;

public class Amstrong {
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int a=0;
		while (num>0) {
			int n=num%10;
			a=a+(n*n*n);
			num=num/10;

		}
		if (a==temp) {
			System.out.println("Amstrong number");
		} else {
			System.out.println("Not an Amstrong number");
		}
	}

}
