package Intermediate;

import LinkedLists.ListNode;

public class IntersectionOfLinkedLists {
    public ListNode intersectionNode(ListNode headA, ListNode headB){
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

        while(lenA > lenB){
            lenA--;
            headA = headA.next;
        }
        while(lenB > lenA){
            lenB--;
            headB = headB.next;
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
            
        }

        return headA;
    }
    private int getListLength(ListNode head){
        int length = 0;
        ListNode ptr = head;
        while(ptr != null){
            length++;
            ptr = ptr.next;
        }
        return length;
    }
}
