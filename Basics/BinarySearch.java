package Basics;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 6, 7};
        int target = 6;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Element Found at index " + mid);
                return; // Element found, no need to continue searching
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If we reach here, the element was not found
        System.out.println("Element not found");
    }
}
