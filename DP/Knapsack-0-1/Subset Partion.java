public class PartitionSubsetSum {
    static boolean t[][] = new boolean[102][1002];

    public static boolean Finder(int[] arr, int n, int sum){
        if(sum == 0)
          return true;
        if(n == 0 || sum < 0)
          return false;
        if(t[n][sum]){
            return true;
        }
        if(arr[n-1] <= sum)
          return t[n][sum] = Finder(arr, n -1, sum - arr[n-1]) || Finder(arr, n-1, sum);
        return t[n][sum] = Finder(arr, n-1, sum);
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 2, 2, 1};
        int n = arr.length;
        int sum = 0;
        if(sum % 2 != 0){
            System.out.println("Partition into equal sum subsets is not possible");
        } else {
            sum /= 2;
            boolean result = Finder(arr, n, sum);
            if(result){
                System.out.println("Partition into equal sum subsets is possible");
            } else {
                System.out.println("Partion into equal sum subsets is not possible");
            }
        }
    }
}

