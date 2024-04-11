package pattern;

public class Rhombus {
    public static void main(String[] args) {
         // Print upper half of the rhombus
         for(int i = 0; i < 5; i++){
            // Print spaces
            for(int j = 0; j < 4 - i; j++){
                System.out.print(" ");
            }
            // Print stars
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Print lower half of the rhombus
        for(int i = 0; i < 4; i++){
           
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            
            for(int k = 0; k < 4 - i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
