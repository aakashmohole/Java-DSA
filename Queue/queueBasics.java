package Queue;

public class queueBasics {
    //implementation of queue using array
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }


        public static boolean isEmpty(){
            return rear == -1 ;
        }


        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full!");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue !");
                return -1;
            }
            //assign front to 0th index
            int front = arr[0];

            //change the element position and move backward by one position
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            //move rear to one pos backward
            rear = rear-1;
            return front;
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty Queue!");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
