public class CountSubsetSum {
    static int t[][] = new int[102][1002];

    public static int Finder(int[] arr, int sum, int n){
        if (sum == 0)
           return 1;
        if (n == 0)
           return 0;
        if(t[n][sum] != 0){
            return t[n][sum];
        }
        if(arr[n-1] <= sum){
            return t[n][sum] = Finder(arr, sum - arr[n-1], n-1) + Finder(arr,sum, n-1);
        }
        return t[n][sum] =  Finder(arr, sum, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = arr.length;
        int count = Finder(arr, sum, n);
        System.out.println("Number of subsets with the given sum: " + count);
    }
}

