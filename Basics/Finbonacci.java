package Basics;
public class Finbonacci {
    private static int Fibonacci(int n){
        if( n <= 1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 100;

        System.out.print("Fibonacci sequence goes as below ");
        for(int i=0; i<=n; i++){
            System.out.print(Fibonacci(i) + ",");
        }
    }
    
}
