package LinkedList;

public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < size-1; i++) {
            temp = temp.next;
        }
        tail.next = newNode;
        tail.prev = temp;
        tail = newNode;

    }
    //print
    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "| <--> |");
            temp = temp.next;
        }
        System.out.print("null");
    }
    //remove - removeLast
    public static int removeFirst(){
        if(head == null){
            System.out.println("DLL Empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //removeLast
    public static int removeLast(){
        if(head == null){
            System.out.println("DLL Empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size-2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        tail = temp;
        temp.next = null;
        size--;
        return val;
    }

    //REVERSE
    public void reverse(){
        Node curr = head;
        Node prev= null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
        DoubleLL dll  = new DoubleLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(5);
        dll.reverse();
        print();
    }
}
