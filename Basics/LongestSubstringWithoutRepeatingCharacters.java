package Basics;

import java.util.HashSet;


public class LongestSubstringWithoutRepeatingCharacters {
    public static String longestSubstringWithoutRepeating(String s) {
       HashSet<Character> set = new HashSet<>();

       int maxLength = 0;
       int i = 0, j = 0;

       while(i < s.length() && j < s.length()){
        char ch = s.charAt(j);
        if(!set.contains(ch)){
            set.add(ch);
            j++;
            maxLength = Math.max(maxLength, j - i);
        } else {
            set.remove(s.charAt(i));
            i++;
        }
       }

      return s.substring(0, maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = longestSubstringWithoutRepeating(input);
        System.out.println(result); // Output should be "abc"
    }
}
