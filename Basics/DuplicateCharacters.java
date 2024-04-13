package Basics;

public class DuplicateCharacters {
    public static String duplicate(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <str.length(); i++){
         char ch = str.charAt(i);
         sb.append(ch).append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String duplicatedString = duplicate(input);
        System.out.println(duplicatedString); // Output should be "hheelllloo"
    }
}
