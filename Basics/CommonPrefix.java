package Basics;

public class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
         if(strs == null || strs.length == 0){
            return " ";
         }

         String start = strs[0];
         String end =  strs[strs.length - 1];
         int i = 0;
         int j = 0;

         while(i < start.length() && j < end.length()){
            if(start.charAt(i) == end.charAt(j)){
                i++;
                j++;
            } else {
                break;
            }
         }

         return start.substring(0,i);

    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(input);
        System.out.println("Longest common prefix: " + result);
    }
}
