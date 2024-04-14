package Basics;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};
        int n = arr.length + 1;
        int actualSum = 0;
        int expectedSum = (n * (n+1))/2;
        for(int i = 0; i < arr.length; i++){
            actualSum += arr[i];
        }
        System.out.print(expectedSum - actualSum);
    }
}
