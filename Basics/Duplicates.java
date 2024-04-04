package Basics;
import java.util.ArrayList;
import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1,22,3,4,66,5,5,66,7,8};
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);
            } else {
                list.add(num);
            }
        }

        if(list.size() == 0){
            System.out.println("There are no duplicate elements in the corresponding array");
        } else {
            for(int num : list){
                System.out.println("The duplicated element is:- "+num);
            }
        }
    }
    
}
