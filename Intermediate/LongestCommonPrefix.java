package Intermediate;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String lcp(String[] arr){
        Arrays.sort(arr);
        int i =0;
        int j =0;

        String first = arr[0];
        String last = arr[arr.length - 1];

        while(i < first.length() && j < last.length()){
             if(first.charAt(i) == last.charAt(j)){
                i++;
                j++;
               
             } else {
                break;
             }
        }

        return first.substring(0, i);
    }
    public static void main(String[] args) {
        String arr[] = {"flower", "flood", "floor"};
        String res = lcp(arr);
        System.out.print(res);
    }
}
