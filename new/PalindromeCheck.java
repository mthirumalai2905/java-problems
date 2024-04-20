public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "ababa";

        StringBuilder sb = new StringBuilder(str);
        String res = sb.reverse().toString();

        if(str.equals(res)){
            System.out.println("They are Palindrome");
        } else {
            System.out.println("They are not palindrome");
        }
    }
}
