package org.example.service.Numbers;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        int num = number;
        int reverseNumber =0;
        int last =0;

        while(number != 0){
            last = number % 10;
            reverseNumber = reverseNumber * 10 + last;
            number = number/10;
        }

        if ( reverseNumber == num){
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is Not Palindrome");
        }
    }
}
