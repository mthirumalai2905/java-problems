package Intermediate;

import java.util.Arrays;

public class Rotater {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            temp[(i + 2) % arr.length] = arr[i];
        }

       for(int i = 0; i < arr.length; i++){
        arr[i] = temp[i];
       }

       System.out.print(Arrays.toString(arr));
    }
}
