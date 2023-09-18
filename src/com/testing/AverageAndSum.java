package com.testing;

import java.util.Scanner;

public class AverageAndSum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		System.out.println("enter the values");
		int[] arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

		int evensum=0;
		int oddsum=0;
		int evencount=0;
		int oddcount=0;
		for (int i : arr) {
			if (i%2==0) {
				evensum=i+evensum;
				evencount++;


			}
			else {
				oddsum=i+oddsum;
				oddcount++;
			}
		}
		System.out.println("Sum of even number is "+ evensum);
		System.out.println("Sum of odd number is "+ oddsum);
		System.out.println("Average of even number is "+ evensum/evencount);
		System.out.println("Average of odd number is "+ oddsum/oddcount);





	}

}
