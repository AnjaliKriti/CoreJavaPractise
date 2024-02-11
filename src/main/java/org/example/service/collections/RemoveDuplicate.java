package org.example.service.collections;

import java.util.Arrays;

public class RemoveDuplicate {


// remove duplicate from Array, without using collections and without creating new array
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                arr[index + 1] = arr[i];
                index++;
            }
        }
        Arrays.stream(arr, 0, index + 1).forEach(i -> System.out.println(i));
    }

}
