import java.util.Arrays;

public class Distinct {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6};
        Arrays.stream(arr) // Creating a stream
              .distinct()  // Gets the distinct value
              .forEach(System.out::println); // Printing them out
    }
}
