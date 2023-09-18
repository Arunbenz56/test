package com.testing;

import java.util.Scanner;

public class VoweOrConsonant {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character");
		char c = scanner.next().charAt(0);
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println(c + "is vowel");
		}
		else {
			System.out.println(c + " is consonant");
		}

	}

}
