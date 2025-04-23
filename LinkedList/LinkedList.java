package LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(2, 3);
        ll.print();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println(itrSearch(3));
        System.out.println(itrSearch(6));

        System.out.println(recSearch(3));
        System.out.println(recSearch(6));

        ll.reverse();
        ll.print();

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

    //methods
    public void addFirst(int data){
        //step 1 create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 newNode next = head
        newNode.next = head;

        //step 3 head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int ind, int data){

        if(ind == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < ind-1){
            temp = temp.next;
            i++;
        }
        // i= ind-1 --> temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (size == 0){
            System.out.println("Empty Linked List!");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast (){
        if (size == 0){
            System.out.println("Empty Linked List!");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }

        //prev : i = size-2
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

// SEARCH METHODS
    public static int itrSearch(int key){
        Node temp = head;
        int i =0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
    }

    public static int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int ind = helper(head.next, key);
        if (ind == -1){
            return -1;
        }
        return ind+1;
    }
    public static int recSearch(int key){
        return helper(head, key);
    }

//REVERES
    public static void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev; //reverse done here
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}

