package LinkedLists;

import java.util.Stack;

public class ReverseLinkedList {
    //OPTIMIZED
    public static Node ReverseList(Node head){
       if(head == null){
        return null;
       }
       if(head.next == null){
        return null;
       }

       Node preNode = null;
       Node currNode = head;

       while(currNode != null){
        Node nextNode = currNode.next;
        currNode.next = preNode;
        preNode = currNode;
        currNode = nextNode;
       }

       head = preNode;

       return head;
    }


    //BRUTE FORCE
    public static Node reverseWithStack(Node head){
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.value);
            head = head.next;
        }

        Node reversedList = new Node(Integer.MIN_VALUE);
        Node ptr = reversedList;

        while (!stack.isEmpty()) {
            ptr.next = new Node(stack.pop());
            ptr = ptr.next;
        }

        return reversedList.next;
    }
}
