package org.example.service.string;

public class LongestPalindromeSubstring {

    public static void main(String [] args){

        longestPalindrome("abbd");

    }

        public static String longestPalindrome(String s) {

            String input = s;
            String longestPalindrome="";

            if(s.length()==1){
                if(longestPalindrome == null || longestPalindrome.equals(""))
                    longestPalindrome = s;
            } else {
                for (int k=0; k< s.length()-1; k++) {
                    for (int i = 1; i < s.length(); i++) {
                        String newString = s.substring(k, i + 1);
                        String reverseInput = new StringBuilder(newString).reverse().toString();
                        if (newString.equals(reverseInput)) {
                            if (longestPalindrome == null || longestPalindrome.equals(""))
                                longestPalindrome = newString;
                            else if (newString.length() > longestPalindrome.length()) longestPalindrome = newString;
                        }
                    }
                }
            }


            System.out.println("Longest Palindrome : " + longestPalindrome);
            return longestPalindrome;
        }

}
