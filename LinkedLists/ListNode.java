package LinkedLists;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }

    public void traverse(ListNode head){ //You can keeo the parameter empty
        ListNode dummy = head; // initialize this with the this to point the curretn context
        while(dummy != null){
            System.out.print(dummy.val + "->");
            dummy = dummy.next;
        }
    }

    public ListNode insertAtBeginning(ListNode head, int valToInsert){
        //Create a node to insert
        ListNode newNode = new ListNode(valToInsert);

        //Assign the newNode to the next of this node to head
        newNode.next = head;

        //Point the head f the list to this new node
        head = newNode;

        return head;
    }

    public ListNode insertAtTheEnd(ListNode head, int valToInsert){
        //Create  a node to insert
        ListNode newNode = new ListNode(valToInsert);

        //Go to the end of the list
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = newNode;

        return head;
    }


    public ListNode insertAtPosition(ListNode head, int valToInsert, int position){
        //Create a node to start 
        ListNode newNode = new ListNode(valToInsert);

        //Move to the position
        ListNode ptr = head;
        for(int i =0; i < position; i++){
            ptr = ptr.next;
        }
        //Insert the node
        ptr.next = newNode;
        newNode.next = ptr.next;

        //Return the original head
        return head;
    }


    //It actually doesnt deletes the Node but JVM only understands the
    //LINKEDLISTS from the head only
    public ListNode deleteAtTheBeginning(ListNode head){
        head = head.next;
        return head;
    }

    public ListNode deletionAtTheEnd(ListNode head){
        ListNode ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;

        return head;

    }

    public ListNode deletionFromposition(ListNode head, int position){
        ListNode ptr = head;
        for(int i = 0; i < position - 1; i++){
            ptr = ptr.next;
        }

        //Getting the node to delete
        ListNode nodeToDelete = ptr.next;
        //Getting the next node to the deletion one node
        ListNode nextNode = nodeToDelete.next;
        //Connecting the previous of deletionnode to its next
        ptr.next = nextNode;

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(8);
        ListNode l3 = new ListNode(12);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        //Printing the values
        // ListNode ptr = l1;
        // while(ptr != null){
        //     System.out.print(ptr.val + "->");
        //     ptr = ptr.next;
        // }

       l1.traverse(l1);
    }
}
