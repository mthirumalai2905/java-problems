package Basics;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6};
        int target = 4;

        for(int i = 0; i < arr.length; i++){
             if(arr[i] == target){
                System.out.println("Target found at index " + i);
                break;
             }
        }
    }
    
}
