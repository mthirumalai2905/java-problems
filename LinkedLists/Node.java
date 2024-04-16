package LinkedLists;


public class Node {
    public int value;
    public Node next;

    public Node(int val){
        this.value = val;
    }

    public static Node traverse(Node head){
          Node ptr = head;
          while( ptr != null){
            System.out.print(ptr.value + "->");
            ptr = ptr.next;
          }

          return head;
    }

    public  Node  insertAtBeginning(Node head, int valToInsert){
        Node newNode = new Node(valToInsert);

        newNode.next = head;
        head = newNode;

        return head;
    }

    public Node insertAtEnd(Node head, int valToInsert){
        Node newNode = new Node(valToInsert);

        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }

        ptr.next = newNode;
        newNode.next = null;

        return head;
    }

    public Node insertAtPosition(Node head,  int valToInsert, int position){
        Node newNode = new Node(valToInsert);

        Node ptr = head;
        for(int i = 0; i < position - 1; i++){
            ptr = ptr.next;
        }
       
        newNode.next = ptr.next;
        ptr.next = newNode;

        return head;
    }


    public Node deletionFromHead(Node head){
        head = head.next;

        return head;
    }

    public Node deletionFromEnd(Node head){
        Node ptr = head;
        while( ptr.next.next != null){
            ptr = ptr.next;
        }

        ptr.next = null;
        return head;
    }

    public Node deletionFromPosition(Node head, int position){
        Node ptr = head;
        for(int i = 0; i < position -1; i++){
            ptr = ptr.next;
        }

        Node nextNode = ptr.next.next;
        ptr.next = nextNode;

        return head;


    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

       // traverse(n1);
        
        // n1 = n1.insertAtBeginning(n1, 10);
        // traverse(n1);

        // n1 = n1.insertAtEnd(n1, 20);
        // traverse(n1);

        // n1 = n1.insertAtPosition(n1, 30, 1);
        // traverse(n1);

        // n1 = n1.deletionFromHead(n1);
        // traverse(n1);

          n1 = n1.deletionFromPosition(n1, 3);
          traverse(n1);
     
    }

}
