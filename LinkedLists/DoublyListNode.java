package LinkedLists;

public class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    public DoublyListNode(int val){
        this.val = val;
        prev = null;
        next = null;
    }

    public DoublyListNode forwardTraverse(DoublyListNode head){
        DoublyListNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.val);
            ptr = ptr.next;
        }
        return  head;
    }

    public DoublyListNode backwardTraverse(DoublyListNode head){
        DoublyListNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.val);
            ptr = ptr.prev;
        }
        return head;
    }
    
    public void insertAtBeginning(DoublyListNode node, int valToInsert){
        while (node.prev != null) {
            node = node.prev;
        }

        DoublyListNode temp = new DoublyListNode(valToInsert);
        temp.next = node;
        node.prev = temp;
    }

    public void insertAtEnd(DoublyListNode node, int valToInsert){
        while(node.next != null){
            node = node.next;
        }

        DoublyListNode temp = new DoublyListNode(valToInsert);
        temp.prev = node;
        node.next = temp;
    }

    public void insertAtthePosition(DoublyListNode node, int valToInsert, int pos){
        while(node.prev != null){
            node = node.prev;
        }
        for(int i = 1; i < pos; i++){
            node = node.next;
        }
        DoublyListNode temp = new DoublyListNode(valToInsert);
        temp.prev = node;
        temp.next = node.next;
        node.next.prev = temp;
        node.next = temp;
    }

    public void deleteFromBeginning(DoublyListNode node){

        //Go to Start
        while(node.prev != null){
            node = node.prev;
        }

        DoublyListNode temp = node.next;
        node.next = null;
        temp.prev = null;
    }

    public void deletionFromTheEnd(DoublyListNode node){
        //Go to End
        while(node.next != null){
            node = node.next;
        }

        DoublyListNode temp = node.prev;
        node.prev = null;
        temp.next = null;
    }

    public void deleteAtPosition(DoublyListNode node, int pos){
        //Go to start
        while(node.prev != null){
            node = node.prev;
        }

        //Go to position
        for(int i = 1; i < pos; i++){
            node = node.next;
        }

        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.next = null;
        node.prev = null;
    }
}
