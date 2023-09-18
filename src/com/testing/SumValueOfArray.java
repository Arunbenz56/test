package com.testing;

public class SumValueOfArray {

public static void main(String[] args) {
    
    int[] array = {21, 7, 8, 45, 65, 1, 98, 6, 9};

    
    int sum=0;

    
    for (int num : array) {
        sum += num;
    }

   
    System.out.println("The sum of the array elements is: " + sum);
}
}
