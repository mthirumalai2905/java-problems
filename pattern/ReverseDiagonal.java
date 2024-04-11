package pattern;

public class ReverseDiagonal {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 4; i++){
            for(int j =4; j>= i; j--){
                
                if(count == 0 || count == 1 || count == 2 || count == 4 || count == 5 || count == 7){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                
                }
                count++;

            }
            System.out.println();
        }
    }
}
