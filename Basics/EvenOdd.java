package Basics;

import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : arr) {
            if (num % 2 == 0 && evenIndex < arr.length) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else if (num % 2 != 0 && oddIndex < arr.length) {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }
}
