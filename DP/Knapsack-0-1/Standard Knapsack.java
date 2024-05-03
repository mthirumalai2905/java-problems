public class KnapSack {
    static int t[][] = new int[102][1002];

    public static int Finder(int[] weight, int[] values, int capacity, int n){
        if(n == 0 || capacity == 0){
            return 0;
        }
        if(t[n][capacity] != 0){
            return t[n][capacity];
        }
        if(weight[n-1] <= capacity){
            return t[n][capacity] =  Math.max(values[n-1] + Finder(weight, values, capacity - weight[n-1], n-1), Finder(weight, values, capacity, n - 1));
        } else {
            return t[n][capacity] =  Finder(weight, values, capacity, n -1);
        }
      
    }
    public static void main(String[] args){
        int[] weight = {5,1,6,8,3};
        int[] values = {100,140,160,200,300};
        int capacity = 11;
        int n = weight.length;
        int result = Finder(weight, values, capacity, n);
        System.out.print("The maximum profit the knapsack can carry is:- " + result);
    }
}

