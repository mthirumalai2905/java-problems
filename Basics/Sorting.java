package Basics;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,7,6,9,8,10};

        for(int i =0;i < arr.length; i++){
            for(int j = 0; j < arr.length - i -1; j++){
                  if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                  }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
