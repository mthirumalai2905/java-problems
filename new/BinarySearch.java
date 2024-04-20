public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int right = arr.length - 1;
        int target = 14;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
              System.out.print("Element found at index:- " + mid);
              return;
            }

            if(arr[mid] > target){
                right = mid - 1;
            }

            if(arr[mid] < target){
                left = mid + 1;
            }
        }
        System.out.print("Element not found");

        
    }
}
