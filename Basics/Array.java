package Basics;
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[4] = 5;

        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]);
        }
        System.out.println();

        arr[3] = 4;
        for(int num : arr){
            System.out.print(num);
        }

        
    }
}
