import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the String:- ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;


            left++;
            right--;
        }


        System.out.println(Arrays.toString(arr));


        for(String s : arr){
            System.out.print(s + " ");
        }
        sc.close();
    }
}
