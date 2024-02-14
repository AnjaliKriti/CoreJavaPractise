package org.example.service.string;
//Given a string, find the length of the longest substring without repeating characters.
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    
    public static void main (String[] args){
        String inputString = "abcabcdbbdefgh";
        String result = longestSubstringWithoutRepeatingCharacterOptimize(inputString);
        System.out.println(result);
    }

    private static int longestSubstringLengthWithoutRepeatingCharacter( String inputString) {

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

    private static String longestSubstringWithoutRepeatingCharacter( String inputString) {

        if(inputString == null || inputString.equals("")) return "Invalid";

        if(inputString != null && inputString.length()== 1){
            return inputString;
        }
        String lonestSubstring ="";
         for( int i = 0; i< inputString.length()-1 ; i++){
             for(int j= i+1; j<inputString.length();j++){
                 boolean nonReapting = true;
                 String subString = inputString.substring(i,j+1);
                 char[] chars =subString.toCharArray();
                 Set<Character> sets = new HashSet<>();
                 for(Character c : chars){
                     if(!sets.add(c)) nonReapting= false;
                 }
                if(nonReapting) {
                    if (lonestSubstring == "") {
                        lonestSubstring = subString;
                    } else {
                        if (subString.length() > lonestSubstring.length()) {
                            lonestSubstring = subString;
                        }
                    }
                }
             }
         }

         return lonestSubstring;

    }

    private static String longestSubstringWithoutRepeatingCharacterOptimize(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return "Invalid";
        }

        int n = inputString.length();
        if (n == 1) {
            return inputString;
        }

        String longestSubstring = "";
        Set<Character> charSet = new HashSet<>();
        int start = 0, end = 0;

        while (end < n) {
            if (!charSet.contains(inputString.charAt(end))) {
                charSet.add(inputString.charAt(end));
                end++;
                if (end - start > longestSubstring.length()) {
                    longestSubstring = inputString.substring(start, end);
                }
            } else {
                charSet.remove(inputString.charAt(start));
                start++;
            }
        }

        return longestSubstring;
    }
}
