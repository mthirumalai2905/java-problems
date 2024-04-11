package Intermediate;

import LinkedLists.ListNode;

public class MiddleOfLinkedList {
    public ListNode middleOfList(ListNode head){
        ListNode first = head;
        ListNode second = head;

        while(second != null && second.next!= null){
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
}
