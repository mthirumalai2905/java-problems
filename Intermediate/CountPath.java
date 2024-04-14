package Intermediate;

class CountPath{
    public static int path(int rows, int cols){
       if(rows == 1 || cols == 1){
        return 1;
       }
       if(rows <= 0 || cols <= 0){
        System.out.print("Please enter a number greater than 1");
       }
       return path(rows-1, cols) + path(rows,cols-1);
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int result = path(rows,cols);
        System.out.println(result);
    }
}