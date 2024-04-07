package Basics;

class Rotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 2; // Number of rotations
        
        // Perform array rotation
        rotateArray(arr, rotations);
        
        // Print the rotated array
        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArray(int[] arr, int rotations) {
        int n = arr.length;
        int[] temp = new int[n];
        
        // Copy elements to temporary array with rotation
        for (int i = 0; i < n; i++) {
            temp[(i + rotations) % n] = arr[i];
        }
        
        // Copy elements back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
