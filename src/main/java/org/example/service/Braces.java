package org.example.service;

import java.util.Stack;

//String input = "[{(})]]"; -the braces are  not balanced
// String input = "[{()}]"; -the braces are balanced
//String input = "[{()}](){}";
public class Braces {

    public static void main (String[] args) {
        Boolean result= true;
        String input = "[{(})]]";
        isBalanced(input);
        String input1 = "[{()}]";
        isBalanced(input1);
        String input2 = "[{()}](){}";
        isBalanced(input2);


    }

        public static void isBalanced (String str) {
            Stack<Character> stack = new Stack<>();
            Boolean balanced = true;
            for (char ch : str.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    balanced = false;
                    break;
                }
            }

            if (balanced)
                System.out.println(str + " Balanced braces");
            else System.out.println(str + " Not Balanced braces");
        }
}
