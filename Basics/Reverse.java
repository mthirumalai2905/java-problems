package Basics;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String str = "Hello am monkey D luffy im a pirate";
        // StringBuilder sb = new StringBuilder(str);
        // String rev = sb.reverse().toString();
        // System.out.print(rev);
        String[] arr = str.split(" ");
        int left = 0;
        int right  = arr.length - 1;

        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
        for(String st : arr){
            System.out.print(st + " ");
        }


    }

    
}
