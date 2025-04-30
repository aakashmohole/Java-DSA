package LinkedList;

public class detectCycleLL {
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(isCycle());

    }

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void print(){
        if(head == null){
            System.out.println("Empty LL ");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static boolean isCycle(){ //floyd's CFA 
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

}
