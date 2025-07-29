public class circularqueue{
    static int arr[];
    static int size;
    static int rear, front;
    public circularqueue(int n){ // constructor for circularqueue
        size = n;
        arr = new int[size];
        rear = -1;
        front = -1;
    }
    public static void add(int x){
        if((rear + 1) % size == front){
            System.out.println("Queue is full");
        }
        rear = (rear + 1)%size;
        arr[rear] = x;
        if(front == -1){
            front = 0;
        }
    }
    public static int remove(){
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        int removeddata = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front = (front + 1) % size;
        }
        return removeddata;
    }
    public static int peek(){
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public static void main(String args[]){
        circularqueue q = new circularqueue(3);
        q.add(10);
        q.add(20);
        q.add(30);
        while(q.peek() != -1){
            System.out.println("Element at front is: " + q.peek());
            System.out.println("Element removed is: " + q.remove());
        }
        
        // Testing circular nature
        q.add(40);
        q.add(50);
        q.add(60); // This should show "Queue is full" if the queue is full
        while(q.peek() != -1){
            System.out.println("Element at front is: " + q.peek());
            System.out.println("Element removed is: " + q.remove());
        }
    }
}