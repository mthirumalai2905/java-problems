package Intermediate;

import LinkedLists.ListNode;

public class LinkedListCycle {
    public boolean LinkedListHasCycle(ListNode head){
       ListNode slow = head;
       ListNode fast = head;

       while(slow != null && fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
           }
       }
       return false;
    }
}
