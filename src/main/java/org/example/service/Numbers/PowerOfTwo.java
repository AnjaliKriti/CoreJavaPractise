package org.example.service.Numbers;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        // Input: Taking a number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is not a power of 2
        if (isNotPowerOf2(number)) {
            System.out.println(number + " is not a power of 2.");
        } else {
            System.out.println(number + " is a power of 2.");
        }
    }

    // Function to check if a number is not a power of 2
    private static boolean isNotPowerOf2(int n) {
        // A number is not a power of 2 if it has more than one '1' bit
        return (n & (n - 1)) != 0;
    }
}
//
//
//Explanation :
//Input : 128
//n = 128 and n-1 = 127
//convert into bit
//128:
//        Step 1: 128 / 2 = 64, remainder = 0
//        Step 2: 64 / 2 = 32, remainder = 0
//        Step 3: 32 / 2 = 16, remainder = 0
//        Step 4: 16 / 2 = 8, remainder = 0
//        Step 5: 8 / 2 = 4, remainder = 0
//        Step 6: 4 / 2 = 2, remainder = 0
//        Step 7: 2 / 2 = 1, remainder = 0
//        Step 8: 1 / 2 = 0, remainder = 1
//  128 in decimal = 10000000 in binary
//
//127:
//        Step 1: 127 / 2 = 63, remainder = 1
//        Step 2: 63 / 2 = 31, remainder = 1
//        Step 3: 31 / 2 = 15, remainder = 1
//        Step 4: 15 / 2 = 7, remainder = 1
//        Step 5: 7 / 2 = 3, remainder = 1
//        Step 6: 3 / 2 = 1, remainder = 1
//        Step 7: 1 / 2 = 0, remainder = 1
// 127 in decimal = 1111111 in binary
//
//now perform AND operation on bit 10000000 & 1111111 = 0


