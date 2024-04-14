package Intermediate;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && c == '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "()"; // true
        String s2 = "()[]{}"; // true
        String s3 = "(]"; // false
        String s4 = "([)]"; // false
        String s5 = "{[]}"; // true

        System.out.println("String s1 is valid: " + isValid(s1));
        System.out.println("String s2 is valid: " + isValid(s2));
        System.out.println("String s3 is valid: " + isValid(s3));
        System.out.println("String s4 is valid: " + isValid(s4));
        System.out.println("String s5 is valid: " + isValid(s5));
    }
}
