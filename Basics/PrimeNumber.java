package Basics;
public class PrimeNumber{
    public static void main(String[] args) {
        int n = 17;
        boolean isPrime = true;

        
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
   

        System.out.print("The give number is Prime:- "  + isPrime);
    }
}