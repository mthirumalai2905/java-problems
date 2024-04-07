package Intermediate;

public class SlidingWindow {

    public static int maxSum(int[] nums, int k){
        if(nums == null || nums.length == 0 || k <= 0 || k > nums.length){
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        //initializing two pointers
        int i = 0;
        int j = 0;

        //Actual implementation of sliding window
        while (j < nums.length) {
            windowSum += nums[j];
            j++;

            //Make the window small if the k increases i.e i++ and j++
            if(j - i > k){
                windowSum -= nums[i];
                i++;
            }

            //Update the maximum sum
            if(j - i == k){
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int result = maxSum(nums, k);
        System.out.println("Maximum sum of subarray of size " + k + ": " + result);
    }
}
