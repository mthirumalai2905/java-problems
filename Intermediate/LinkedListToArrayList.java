package Intermediate;

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("Bananna");
        linkedList.add("Orange");

        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        System.out.print(arrayList);
    }
}
