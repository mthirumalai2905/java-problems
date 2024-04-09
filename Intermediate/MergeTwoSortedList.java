package Intermediate;

import LinkedLists.ListNode;

public class MergeTwoSortedList {
    public ListNode SortedList(ListNode l1, ListNode l2){
        ListNode returnNode = new ListNode(Integer.MIN_VALUE); // Initializing with default constructor

        ListNode headNode = returnNode; // Correcting the variable name

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                returnNode.next = l1;
                l1 = l1.next;
            } else {
                returnNode.next = l2;
                l2 = l2.next;
            }
            returnNode = returnNode.next;
        }

        if(l1 == null){
            returnNode.next = l2;
        } else if (l2 == null){
            returnNode.next = l1;
        }

        return headNode.next; // Returning the next node of headNode
    }

    public static void main(String[] args) {
        // Creating two sorted linked lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // Merging two sorted linked lists
        MergeTwoSortedList merger = new MergeTwoSortedList();
        ListNode mergedList = merger.SortedList(l1, l2);

        // Printing the merged list
        System.out.println("Merged List:");
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
