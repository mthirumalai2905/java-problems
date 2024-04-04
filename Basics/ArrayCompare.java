package Basics;
import java.util.Arrays;

public class ArrayCompare {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6};

        if(Arrays.equals(arr, arr2)){
            System.out.println("The 2 arrays are same");
        } else {
            System.out.print("They are not same");
        }
    }
}
