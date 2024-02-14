package org.example.service.collections;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Write a program to find duplicate value from the two sets of array and return the duplicate values in
//another array
public class DuplicateNumberInTwoArray {

    public static void  main(String arr[]){

        int arr1[] = {1,3,5,7,9};
        int arr2[] = {4,5,6,7,8,9};

        duplicateValueUsingCollection(arr1,arr2);


    }

    private static void duplicateValue(int[] arr1, int[] arr2) {

        int size = Math.max(arr1.length,arr2.length);
        int newArr[] = new int[size];
        int index =0;

        for (int i : arr1){
            for(int j: arr2){
                if (i == j){
                    newArr[index] = i;
                    index++;
                }
            }
        }
       for(int i =0; i< index ; i++){
           System.out.println(newArr[i]);
       }
    }


    private static void duplicateValueUsingCollection(int[] arr1, int[] arr2) {
        Set<Integer> newSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        for(int i : arr1){
            newSet.add(i);
        }
        for(int j : arr2){
            if(!newSet.add(j)){
                duplicateSet.add(j);
            }
        }
        int index =0;
        int newArr[] = new int[duplicateSet.size()];
        for (int k : duplicateSet) {
            newArr[index] = k;
            index++;
        }
        System.out.println("Duplicate values: " + Arrays.toString(newArr));

    }
}
