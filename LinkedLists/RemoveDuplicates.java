package LinkedLists;

public class RemoveDuplicates {
    public static void rmDups(Node head){
        Node current = head;

        while(current != null){
            Node runner = current;
            while(runner.next != null){
                if(runner.next.value == current.value){
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
