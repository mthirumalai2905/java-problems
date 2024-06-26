package Intermediate;

import java.util.Arrays;

public class ProductExceptItself {
    private static int[] manipulate(int[] arr){
       int[] left = new int[arr.length];

       int[] right = new int[arr.length];

       left[0] = 1;
       for(int i = 1; i < arr.length; i++){
        left[i] = left[i-1] * arr[i-1];
       }

       right[arr.length - 1] = 1;
       for(int i = arr.length - 2; i >= 0; i--){
        right[i] = right[i + 1] * arr[i + 1];
       }

       int[] ans = new int[arr.length];
       for(int i = 0; i < arr.length; i++){
        ans[i] = left[i] * right[i];
       }

       return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] res = manipulate(arr);
        System.out.print(Arrays.toString(res));
    }
}
