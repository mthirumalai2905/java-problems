package Basics;

public class SumOfDigitsUSingRecursion {
    private static int sod(int n){
        int sum = 0;
        if(n <= 9){
            return n;
        }
        return (sum += n % 10) + sod(n/10); 
    }
    public static void main(String[] args) {
        int number = 1532;
        int result = sod(number);
        System.out.print(result);
    }
}
