package Intermediate;

import LinkedLists.ListNode;

public class ReverseLinkedLists {
    public ListNode reverseWithoutExtraSpace(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode preNode = null;
        ListNode currNode = head;

        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = preNode; 
            preNode = currNode;
            currNode = nextNode;
        }

        head = preNode;

        return head;
    }

    void reversePrintUsingRecursion(ListNode head){
        //Terminating conditions
        if(head.next == null){
            return;
        }

        reversePrintUsingRecursion(head.next);

        //Actual Printing the value
        System.out.print(head.val);
    }

    public static void main(String[] args) {
        // Creating a linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Reversing the linked list
        ReverseLinkedLists reverser = new ReverseLinkedLists();
        ListNode reversedHead = reverser.reverseWithoutExtraSpace(head);

        // Printing the reversed list
        System.out.println("Reversed List:");
        while (reversedHead != null) {
            System.out.print(reversedHead.val + "->");
            reversedHead = reversedHead.next;
        }
    }
}
