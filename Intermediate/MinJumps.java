package Intermediate;

public class MinJumps {
    
    public static int minJumps(int[] nums) {
        int n = nums.length;
        
        
        if (n <= 1) 
            return 0;
        
        
        if (nums[0] == 0) 
            return -1;
        
        int[] jumps = new int[n]; 
    
        for (int i = 1; i < n; i++) 
            jumps[i] = Integer.MAX_VALUE;
        
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                
                if (j + nums[j] >= i && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                }
            }
        }
        
        
        return jumps[n-1] != Integer.MAX_VALUE ? jumps[n-1] : -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Minimum number of jumps required: " + minJumps(nums)); 
    }
}

