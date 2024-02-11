package org.example.service.string;

import java.util.Arrays;
import java.util.HashMap;

// Given two strings, write a function to determine if they are anagrams of each other.
public class Anagram {

    public static void main (String[] args) {
        String input1 = "EAT";
        String input2 = "TEA";

       Boolean result = isAnagram(input1,input2);
       if(result) System.out.println("Given Strings are Anagram " + input1 + " and " + input2);
       else System.out.println("Given Strings are Not Anagram " + input1 + " and " + input2);

    }

    private static Boolean isAnagram(String input1, String input2) {

        if(input1.length() != input2.length()) return false;

        char[] charInput1 = input1.toCharArray();
        char[] charInput2 = input2.toCharArray();

        Arrays.sort(charInput1);
        Arrays.sort(charInput2);
        if(Arrays.equals(charInput1,charInput2))
            return true;

        return false;
    }
}
