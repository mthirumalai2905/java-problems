public class SubsetSum {
    static boolean t[][] = new boolean[102][1002];

    public static boolean Finder(int[] arr, int sum, int n){
        if (sum == 0)
          return true;
        if (n == 0)
          return false;
        if(t[n][sum])
          return true;
        if(arr[n-1] <= sum){
           return  Finder(arr, sum - arr[n-1], n-1) || Finder(arr, sum, n-1);
        } 
        return Finder(arr,sum,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = arr.length;
        boolean result = Finder(arr, sum, n);
        if(result){
            System.out.println("Subset with the given sum exits");
        } else {
            System.out.println("Subset with the given sum does not exist");
        }
    }
}

