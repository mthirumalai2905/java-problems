package Basics;

public class Matrix {
    private static void printMatrix(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);

                if(j < arr[i].length - 1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
        int[][] arr3 = new int[arr1.length][arr2.length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Matrix 1:");
        printMatrix(arr1);

        System.out.println("Matrix 2:");
        printMatrix(arr2);

        System.out.println("Matrix 3:");
        printMatrix(arr3);

    }
    
}
