package org.example.service.collections;

public class MoveZerosToFront {
    public static void main(String[] args) {
        int[] data = {1, 3, 0, 4, 3, 0, 7};

    int[] newArr =    moveZerosToFront(data);

        // Print the result
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }

    private static int[] moveZerosToFront(int[] array) {
        int index =0;
        int newArr[] = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                newArr[index] = array[i];
                index++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArr[index] = array[i];
                index++;
            }
        }


return newArr;
    }
}
