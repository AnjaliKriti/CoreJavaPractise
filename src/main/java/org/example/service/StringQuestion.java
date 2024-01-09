package org.example.service;

//        Given a string with redundant consecutive characters.
//        Convert string such that resultant string contains characters with its consecutive occurrence count.
//        Input: aaabbbccda
//        Output: a2b2c1da
//        Input: ab
//        Output: ab
public class StringQuestion {

    public static void main (String[] args){

        StringBuffer updatedInput =new StringBuffer("");
        String input = "ab";


        int count = 0;
        for (int i = 0; i < input.length(); i++){
           if (i==0) updatedInput.append(input.charAt(0));
           else {
              if( input.charAt(i) == updatedInput.charAt(updatedInput.length()-1)){
                  count++;
              }else {
                  if(count>0) {
                      updatedInput.append(count).append(input.charAt(i));
                      count = 0;
                  }else updatedInput.append(input.charAt(i));
              }
           }
       }
    System.out.println(updatedInput);

        String in = "ab";
//        String[] substrings = str.split("");
//
//        for (String ch : substrings) {
//            System.out.print(ch + " ");
//        }
    }
}
