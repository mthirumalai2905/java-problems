package Intermediate;

public class MountainArray {
    public static boolean isMountainArray(int[] arr){
        int n = arr.length;
        int i = 0;

        while(i + 1 < n  && arr[i] < arr[i+1]){
             i++;
        }

        // Checking if the peak is not first or last element;
        if(i == 0 || i == n - 1){
            return false;
        }

        while(i + 1 < n && arr[i] > arr[i+1]){
            i++;
        }

        //If we reached the end, it's a mountain
        return i == n - 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,4,2};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {5,4,3,2,1};

        System.out.println("Is arr1 a mountain array? " + isMountainArray(arr1));
        System.out.println("Is arr2 a mountain array? " + isMountainArray(arr2));
        System.out.println("Is arr3 a mountain array? " + isMountainArray(arr3));
    }
}
