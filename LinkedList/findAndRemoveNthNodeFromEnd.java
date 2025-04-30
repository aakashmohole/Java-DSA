package LinkedList;

public class findAndRemoveNthNodeFromEnd  {
    public static void main(String[] args) {
        findAndRemoveNthNodeFromEnd ll = new findAndRemoveNthNodeFromEnd();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        ll.deleteNthFromEnd(2);
        ll.print();

    }

    public static  class Node{
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

    public static void print(){
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

    public void deleteNthFromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next; //remove first
            return;
        }

        //size - n
        int i =1;
        int iToFind = sz - n;
        Node prev = head;

        while (i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

    }
}
