package Basics;
import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,3,3,3,2,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            System.out.println("Element " + key + "is repeated at frequency " + map.get(key));
        }
    }
}
