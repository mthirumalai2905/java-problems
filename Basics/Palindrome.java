package Basics;
class Palindrome{
    public static void main(String[] args) {
        String str = "abbaabba";
        StringBuilder sb = new StringBuilder(str);
        String res = sb.reverse().toString();

        if(res.equals(str)){
            System.out.print("They are palindrome");
        } else {
            System.out.println("They are not palindrome");
        }
    }
}