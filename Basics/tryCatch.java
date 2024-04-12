package Basics;

import java.io.IOException;

public class tryCatch {
    public static void main(String[] args) {
        try{
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.err.println("Error: Division by zero");
        } finally {
            System.out.println("Finally Block executed");
        }
    }

    public static int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Division by zero");
        }
        return a/b;
    }

    public void readFile(String fileName) throws IOException{
        
    }
}
