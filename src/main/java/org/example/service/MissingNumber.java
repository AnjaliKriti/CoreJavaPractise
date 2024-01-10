package org.example.service;
//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing
public class MissingNumber {

    public static void main (String[] args){
         int arr[] = {0,1,3};
         int missingNumber = findMissingNumber(arr);
         System.out.println(missingNumber);

    }

    private static int findMissingNumber(int[] arr) {

        int length = arr.length;
        int expectedSum = length * (length+1) / 2;
        int actualSum =0;
        for(int i : arr){
            actualSum+=i;
        }
        return expectedSum - actualSum;
    }
}
