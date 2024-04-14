package Intermediate;

public class JosephusProblem {
    public static int josephus(int n, int k){
        if( n== 1 ){
            return 0;
        }
        return (josephus(n-1, k) + k) % n;
    }
    public static void main(String[] args) {
        int n = 7; // Total number of people
        int k = 3; // Counting interval
        int survivorIndex = josephus(n, k) + 1; // Adding 1 to convert zero-based indexing to one-based indexing
        System.out.println("The survivor's position is: " + survivorIndex);
    }
}
