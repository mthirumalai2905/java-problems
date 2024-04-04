package Basics;
public class GCD {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Finding GCD
        int gcd = findGCD(a, b);
        System.out.println("The GCD of two numbers is: " + gcd);

        // Finding LCM using the GCD
        int lcm = (a * b) / gcd;
        System.out.println("The LCM of two numbers is: " + lcm);
    }

    private static int findGCD(int a, int b){
        while( b != 0){
           int temp = b;
           b = a % b;
           a = temp;
        }
        return a;
    }
}
