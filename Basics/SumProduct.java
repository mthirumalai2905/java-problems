package Basics;
public class SumProduct {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8};
        int sum = 0;
        int product = 1;

        for(int i=0; i < arr.length; i++){
            sum += arr[i];
        }

        for(int i =0; i<arr.length; i++){
            product *= arr[i];
        }


        System.out.println(sum);
        System.out.println(product);

    }
}
