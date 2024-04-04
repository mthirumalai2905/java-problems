package Basics;
public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;
        String result = Integer.toBinaryString(n);
        System.out.println(result);
        int result2 = Integer.parseInt(result, 2);
        System.out.println(result2);
    }
}
