public class Factorial {
    public static int facto(int n){
          if(n==0 || n == 1){
            return 1;
          }
          if(n < 1){
            return 1;
          }
          return n * facto(n-1);
    }
    public static void main(String[] args) {
        int n = 2;
        int res = facto(n);
        System.out.print(res);
    }
}
