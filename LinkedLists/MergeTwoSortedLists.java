package LinkedLists;

public class MergeTwoSortedLists {
    public static Node MergeLists(Node head1, Node head2){
        Node dummy = new Node(Integer.MIN_VALUE);
        Node head = dummy;

        Node l1 = head1;
        Node l2 = head2;

        while(l1 != null && l2 != null){
          if(l1.value < l2.value){
             dummy.next = l1;
             l1 = l1.next;
          } else {
            dummy.next = l2;
            l2 = l2.next;
          }
          dummy = dummy.next;
        }

        if(l1 == null){
            dummy.next = l2;
        } else if (l2 == null){
            dummy.next = l1;
        }

        return head.next;
    }
}
