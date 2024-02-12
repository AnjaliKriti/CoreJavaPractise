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
