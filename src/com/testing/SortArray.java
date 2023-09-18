package com.testing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
public static void main(String[] args) {
	int[] arr= {5,-2,23,75,-43,87};
	System.out.println("before sorting");
	for (int i : arr) {
		System.out.println(i);
	}
	Arrays.sort(arr);
	System.out.println("after sorting");
	for (int k : arr) {
		System.out.println(k);
	}
}
}
