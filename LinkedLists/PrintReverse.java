package LinkedLists;

import java.util.Stack;

public class PrintReverse {
    public static void  printUsingRecursion(Node head){
        // Terminatin Conditions
       if(head.next == null){
        return;
       }

       //Recursive Calls
       printUsingRecursion(head.next);

       //Actually printing the values
       System.out.print(head.value);
    }

    public static void printReverseUsingStack(Node head){
        Stack<Integer> stack = new Stack<>();

        while(head != null){
            stack.push(head.value);
            head = head.next;
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
