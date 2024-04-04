package Basics;
public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int originalNumber = n;

        int size = String.valueOf(n).length();

        while( n!= 0){
             int res = n % 10;
             sum += (int) Math.pow(res,size);
             n /= 10;
        }

        if(sum == originalNumber){
            System.out.print("They are armstrong numbers");
        } else {
            System.out.print("They are not armstrong numbers");
        }
    }
}
