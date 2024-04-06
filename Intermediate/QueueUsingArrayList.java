package Intermediate;

import java.util.ArrayList;

public class QueueUsingArrayList {
    static class Queue {
        private ArrayList<Integer> list;

       
        public Queue() {
            list = new ArrayList<>();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void enqueue(int data) {
            list.add(data);
        }

        public int dequeue() {
            if (isEmpty()) {
                return -1; 
            }
            return list.remove(0);
        }

        public int peek() {
            if (isEmpty()) {
                return -1; 
            }
            return list.get(0);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
