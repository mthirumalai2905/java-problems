package LinkedLists;

import java.util.Stack;

public class ReverseLinkedList {
    //OPTIMIZED
    public static Node ReverseList(Node head){
        //Edge cases
       if(head == null){
        return null;
       }
        //Edge cases
       if(head.next == null){
        return null;
       }

        //pointer before a head node
       Node preNode = null;
        //pointer at the head node
       Node currNode = head;

        //begin the loop
       while(currNode != null){
           //the third final pointer next to the current node
        Node nextNode = currNode.next;
           //for reversing connect the current node to the previous
        currNode.next = preNode;
           //take the previous Node to the current Node
        preNode = currNode;
           //take the current Node forwards
        currNode = nextNode;
       }

        //Move the head at the end for the final traversal to make it print the list in reverse
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
