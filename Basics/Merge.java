package Basics;

import java.util.Arrays;

public class Merge{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;

        for(int i = 0;i < arr1.length; i++){
           arr3[k++] = arr1[i];
        }

        for(int j = 0; j <arr2.length; j++){
            arr3[k++] = arr2[j];
        }

        System.out.println(Arrays.toString(arr3));
    }
}