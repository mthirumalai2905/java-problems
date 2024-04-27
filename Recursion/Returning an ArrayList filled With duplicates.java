import java.util.ArrayList;

public class Minato {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        ArrayList<Integer> res = solve(arr,4);
        for(int num : res){
            System.out.print(num + " ");
        }
    }
   public static  ArrayList<Integer> solve(int[] arr, int target){
     ArrayList<Integer> list = new ArrayList<>();
     helper(arr, target, 0, list);
     return list;
   }
   public static void helper(int[] arr, int target, int index, ArrayList<Integer> list){
     if(index >= arr.length){
        return;
     }
     if(arr[index] == target){
        list.add(index);
     }
     helper(arr, target, index+1,list);
   }
}
