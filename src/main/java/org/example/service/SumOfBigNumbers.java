package org.example.service;

import java.math.BigInteger;

//String a="2345655555555555555555555555555555434555555555555555555555555678888888888888888888888888888888888888888888887666666666666666666666666666666666665";
//String b="89765448298657662867847858789287595877948785775999938578587509845749762864857897467588674949889588799578584748857658590089874551216695794561123288758";
public class SumOfBigNumbers {

    public static void main(String[] args) {
        String a="2345655555555555555555555555555555434555555555555555555555555678888888888888888888888888888888888888888888887666666666666666666666666666666666665";
        String b="89765448298657662867847858789287595877948785775999938578587509845749762864857897467588674949889588799578584748857658590089874551216695794561123288758";

        String sum = addBigNumbersUsingBigInteger(a,b);
        System.out.println("add Big Numbers Using BigInteger: " + sum);

        String addition = addBigNumberUsingInt(a,b);
        System.out.println("add Big Numbers Using Int: " + addition);
    }

//     1st Method
    private static String addBigNumbersUsingBigInteger(String a, String b) {

        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);
        return sum.toString();
    }


    // 2nd Method
    private static String addBigNumberUsingInt(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(),b.length());
        a = padZeros(a,maxLength);
        b = padZeros(b,maxLength);

        for(int i=maxLength-1; i>= 0; i--){
            int numA = Character.getNumericValue(a.charAt(i));
            int numB = Character.getNumericValue(b.charAt(i));

            int sum = numA + numB + carry;
            carry= sum/10;
            result.insert(0, sum%10);
        }
        if (carry>0){
            result.insert(0,carry);
        }

        return result.toString();
    }

    private static String padZeros(String num, int maxLength) {
        StringBuilder paddedStr = new StringBuilder(num);
        while(paddedStr.length()< maxLength){
            paddedStr.insert(0,'0');
        }
        return paddedStr.toString();

    }


}
