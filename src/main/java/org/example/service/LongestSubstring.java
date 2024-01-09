package org.example.service;
//Given a string, find the length of the longest substring without repeating characters.
import java.util.HashMap;

public class LongestSubstring {
    
    public static void main (String[] args){
        String inputString = "abcabcdbb";
        int result = longestSubstringWithoutRepeatingCharacter(inputString);
        System.out.println(result);
    }

    private static int longestSubstringWithoutRepeatingCharacter( String inputString) {

        int start = 0;
        int maxlength = 0;
        HashMap<Character,Integer> charIndex = new HashMap<>();

        for(int end =0; end< inputString.length(); end ++){
            char currentChar = inputString.charAt(end);
            if(charIndex.containsKey(currentChar) && charIndex.get(currentChar) >= start ) {
                start = charIndex.get(currentChar) +1;
            }
            charIndex.put(currentChar,end);
            maxlength = Math.max(maxlength,end-start+1);

         }

        return maxlength;
    }
}
