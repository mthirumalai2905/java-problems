package Intermediate;

import LinkedLists.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeListNode(ListNode head, int val){
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;

        ListNode curr = dummy;
        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
