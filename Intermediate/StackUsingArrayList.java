package Intermediate;

import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack {
        private ArrayList<Integer> list;

        // Constructor to initialize the ArrayList
        public Stack() {
            list = new ArrayList<>();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1; // Return a sentinel value or throw an exception to indicate underflow
            }
            return list.remove(list.size() - 1);
        }

        public int peek() {
            if (isEmpty()) {
                return -1; // Return a sentinel value or throw an exception to indicate underflow
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
