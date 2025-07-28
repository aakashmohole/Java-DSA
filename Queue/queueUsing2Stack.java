package Queue;

import java.util.Stack;

public class queueUsing2Stack {

    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add
        public static void add(int data){ //O(n)

            //remove all ele from s1 add in s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            // add elem in s2
            s2.push(data);

            // remove all ele form s2 and add in s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            //remove first ele
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            //get first ele
            return s1.peek();
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
