package LinkedLists;

public class MergeTwoSortedLists {
    public static Node MergeLists(Node head1, Node head2){
        //Creating a Node for the new Resulting Linked Lists
        Node dummy = new Node(Integer.MIN_VALUE);
        // creating a head pointer
        Node head = dummy;

        // pointer for first List
        Node l1 = head1;
        //pointer for second List
        Node l2 = head2;

        //Looping inside the list
        while(l1 != null && l2 != null){
            //Compare the values
          if(l1.value < l2.value){
              //Add on the smaller values
             dummy.next = l1;
             l1 = l1.next;
          } else {
            dummy.next = l2;
            l2 = l2.next;
          }
            //Moving to the next of the resulting Linked List
          dummy = dummy.next;
        }

        // If a list terminates add to the resulting list
        if(l1 == null){
            dummy.next = l2;
        } else if (l2 == null){
            dummy.next = l1;
        }

        return head.next;
    }
}
