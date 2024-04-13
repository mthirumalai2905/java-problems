package Basics;
public class Swap {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        System.out.println("Before sorting:-  ");
        System.out.print("a is:- "+ a + "\t");
        System.out.println("b is:-" + b);

        // Using Two variables
        // a = a ^ b;
        // b = b ^ a;
        // a = a ^ b;

        //Using Normal Approach
        // int temp = a;
        // a = b;
        // b = temp;

        System.out.println("After sorting:-  ");
        System.out.print("a is:- "+ a + "\t");
        System.out.print("b is:-" + b);
    
    }
    
}
