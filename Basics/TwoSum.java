package Basics;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int target = 9;
        int[] res = new int[2];

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
              if(arr[i] + arr[j] == target){
                    res[0] = i;
                    res[1] = j;
              }
            }
        }

        System.out.print(Arrays.toString(res));
    }
}
