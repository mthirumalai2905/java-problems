package LinkedLists;


public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }

    public ListNode traverse(ListNode head){
        ListNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        return head;
    }

    public ListNode insertAtBeginning(ListNode head, int valToInsert){
        ListNode newNode = new ListNode(valToInsert);

        newNode.next = head;
        head = newNode;

        return head;
    }

    public ListNode insertAttheEnd(ListNode head, int valToInsert){
        ListNode ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }

        ListNode newNode = new ListNode(valToInsert);
        ptr.next = newNode;
        newNode.next = null;

        return head;
    }

    public ListNode insertAtthePosition(ListNode head, int valToInsert, int position){
        ListNode newNode  = new ListNode(valToInsert);
        ListNode ptr = head;
        for(int i = 0; i < position; i++){
            ptr = ptr.next;
        }
        ptr.next = newNode;
        newNode.next = ptr.next.next;

        return head;
    }

    public ListNode deletionFromTheBeginning(ListNode head){
        head = head.next;
        return head;
    }

    public ListNode deletionFromTheEnd(ListNode head){
        ListNode ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }

        ptr.next = null;

        return head;

    }

    public ListNode deletionFromThePosition(ListNode head, int position){
        ListNode ptr = head;
        for(int i = 0; i < position - 1; i++){
            ptr = ptr.next;
        }

        ListNode nextNode = ptr.next.next;

        ptr.next = nextNode;

        return head;
    }



    public static void main(String[] args){
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(8);
        ListNode l3 = new ListNode(12);
        ListNode l4 = new ListNode(16);
        ListNode l5 = new ListNode(20);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        // l1.traverse(l1);
        // l1 = l1.insertAtBeginning(l1, 2);
        // l1.traverse(l1);

        // l1 = l1.insertAttheEnd(l1, 24);
        // l1.traverse(l1);

        // l1 = l1.insertAtthePosition(l1, 20, 4);
        // l1.traverse(l1);

        // l1 = l1.deletionFromTheBeginning(l1);
        // l1.traverse(l1);

        // l1 = l1.deletionFromTheEnd(l1);
        // l1.traverse(l1);

        l1 = l1.deletionFromThePosition(l1, 3);
        l1.traverse(l1);
       

        
    }
}
