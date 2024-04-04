package Basics;
public class Leap {
    public static void main(String[] args) {
        int n = 2024;

        if(( n % 4 ==0 && n % 100 != 0) || n % 400 == 0){
            System.out.print("Its a Leap year");
        } else {
            System.out.print("Its not a leap year ");
        }
    }
}
