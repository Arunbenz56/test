package com.testing;

public class MultidimensionalArray {
	public static void main(String[] args) {
        
        int[][] array = {
            {2, 6, 8},
            {45, 23, 1},
            {35, 6, 9}
        };
        //int minValue = Integer.MAX_VALUE;
        int temp =0;
        for (int[] number : array) {
			for (int num : number) {
				if (temp > num) {
					temp=num;
				}
			}
		}
        
        System.out.println(temp);
        
}
}
