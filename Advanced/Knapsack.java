package Advanced;


public class Knapsack {
    static int[][] memo = new int[102][1002];

    public static int knapSack(int weight[], int val[], int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (memo[n][w] != 0) {
            return memo[n][w];
        }

        if (weight[n - 1] <= w) {
            return memo[n][w] = Math.max(val[n - 1] + knapSack(weight, val, w - weight[n - 1], n - 1), knapSack(weight, val, w, n - 1));
        } else {
            return memo[n][w] = knapSack(weight, val, w, n - 1);
        }
    }

    public static void main(String[] args) {
        int values[] = new int[]{60, 100, 120};
        int weights[] = new int[]{10, 20, 30};
        int capacity = 50;
        int n = values.length;
        System.out.println("Maximum value that can be obtained is " + knapSack(weights, values, capacity, n));
    }
}
